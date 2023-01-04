package com.emglab.qlsv.ui.fragments.criteria

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.emglab.qlsv.R
import com.emglab.qlsv.common.RetryCallback
import com.emglab.qlsv.databinding.TrainingPointFragmentBinding
import com.emglab.qlsv.di.Injectable
import com.emglab.qlsv.di.ViewModelFactory
import com.emglab.qlsv.extension.checkResource
import com.emglab.qlsv.models.entity.CriteriaReport
import com.emglab.qlsv.models.entity.Semester
import com.emglab.qlsv.models.entity.TrainingPoint
import com.emglab.qlsv.ui.viewmodels.criteria.TrainingPointViewModel
import com.github.mikephil.charting.components.Legend
import com.github.mikephil.charting.components.XAxis
import com.github.mikephil.charting.data.*
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import kotlinx.android.synthetic.main.training_point_fragment.*
import javax.inject.Inject


class TrainingPointFragment : Fragment(), Injectable {

    companion object {
        fun newInstance() = TrainingPointFragment()
    }

    private lateinit var viewModel: TrainingPointViewModel
    private lateinit var binding: TrainingPointFragmentBinding
    @Inject
    lateinit var factory: ViewModelFactory
    var semester: Semester? = null
    private var semesters: List<Semester> = listOf()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        setUpViewModel()
        binding = DataBindingUtil.inflate(inflater, R.layout.training_point_fragment, container, false)
        binding.apply {
            buttonSemester.setOnClickListener {
                chooseSemester()
            }

            buttonDetail.setOnClickListener {
                openCriteriaDetail()
            }

            callback1 = object : RetryCallback {
                override fun retry() {
                    viewModel.getListSemester()
                }
            }

            callback2 = object : RetryCallback {
                override fun retry() {
                    viewModel.getTrainingPoint()
                }
            }
            lineChart.setNoDataText("Không có dữ liệu")
            barChart.setNoDataText("Không có dữ liệu")
        }
        subscribeUI()
        return binding.root
    }

    private fun setLineChart(trainingPoints: List<TrainingPoint>){
        val entries: ArrayList<Entry> = arrayListOf()
        val xAxisLabels: ArrayList<String> = arrayListOf()
        trainingPoints.forEachIndexed{index, trainingPoint ->
            entries.add(Entry(index.toFloat(), trainingPoint.getPointFloat()))
            xAxisLabels.add(trainingPoint.semester)
        }

        val lineDataSet = LineDataSet(entries, "")

        val xAxis = binding.lineChart.xAxis
        xAxis.valueFormatter = IndexAxisValueFormatter(xAxisLabels)
        xAxis.position = XAxis.XAxisPosition.BOTTOM
        xAxis.setDrawGridLines(false)
        xAxis.labelCount = xAxisLabels.size
        xAxis.granularity = 1f

        binding.lineChart.axisRight.isEnabled = false


        binding.lineChart.apply {
            //
            axisLeft.spaceTop = 0.35f
            axisLeft.axisMinimum = 0f
            axisLeft.axisMaximum = 100f

            //
            description = null
            setNoDataText("Không có dữ liệu")

            //
            legend.isEnabled = false

            setScaleEnabled(false)
            setDrawGridBackground(false)
            axisLeft.setDrawGridLines(false)
            data = LineData(lineDataSet)
            data.notifyDataChanged()
            notifyDataSetChanged()
            invalidate()
        }
    }

    private fun setUpViewModel(){
        viewModel = ViewModelProvider(this, factory).get(TrainingPointViewModel::class.java)
    }

    private fun subscribeUI(){
        with(viewModel){
            userDetail.observe(viewLifecycleOwner, Observer {
                binding.resource2 = it
                if(checkResource(it) && it.data != null){
                    if(!it.data.trainingPoints.isNullOrEmpty()){
                        setLineChart(it.data.trainingPoints)
                    }
                }
            })
            semesters.observe(viewLifecycleOwner, Observer {
                binding.resource1 = it
                if(checkResource(it) && it.data != null){
                    this@TrainingPointFragment.semesters = it.data
                    if(it.data.isNotEmpty()){
                        setSemester(it.data.last())
                        binding.buttonSemester.visibility = View.VISIBLE
                        binding.buttonDetail.visibility = View.VISIBLE
                    }
                }
            })
            getSemester().observe(viewLifecycleOwner, Observer {
                semester = it
                binding.buttonSemester.text = "Kì ${it.name}"
            })
            criteriaReports.observe(viewLifecycleOwner, Observer {

                if (checkResource(it) && it.data != null){
                    if(it.data.isNotEmpty()){
                        showBarChart(it.data)
                    }
                }
            })
        }
    }

    private fun chooseSemester(){
        val semesterStr = semesters.map {
            it.name
        }
        MaterialAlertDialogBuilder(requireContext())
            .setTitle("Chọn kì học")
            .setItems(semesterStr.toTypedArray()) { dialog, which ->
                viewModel.setSemester(semesters[which])
            }
            .setNegativeButton("Hủy"){_, _ ->

            }.show()
    }

    private fun showBarChart(criteriaReports: List<CriteriaReport>){
        val labels: ArrayList<String> = arrayListOf()
        val studentBarEntries: ArrayList<BarEntry> = arrayListOf()
        val teacherBarEntries: ArrayList<BarEntry> = arrayListOf()

        var sumStudentPoint: Int = 0
        var sumTeacherPoint = 0
        criteriaReports.forEachIndexed { index, criteriaReport ->
            sumStudentPoint += criteriaReport.studentPoint
            studentBarEntries.add(BarEntry(index.toFloat(), criteriaReport.studentPoint.toFloat()))

            sumTeacherPoint += criteriaReport.teacherPoint
            teacherBarEntries.add(BarEntry(index.toFloat(), criteriaReport.teacherPoint.toFloat()))

            labels.add(criteriaReport.description)
        }
        val studentDataSet = BarDataSet(studentBarEntries, "SV chấm: $sumStudentPoint")
        studentDataSet.color = Color.parseColor("#F5B433")
        val teacherDataSet = BarDataSet(teacherBarEntries, "GV chấm: $sumTeacherPoint")
        teacherDataSet.color = Color.parseColor("#467F2D")

        val barData = BarData(listOf(studentDataSet, teacherDataSet))

        val groupSpace = 0.3f
        val barSpace = 0.05f
        val barWidth = 0.3f

        barData.barWidth = barWidth

        binding.barChart.apply {
            xAxis.valueFormatter = IndexAxisValueFormatter(labels)
            xAxis.setCenterAxisLabels(true)
            xAxis.granularity = 1f
            xAxis.position = XAxis.XAxisPosition.BOTTOM
            xAxis.setDrawGridLines(false)
            xAxis.axisMinimum = 0f
            xAxis.axisMaximum = criteriaReports.size.toFloat()

            //
            axisRight.isEnabled = false
            setNoDataText("Không có dữ liệu")

            //
            legend.horizontalAlignment = Legend.LegendHorizontalAlignment.RIGHT
            legend.verticalAlignment = Legend.LegendVerticalAlignment.TOP

            //
            axisLeft.setDrawGridLines(false)
            axisLeft.axisMinimum = 0f
            description = null
            notifyDataSetChanged()
            data = barData
            groupBars(0f, groupSpace, barSpace)
            invalidate()
            animateY(300)
        }
    }

    private fun openCriteriaDetail(){
        Navigation.findNavController(requireView()).navigate(TrainingPointFragmentDirections.actionTrainingPointFragmentToCriteriaFragment(semester!!,semesters.toTypedArray()))
    }

}