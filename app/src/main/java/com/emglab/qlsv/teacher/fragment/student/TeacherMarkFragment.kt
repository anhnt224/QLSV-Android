package com.emglab.qlsv.teacher.fragment.student

import android.annotation.SuppressLint
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.observe
import androidx.recyclerview.widget.LinearLayoutManager
import com.emglab.qlsv.R
import com.emglab.qlsv.databinding.TeacherMarkFragmentBinding
import com.emglab.qlsv.di.Injectable
import com.emglab.qlsv.di.ViewModelFactory
import com.emglab.qlsv.extension.checkResource
import com.emglab.qlsv.extension.showToast
import com.emglab.qlsv.models.entity.CriteriaType
import com.emglab.qlsv.models.entity.UserCriteriaDetail
import com.emglab.qlsv.teacher.adapters.StudentCriteriaAdapter
import com.emglab.qlsv.teacher.adapters.StudentCriteriaGroupAdapter
import com.emglab.qlsv.teacher.viewmodel.student.TeacherMarkViewModel
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import kotlinx.android.synthetic.main.criteria_fragment.*
import javax.inject.Inject

@SuppressLint("SetTextI18n")
class TeacherMarkFragment : Fragment(), Injectable, StudentCriteriaAdapter.OnItemClickListener {

    private lateinit var viewModel: TeacherMarkViewModel
    @Inject lateinit var factory: ViewModelFactory

    private lateinit var binding: TeacherMarkFragmentBinding
    private var criteriaTypes: List<CriteriaType> = listOf()
    private var index: Int = 0
    private lateinit var studentCriteriaGroupAdapter: StudentCriteriaGroupAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        setUpViewModel()
        setHasOptionsMenu(true)
        binding = DataBindingUtil.inflate(inflater, R.layout.teacher_mark_fragment, container, false)

        val args = TeacherMarkFragmentArgs.fromBundle(requireArguments())
        viewModel.getListCriteriaTypes(args.semester, args.studentId)

        val semester = TeacherMarkFragmentArgs.fromBundle(requireArguments()).semester
        binding.buttonSemester.text = "Kì $semester"

        studentCriteriaGroupAdapter = StudentCriteriaGroupAdapter(listOf(), this)

        binding.apply {
            recyclerView.apply {
                adapter = studentCriteriaGroupAdapter
                layoutManager = LinearLayoutManager(context)
            }

            buttonNext.setOnClickListener {
                if(index < criteriaTypes.size - 1){
                    index ++
                    buttonPrev.isEnabled = true
                    buttonNext.isEnabled = index < criteriaTypes.size - 1
                    criteriaType = criteriaTypes[index]
                    updateData(criteriaTypes[index])
                }
            }

            buttonPrev.setOnClickListener {
                if (index > 0){
                    index --
                    buttonNext.isEnabled = true
                    buttonPrev.isEnabled = index > 0
                    criteriaType = criteriaTypes[index]
                    updateData(criteriaTypes[index])
                }
            }
            buttonClose.setOnClickListener {
                layoutProof.visibility = View.GONE
            }

            buttonSave.setOnClickListener {
                viewModel.markCriteriaUser(semester, studentID = args.studentId, criteriaTypes = criteriaTypes)
            }
        }

        subscribeUI()
        return binding.root
    }

    private fun setUpViewModel(){
        viewModel = ViewModelProvider(this, factory).get(TeacherMarkViewModel::class.java)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_teacher_mark, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.paste -> {
                handlePasteScore()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun handlePasteScore(){
        criteriaTypes.forEach {criteriaType ->
            criteriaType.criteriaGroups.forEach{criteriaGroup ->
                criteriaGroup.userCriteriaDetails.forEach{
                    if(it.tPoint < it.sPoint){
                        it.tPoint = it.sPoint
                    }
                }
            }
        }

        val sumSPoint = getSumSPoint()
        binding.apply {
            buttonSave.visibility = View.VISIBLE
            buttonSave.text = "Lưu, $sumSPoint điểm"
            textSumTPoint.text = "GV chấm: $sumSPoint"
            textCriteriaTypePoint.text = "GV: ${criteriaTypes[index].getTeacherScore()}/${criteriaTypes[index].maxPoint}"
        }
    }

    @SuppressLint("SetTextI18n")
    private fun subscribeUI(){
        with(viewModel){
            criteriaTypes.observe(viewLifecycleOwner){
                binding.status = it.status
                if(checkResource(it)){
                    if(!it.data.isNullOrEmpty()){
                        this@TeacherMarkFragment.criteriaTypes = it.data
                        buttonNext.isEnabled = true
                        binding.criteriaType = this@TeacherMarkFragment.criteriaTypes[index]
                        updateData(it.data[index])

                        var sumSPoint = 0
                        var sumTPoint = 0
                        it.data.forEach {criteriaType ->
                            sumSPoint += criteriaType.sPoint
                            sumTPoint += criteriaType.tPoint
                        }
                        binding.textSumSPoint.text = "SV chấm: $sumSPoint"
                        binding.textSumTPoint.text = "GV chấm: $sumTPoint"
                        binding.buttonSave.visibility = View.GONE
                    }
                }
            }

            markCriteriaUser.observe(viewLifecycleOwner, Observer {
                binding.status = it.status
                if(checkResource(it)){
                    showToast("Chấm điểm thành công")
                    buttonSave.visibility = View.GONE
                }else{
                    buttonSave.visibility = View.VISIBLE
                }
            })
        }
    }

    private fun updateData(criteriaType: CriteriaType){
        studentCriteriaGroupAdapter.criteriaGroups = criteriaType.criteriaGroups
        studentCriteriaGroupAdapter.notifyDataSetChanged()
    }

    override fun onScoreChanged() {
        val sumSPoint = getSumSPoint()
        binding.apply {
            buttonSave.visibility = View.VISIBLE
            buttonSave.text = "Lưu, $sumSPoint điểm"
            textSumTPoint.text = "GV chấm: $sumSPoint"
            textCriteriaTypePoint.text = "GV: ${criteriaTypes[index].getTeacherScore()}/${criteriaTypes[index].maxPoint}"
        }
    }

    private fun getSumSPoint():Int{
        var sumSPoint = 0
        criteriaTypes.forEach {criteriaType ->
            criteriaType.criteriaGroups.forEach {criteriaGroup ->
                criteriaGroup.userCriteriaDetails.forEach {
                    sumSPoint += it.tPoint
                }
            }
        }
        return sumSPoint
    }

    override fun onButtonCriteriaSelected(userCriteriaDetail: UserCriteriaDetail) {
        val activities = userCriteriaDetail.userCriteriaActivities.map {
            it.name
        }.toTypedArray()

        MaterialAlertDialogBuilder(requireContext())
            .setTitle("Hoạt động minh chứng")
            .setItems(activities, null)
            .setNegativeButton("Thoát", null)
            .show()
    }

}