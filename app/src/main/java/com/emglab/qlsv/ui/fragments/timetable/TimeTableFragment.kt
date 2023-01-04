package com.emglab.qlsv.ui.fragments.timetable

import android.os.Bundle
import android.view.*
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.observe
import androidx.recyclerview.widget.LinearLayoutManager
import com.emglab.qlsv.R
import com.emglab.qlsv.databinding.TimeTableFragmentBinding
import com.emglab.qlsv.di.Injectable
import com.emglab.qlsv.di.ViewModelFactory
import com.emglab.qlsv.extension.checkResource
import com.emglab.qlsv.extension.toTimeQuery
import com.emglab.qlsv.models.entity.DayOfWeek
import com.emglab.qlsv.ui.adapter.timetable.DayOfWeekAdapter
import com.emglab.qlsv.ui.viewmodels.timetable.TimeTableViewModel
import com.google.firebase.ktx.Firebase
import com.google.firebase.remoteconfig.ktx.get
import com.google.firebase.remoteconfig.ktx.remoteConfig
import java.util.*
import javax.inject.Inject

class TimeTableFragment : Fragment(), Injectable {

    companion object {
        fun newInstance() = TimeTableFragment()
    }

    private lateinit var viewModel: TimeTableViewModel
    @Inject
    lateinit var factory: ViewModelFactory
    private lateinit var binding: TimeTableFragmentBinding
    private lateinit var dayOfWeekAdapter: DayOfWeekAdapter
    private var remoteConfig = Firebase.remoteConfig
    private lateinit var menu: Menu
    private var daysOfWeek = listOf<DayOfWeek>(DayOfWeek("Thứ 2"), DayOfWeek("Thứ 3"), DayOfWeek("Thứ 4"),DayOfWeek("Thứ 5"),DayOfWeek("Thứ 6"),DayOfWeek("Thứ 7"),DayOfWeek("*"))

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        setUpViewModel()
        setHasOptionsMenu(true)
        binding = DataBindingUtil.inflate(inflater, R.layout.time_table_fragment, container, false)

        dayOfWeekAdapter = DayOfWeekAdapter(listOf())
        binding.recyclerView.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = dayOfWeekAdapter
        }

        binding.callback = object : com.emglab.qlsv.common.RetryCallback {
            override fun retry() {
                viewModel.getTimeTable()
            }
        }

        subscribeUI()
        return binding.root
    }

    private fun setUpViewModel(){
        viewModel = ViewModelProvider(this, factory).get(TimeTableViewModel::class.java)
    }

    private fun subscribeUI(){
        with(viewModel){
            getTimeTable.observe(viewLifecycleOwner){
                binding.status = it.status
                if(checkResource(it)){
                    if(it.data != null){
                        daysOfWeek = listOf<DayOfWeek>(DayOfWeek("Thứ 2"), DayOfWeek("Thứ 3"), DayOfWeek("Thứ 4"),DayOfWeek("Thứ 5"),DayOfWeek("Thứ 6"),DayOfWeek("Thứ 7"),DayOfWeek("*"))
                        it.data.forEach{subject ->
                            daysOfWeek[subject.getDay()].subjects.add(subject)
                        }
                        dayOfWeekAdapter.daysOfWeek = daysOfWeek
                        dayOfWeekAdapter.notifyDataSetChanged()
                    }
                }
            }

            getTimetableOffline.observe(viewLifecycleOwner){
                if(it.isEmpty()){
                    getTimeTable()
                }else{
                    it.forEach{subject ->
                        daysOfWeek[subject.getDay()].subjects.add(subject)
                    }
                    dayOfWeekAdapter.daysOfWeek = daysOfWeek
                    dayOfWeekAdapter.notifyDataSetChanged()
                }
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_timetable, menu)
        val weeks = getCurrentWeek()
        menu.findItem(R.id.week).title = "Tuần $weeks"
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.reload -> {
                viewModel.getTimeTable()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun getCurrentWeek(): Long{
        val firstDay = remoteConfig["firstWeek"].asString().toTimeQuery()
        val diff: Long = Date().time - firstDay.time
        val seconds = diff / 1000
        val minutes = seconds / 60
        val hours = minutes / 60
        val days = hours / 24 + 1
        return days / 7 + 1
    }
}