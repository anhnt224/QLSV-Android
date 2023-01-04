package com.emglab.qlsv.ui.fragments.running

import android.Manifest
import android.annotation.SuppressLint
import android.app.Dialog
import android.content.pm.PackageManager
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.checkSelfPermission
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.observe
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.emglab.qlsv.R
import com.emglab.qlsv.dao.RunDataDao
import com.emglab.qlsv.databinding.RunDashboardFragmentBinding
import com.emglab.qlsv.di.Injectable
import com.emglab.qlsv.di.ViewModelFactory
import com.emglab.qlsv.extension.*
import com.emglab.qlsv.helper.SharedPrefsHelper
import com.emglab.qlsv.models.entity.run.RunData
import com.emglab.qlsv.models.entity.run.RunResult
import com.emglab.qlsv.ui.adapter.running.ListRunResultAdapter
import com.emglab.qlsv.ui.viewmodels.running.ChartType
import com.emglab.qlsv.ui.viewmodels.running.RunDashboardViewModel
import com.emglab.qlsv.utilities.runOnIoThread
import com.github.mikephil.charting.components.XAxis
import com.github.mikephil.charting.data.BarData
import com.github.mikephil.charting.data.BarDataSet
import com.github.mikephil.charting.data.BarEntry
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter
import com.github.mikephil.charting.highlight.Highlight
import com.github.mikephil.charting.listener.OnChartValueSelectedListener
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.run_dashboard_fragment.*
import java.util.*
import javax.inject.Inject


class RunDashboardFragment : Fragment(), Injectable {

    companion object {
        const val REQUEST_LOCATION_PERMISSION = 1001
        const val REQUEST_BACKGROUND_LOCATION_PERMISSION = 1002
    }

    private lateinit var viewModel: RunDashboardViewModel
    private lateinit var binding: RunDashboardFragmentBinding
    @Inject
    lateinit var factory: ViewModelFactory
    @Inject
    lateinit var sharedPrefsHelper: SharedPrefsHelper
    @Inject
    lateinit var runDataDao: RunDataDao

    private lateinit var runResultAdapter: ListRunResultAdapter
    private var chartType: ChartType = ChartType.BY_WEEK
    private var runDataList: List<RunData> = listOf()
    private lateinit var labelsWeek : ArrayList<String>
    private lateinit var labelsMonth : List<String>
    private lateinit var runDataGroup : Map<String, kotlin.collections.List<RunResult>>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.run_dashboard_fragment, container, false)
        setUpViewModel()
        setUpRecyclerView()

        chartType = ChartType.BY_WEEK
        initWeek()

        binding.apply {
            runButton.setOnClickListener {
                checkPermission()
            }

            nextButton.setOnClickListener {
                when(chartType){
                    ChartType.BY_WEEK -> increaseWeek()
                    ChartType.BY_MONTH -> increaseMonth()
                }
            }

            prevButton.setOnClickListener {
                when(chartType){
                    ChartType.BY_WEEK -> decreaseWeek()
                    ChartType.BY_MONTH -> decreaseMonth()
                }
            }

            syncButton.setOnClickListener {
                if (runDataList.isNotEmpty()){
                    viewModel.saveRunData(runDataList)
                }
            }

            barChart.setOnChartValueSelectedListener(object : OnChartValueSelectedListener {
                @SuppressLint("NotifyDataSetChanged")
                override fun onValueSelected(e: Entry?, h: Highlight?) {
                    e?.let {
                        var index = e.x.toInt()
                        val listDate = getDates(viewModel.getTimeStart(), viewModel.getTimeEnd())
                        val dateSelect = listDate[index]
                        val listData = runDataGroup[dateSelect.toDateStr()]
                        if (listData != null && listData.isNotEmpty()){
                            runResultAdapter.runResultMap = listData.groupBy { it.timeStart.getDateStr() }
                            runResultAdapter.notifyDataSetChanged()
                        }else{
                            runResultAdapter.runResultMap = mapOf()
                            runResultAdapter.notifyDataSetChanged()
                        }

                    }
                }

                override fun onNothingSelected() {
                    runResultAdapter.runResultMap = runDataGroup
                    runResultAdapter.notifyDataSetChanged()
                }
            })

            chartTypeTabLayout.addOnTabSelectedListener(object: TabLayout.OnTabSelectedListener {
                override fun onTabSelected(tab: TabLayout.Tab) {
                    when(tab.position){
                        0 -> {
                            chartType = ChartType.BY_WEEK
                            initWeek()
                        }
                        1 -> {
                            chartType = ChartType.BY_MONTH
                            initMonth()
                        }
                    }
                }

                override fun onTabUnselected(tab: TabLayout.Tab?) {

                }

                override fun onTabReselected(tab: TabLayout.Tab?) {

                }

            })

        }

        subscribeUI()
        return binding.root
    }


    @SuppressLint("NotifyDataSetChanged", "SetTextI18n")
    private fun subscribeUI(){
        with(viewModel){
            runResultList.observe(viewLifecycleOwner) { resource ->
                if (checkResource(resource) && resource.data != null) {
                    statisticRunResult(resource.data)
                }
            }

            saveRunData.observe(viewLifecycleOwner){
                if (checkResource(it)){
                    showToast("Đồng bộ thành công")
                    clearRunData()
                }
            }

            getRunResults().observe(viewLifecycleOwner){
                Log.d("_RUN_DATE", "$it")
                if (it.isEmpty()){
                    syncWarningLayout.visibility = View.GONE
                }else{
                    runDataList = it
                    syncWarningLayout.visibility = View.VISIBLE
                    val runDataMap = it.groupBy { runData ->
                        runData.comIdInRoom
                    }
                    syncTitle.text = "Bạn có ${runDataMap.keys.size} cuộc chạy chưa được đồng bộ." +
                            " Bạn cần đồng bộ để tránh mất dữ liệu."
                }
            }
        }
    }

    private fun setUpViewModel(){
        viewModel = ViewModelProvider(this, factory).get(RunDashboardViewModel::class.java)
    }

    private fun clearRunData(){
        runOnIoThread {
            runDataDao.deleteAll()
        }
    }

    private fun setUpRecyclerView(){
        runResultAdapter = ListRunResultAdapter(mapOf())
        binding.recyclerView.apply {
            adapter = runResultAdapter
            layoutManager = LinearLayoutManager(requireContext())
        }
    }

    @SuppressLint("NotifyDataSetChanged", "SetTextI18n")
    private fun statisticRunResult(runResults: List<RunResult>){
        var totalDistance = 0.0
        var totalDistanceValid = 0.0
        runResults.forEach {
            totalDistance += it.distance
            if (it.isValid()){
                totalDistanceValid += it.distance
            }
        }

        binding.apply {
            if (totalDistance > 100){
                totalDistanceTextView.text = String.format("%.2f/%.2f", totalDistanceValid/1000, totalDistance / 1000)
                distanceUnitTextView.text = "km"
            }else{
                totalDistanceTextView.text = String.format("%.0f/%.0f", totalDistanceValid, totalDistance)
                distanceUnitTextView.text = "m"
            }
        }

        when(chartType){
            ChartType.BY_MONTH -> showBarChartByMonth(runResults)
            ChartType.BY_WEEK -> showBarChartByWeek(runResults)
        }

        val runResultsMap = runResults.groupBy {
            it.timeStart.toDateStr()
        }
        runDataGroup = runResultsMap
        runResultAdapter.runResultMap = runResultsMap
        runResultAdapter.notifyDataSetChanged()
    }

    private fun getDates(date1: Date?, date2: Date?): List<Date> {
        var dates: ArrayList<Date> = arrayListOf()
        if (date1 != null && date2 != null){
            val cal1 = Calendar.getInstance()
            cal1.time = date1
            val cal2 = Calendar.getInstance()
            cal2.time = date2
            while (!cal1.after(cal2)) {
                dates.add(cal1.time)
                cal1.add(Calendar.DATE, 1)
            }
        }
        return dates
    }
    private fun showBarChartByWeek(runResults: List<RunResult>){
        labelsWeek = arrayListOf("T2", "T3", "T4", "T5", "T6", "T7", "CN")
        val runResultEntriesInvalid: ArrayList<BarEntry> = arrayListOf()
        val runResultEntriesValid: ArrayList<BarEntry> = arrayListOf()

        val runResultsMap = runResults.groupBy {
            it.timeStartToDateOfWeek()
        }

        labelsWeek.forEachIndexed { index, s ->
            val runResultList = runResultsMap[s]
            if(runResultList == null){
                runResultEntriesInvalid.add(BarEntry((index + 0.5).toFloat(), 0f))
                runResultEntriesValid.add(BarEntry((index + 0.5).toFloat(), 0f))
            }else{
                var totalDistanceInvalid = 0.0
                var totalDistanceValid = 0.0
                runResultList.forEach {
                    if (it.isValid()){
                        totalDistanceValid += it.distance / 1000
                    }else{
                        totalDistanceInvalid += it.distance / 1000
                    }
                }
                runResultEntriesInvalid.add(BarEntry((index + 0.5 ).toFloat(), totalDistanceInvalid.toFloat()))
                runResultEntriesValid.add(BarEntry((index + 0.5).toFloat(), totalDistanceValid.toFloat()+ totalDistanceInvalid.toFloat()))
            }
        }


        val set1 = BarDataSet(runResultEntriesInvalid, "Không hợp lệ")
        set1.label = "Không hợp lệ"
        set1.setColors(ContextCompat.getColor(requireContext(),R.color.colorRunDashBoardFail))

        val set2 = BarDataSet(runResultEntriesValid, "Hợp lệ")
        set2.label = "Hợp lệ"
        set2.setColors(ContextCompat.getColor(requireContext(),R.color.colorRunDashBoardPass))

        val data = BarData(listOf(set2,set1))
        data.setDrawValues(false)
        binding.barChart.data = data

        binding.barChart.apply {
            xAxis.valueFormatter = object: IndexAxisValueFormatter() {
                override fun getFormattedValue(value: Float): String {
                    if(0 <= value && value <= labelsWeek.size - 1){
                        return labelsWeek[value.toInt()]
                    }
                    return ""
                }
            }
            xAxis.setCenterAxisLabels(true)
            xAxis.granularity = 1f
            xAxis.position = XAxis.XAxisPosition.BOTTOM
            xAxis.setDrawGridLines(false)
            xAxis.axisMinimum = 0f

            //
            axisRight.isEnabled = false
            setNoDataText("Không có dữ liệu")

            axisLeft.setDrawGridLines(false)
            axisLeft.axisMinimum = 0f
            description = null
            //getData().isHighlightEnabled = !data.isHighlightEnabled
            notifyDataSetChanged()
            invalidate()
            animateY(300)
            barChart.highlightValue(null)
        }
    }

    private fun showBarChartByMonth(runResults: List<RunResult>){
        val timeStart = viewModel.getTimeStart()
        val timeEnd = viewModel.getTimeEnd()
        if(timeStart == null || timeEnd == null){
            return
        }

        labelsMonth = (1..(timeEnd.getDayOfMonth())).map {
            it.toString()
        }

        Log.d("_BAR_CHART", labelsMonth.toString())

        val runResultEntriesInvalid: ArrayList<BarEntry> = arrayListOf()
        val runResultEntriesValid: ArrayList<BarEntry> = arrayListOf()

        val runResultsMap = runResults.groupBy {
            it.timeStart.getDayOfMonth().toString()
        }

        labelsMonth.forEachIndexed { index, s ->
            val runResultList = runResultsMap[s]
            if(runResultList == null){
                runResultEntriesInvalid.add(BarEntry((index).toFloat(), 0f))
                runResultEntriesValid.add(BarEntry((index).toFloat(), 0f))
            }else{
                var totalDistanceInvalid = 0.0
                var totalDistanceValid = 0.0
                runResultList.forEach {
                    if (it.isValid()){
                        totalDistanceValid += it.distance / 1000
                    }else{
                        totalDistanceInvalid += it.distance / 1000
                    }
                }

                runResultEntriesInvalid.add( BarEntry((index).toFloat(), totalDistanceInvalid.toFloat() + totalDistanceValid.toFloat() ))
                runResultEntriesValid.add( BarEntry((index).toFloat(), totalDistanceValid.toFloat() ))

            }
        }


        binding.barChart.apply {
            highlightValue(null)
            val set1 = BarDataSet(runResultEntriesInvalid, "Không hợp lệ")
            set1.label = "Không hợp lệ"
            set1.setColors(ContextCompat.getColor(requireContext(),R.color.colorRunDashBoardFail))

            val set2 = BarDataSet(runResultEntriesValid, "Hợp lệ")
            set2.label = "Hợp lệ"
            set2.setColors(ContextCompat.getColor(requireContext(),R.color.colorRunDashBoardPass))

            val data = BarData(listOf(set1, set2))
            data.setDrawValues(false)

            binding.barChart.data = data

            xAxis.position = XAxis.XAxisPosition.BOTTOM
            xAxis.setDrawGridLines(false)
            xAxis.mAxisMinimum = 1f
            xAxis.setCenterAxisLabels(false)

            xAxis.valueFormatter = object: IndexAxisValueFormatter() {
                override fun getFormattedValue(value: Float): String {
                    if(0 <= value && value <= labelsMonth.size - 1){
                        return labelsMonth[value.toInt()]
                    }
                    return ""
                }
            }

            //
            axisRight.isEnabled = false
            setNoDataText("Không có dữ liệu")
            axisLeft.setDrawGridLines(false)
            axisLeft.axisMinimum = 0f
            description = null
            //getData().isHighlightEnabled = !data.isHighlightEnabled
            notifyDataSetChanged()
            invalidate()
            animateY(300)

            barChart.highlightValue(null)
        }
    }

    @SuppressLint("SetTextI18n")
    private fun initWeek(){
        // get today and clear time of day
        val cal = Calendar.getInstance()

        cal[Calendar.HOUR_OF_DAY] = 0
        cal.clear(Calendar.MINUTE)
        cal.clear(Calendar.SECOND)
        cal.clear(Calendar.MILLISECOND)

        // get start of this week in milliseconds
        cal[Calendar.DAY_OF_WEEK] = cal.firstDayOfWeek

        val timeStart = cal.time
        // End of week
        cal.add(Calendar.WEEK_OF_YEAR, 1)
        cal.add(Calendar.SECOND, -1)

        val timeEnd = cal.time

        binding.timeRangeTextView.text = "${timeStart.getMonthDayStr()} - ${timeEnd.getDateStr()}"
        viewModel.setTime(timeStart, timeEnd)
    }

    @SuppressLint("SetTextI18n")
    private fun decreaseWeek(){
        val firstDayOfCurrentWeek = viewModel.getTimeStart() ?: return

        val cal = Calendar.getInstance()
        cal.time = firstDayOfCurrentWeek

        //decrease 1 week
        cal.add(Calendar.WEEK_OF_YEAR, - 1)

        cal[Calendar.HOUR_OF_DAY] = 0
        cal.clear(Calendar.MINUTE)
        cal.clear(Calendar.SECOND)
        cal.clear(Calendar.MILLISECOND)

        val timeStart = cal.time

        // End of week
        cal.add(Calendar.WEEK_OF_YEAR, 1)
        cal.add(Calendar.SECOND, -1)

        val timeEnd = cal.time

        binding.timeRangeTextView.text = "${timeStart.getMonthDayStr()} - ${timeEnd.getDateStr()}"
        viewModel.setTime(timeStart, timeEnd)
    }

    @SuppressLint("SetTextI18n")
    private fun increaseWeek(){
        val firstDayOfCurrentWeek = viewModel.getTimeStart() ?: return

        val cal = Calendar.getInstance()
        cal.time = firstDayOfCurrentWeek

        //increase 1 week
        cal.add(Calendar.WEEK_OF_YEAR, 1)

        cal[Calendar.HOUR_OF_DAY] = 0
        cal.clear(Calendar.MINUTE)
        cal.clear(Calendar.SECOND)
        cal.clear(Calendar.MILLISECOND)

        val timeStart = cal.time

        // End of week
        cal.add(Calendar.WEEK_OF_YEAR, 1)
        cal.add(Calendar.SECOND, -1)
        val timeEnd = cal.time

        binding.timeRangeTextView.text = "${timeStart.getMonthDayStr()} - ${timeEnd.getDateStr()}"
        viewModel.setTime(timeStart, timeEnd)
    }

    @SuppressLint("SetTextI18n")
    private fun initMonth(){
        // get today and clear time of day
        val cal = Calendar.getInstance()

        cal[Calendar.HOUR_OF_DAY] = 0
        cal.clear(Calendar.MINUTE)
        cal.clear(Calendar.SECOND)
        cal.clear(Calendar.MILLISECOND)

        cal[Calendar.DAY_OF_MONTH] = 1

        val timeStart = cal.time
        // End of week
        cal.add(Calendar.MONTH, 1)
        cal.add(Calendar.SECOND, -1)

        val timeEnd = cal.time

        binding.timeRangeTextView.text = "${timeStart.getMonthDayStr()} - ${timeEnd.getDateStr()}"
        viewModel.setTime(timeStart, timeEnd)
    }

    @SuppressLint("SetTextI18n")
    private fun decreaseMonth(){
        val firstDayOfCurrentWeek = viewModel.getTimeStart() ?: return

        val cal = Calendar.getInstance()
        cal.time = firstDayOfCurrentWeek

        //decrease 1 week
        cal.add(Calendar.MONTH, - 1)

        cal[Calendar.HOUR_OF_DAY] = 0
        cal.clear(Calendar.MINUTE)
        cal.clear(Calendar.SECOND)
        cal.clear(Calendar.MILLISECOND)

        val timeStart = cal.time

        // End of week
        cal.add(Calendar.MONTH, 1)
        cal.add(Calendar.SECOND, -1)

        val timeEnd = cal.time

        binding.timeRangeTextView.text = "${timeStart.getMonthDayStr()} - ${timeEnd.getDateStr()}"
        viewModel.setTime(timeStart, timeEnd)
    }

    @SuppressLint("SetTextI18n")
    private fun increaseMonth(){
        val firstDayOfCurrentWeek = viewModel.getTimeStart() ?: return

        val cal = Calendar.getInstance()
        cal.time = firstDayOfCurrentWeek

        //increase 1 week
        cal.add(Calendar.MONTH, 1)

        cal[Calendar.HOUR_OF_DAY] = 0
        cal.clear(Calendar.MINUTE)
        cal.clear(Calendar.SECOND)
        cal.clear(Calendar.MILLISECOND)

        val timeStart = cal.time

        // End of week
        cal.add(Calendar.MONTH, 1)
        cal.add(Calendar.SECOND, -1)
        val timeEnd = cal.time

        binding.timeRangeTextView.text = "${timeStart.getMonthDayStr()} - ${timeEnd.getDateStr()}"
        viewModel.setTime(timeStart, timeEnd)
    }

    /**
     * Check permission
     */
    private fun checkPermission(){
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q){
            if(isPermissionDenied(Manifest.permission.ACCESS_BACKGROUND_LOCATION)){
                if(
                    isPermissionDenied(Manifest.permission.ACCESS_FINE_LOCATION) &&
                    isPermissionDenied(Manifest.permission.ACCESS_COARSE_LOCATION)
                ){
                    showDialogRequestLocationPermission()
                }else{
                    showDialogRequestBackgroundLocation()
                }
            }else{
                handleRun()
            }

        }else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
            if(
                isPermissionDenied(Manifest.permission.ACCESS_FINE_LOCATION) &&
                isPermissionDenied(Manifest.permission.ACCESS_COARSE_LOCATION)
            ){
                showDialogRequestLocationPermission()
            }else{
                handleRun()
            }
        }else{
            handleRun()
        }
    }

    private fun isPermissionDenied(permission: String): Boolean{
        return checkSelfPermission(
            requireContext(),
            permission
        ) == PackageManager.PERMISSION_DENIED
    }

    private fun showDialogRequestLocationPermission(){
        val dialog = Dialog(requireContext())
        dialog.setContentView(R.layout.request_permission_dialog)
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.window?.setLayout(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )

        val doneButton = dialog.findViewById<Button>(R.id.doneButton)
        doneButton.setOnClickListener {
            dialog.dismiss()
            requestLocationPermission()
        }

        val cancelButton = dialog.findViewById<Button>(R.id.cancelButton)
        cancelButton.setOnClickListener {
            dialog.dismiss()
        }

        dialog.setCancelable(false)
        dialog.show()
    }

    private fun requestLocationPermission(){
        val permissions = arrayOf(
            Manifest.permission.ACCESS_COARSE_LOCATION,
            Manifest.permission.ACCESS_FINE_LOCATION
        )

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            requestPermissions(permissions, REQUEST_LOCATION_PERMISSION)
        }
    }

    private fun showDialogRequestBackgroundLocation(){
        val dialog = Dialog(requireContext())
        dialog.setContentView(R.layout.request_bg_location_permission)
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.window?.setLayout(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )

        val doneButton = dialog.findViewById<Button>(R.id.doneButton)
        doneButton.setOnClickListener {
            dialog.dismiss()
            requestLocationBackgroundPermission()
        }

        val cancelButton = dialog.findViewById<Button>(R.id.cancelButton)
        cancelButton.setOnClickListener {
            dialog.dismiss()
        }

        dialog.setCancelable(false)
        dialog.show()
    }

    private fun requestLocationBackgroundPermission(){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            val permissions = arrayOf(
                Manifest.permission.ACCESS_BACKGROUND_LOCATION
            )
            requestPermissions(permissions, REQUEST_BACKGROUND_LOCATION_PERMISSION)
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        when(requestCode){
            REQUEST_LOCATION_PERMISSION -> {
                if(grantResults[0] == PackageManager.PERMISSION_GRANTED){
                    if (Build.VERSION.SDK_INT < Build.VERSION_CODES.Q){
                        handleRun()
                    }else{
                        showDialogRequestBackgroundLocation()
                    }
                }
            }
            REQUEST_BACKGROUND_LOCATION_PERMISSION -> {
                if(grantResults[0] == PackageManager.PERMISSION_GRANTED){
                    handleRun()
                }
            }
            else -> super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        }
    }

    private fun handleRun(){
        if(sharedPrefsHelper.getEmail().contains("@hust.edu.vn")){
            // is teacher
            Navigation.findNavController(requireView())
                .navigate(
                    R.id.action_runDashboardFragment2_to_runFragment2
                )
        }else{
            // is student
            Navigation.findNavController(requireView())
                .navigate(
                    R.id.action_runDashboardFragment_to_runFragment
                )
        }


    }

    /*private fun convertListRunResultToListListRunResult(): List<List<RunResult>>{
        var runResults: List<RunResult> = listOf()
        var runResultsMap = runResults.groupBy {
            it.timeStart.toDateStr()
        }
        return listListRunResult
    }*/

}