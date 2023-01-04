package com.emglab.qlsv.teacher.fragment.student

import android.content.Intent
import android.net.Uri
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.observe
import androidx.navigation.Navigation
import com.emglab.qlsv.R
import com.emglab.qlsv.common.RetryCallback
import com.emglab.qlsv.databinding.StudentInfoFragmentBinding
import com.emglab.qlsv.di.Injectable
import com.emglab.qlsv.di.ViewModelFactory
import com.emglab.qlsv.extension.checkResource
import com.emglab.qlsv.models.entity.CriteriaScore
import com.emglab.qlsv.models.entity.StudentInfo
import com.emglab.qlsv.teacher.viewmodel.student.StudentInfoViewModel
import com.github.mikephil.charting.components.XAxis
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import javax.inject.Inject

class StudentInfoFragment : Fragment(), Injectable {
    @Inject
    lateinit var factory: ViewModelFactory
    private lateinit var viewModel: StudentInfoViewModel
    private lateinit var binding: StudentInfoFragmentBinding
    private var studentInfo = StudentInfo()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        setUpViewModel()
        setHasOptionsMenu(true)
        binding = DataBindingUtil.inflate(inflater, R.layout.student_info_fragment, container, false)

        val studentID = StudentInfoFragmentArgs.fromBundle(requireArguments()).studentId
        viewModel.getStudentInfo(studentID)

        binding.callback = object : RetryCallback {
            override fun retry() {
                viewModel.getStudentInfo(studentID)
            }
        }

        binding.apply {
            lineChart.setNoDataText("Không có dữ liệu")
            viewNote.setOnClickListener {
                showListStudentNotes()
            }
        }

        subscribeUI()
        return binding.root
    }

    private fun setUpViewModel(){
        viewModel = ViewModelProvider(this, factory).get(StudentInfoViewModel::class.java)
    }

    private fun subscribeUI(){
        with(viewModel){
            studentInfo.observe(viewLifecycleOwner){
                binding.status = it.status
                if(checkResource(it) && it.data != null){
                    binding.studentInfo = it.data
                    this@StudentInfoFragment.studentInfo = it.data
                    setLineChart(it.data.criteriaScore)
                }
            }
        }
    }

    private fun setLineChart(trainingPoints: List<CriteriaScore>){
        val entries: ArrayList<Entry> = arrayListOf()
        val xAxisLabels: ArrayList<String> = arrayListOf()
        trainingPoints.forEachIndexed{index, trainingPoint ->
            entries.add(Entry(index.toFloat(), trainingPoint.getScoreFloat()))
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

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_student_info, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.contact -> {
                contactStudent()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun contactStudent(){
        val dialog = MaterialAlertDialogBuilder(requireContext())
            .setTitle("Liên hệ sinh viên, phụ huynh")
            .setPositiveButton("Gửi mail"){_, _ ->
                sendEmail(studentInfo.email)
            }.setNeutralButton("Huỷ"){_, _ ->

            }

        when {
            studentInfo.fatherPhone.isNotEmpty() -> {
                dialog.setNegativeButton("Liên hệ phụ huynh"){_,_ ->
                    makePhoneCall(studentInfo.fatherPhone)
                }
            }
            studentInfo.motherPhone.isNotEmpty() -> {
                dialog.setNegativeButton("Liên hệ phụ huynh"){_,_ ->
                    makePhoneCall(studentInfo.motherPhone)
                }
            }
        }

        dialog.show()
    }

    private fun sendEmail(email: String) {
        val emailIntent = Intent(Intent.ACTION_SENDTO, Uri.fromParts(
            "mailto", email, null))
        startActivity(Intent.createChooser(emailIntent, ""))
    }

    private fun makePhoneCall(number: String) {
        try {
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$number"))
            startActivity(intent)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    /**
     *
     */
    fun showListStudentNotes(){
        Navigation.findNavController(requireView()).navigate(
            StudentInfoFragmentDirections.actionStudentInfoFragmentToTStudentNoteFragment(studentInfo.id)
        )
    }

}