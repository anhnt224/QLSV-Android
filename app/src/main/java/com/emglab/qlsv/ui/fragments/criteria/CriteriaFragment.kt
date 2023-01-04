package com.emglab.qlsv.ui.fragments.criteria

import android.annotation.SuppressLint
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.view.*
import android.widget.EditText
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.emglab.qlsv.R
import com.emglab.qlsv.databinding.CriteriaFragmentBinding
import com.emglab.qlsv.di.Injectable
import com.emglab.qlsv.di.ViewModelFactory
import com.emglab.qlsv.extension.checkResource
import com.emglab.qlsv.extension.showToast
import com.emglab.qlsv.models.entity.*
import com.emglab.qlsv.ui.adapter.OnItemClickListener
import com.emglab.qlsv.ui.adapter.criteria.CriteriaActivityAdapter
import com.emglab.qlsv.ui.adapter.criteria.CriteriaActivityItem
import com.emglab.qlsv.ui.adapter.criteria.CriteriaGroupAdapter
import com.emglab.qlsv.ui.adapter.criteria.OnCriteriaItemClick
import com.emglab.qlsv.ui.viewmodels.criteria.CriteriaViewModel
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import kotlinx.android.synthetic.main.criteria_fragment.*
import javax.inject.Inject

@SuppressLint("SetTextI18n")
class CriteriaFragment : Fragment(),Injectable, OnCriteriaItemClick , OnItemClickListener<CriteriaActivityItem>{
    private lateinit var viewModel: CriteriaViewModel
    @Inject
    lateinit var factory: ViewModelFactory
    private lateinit var criteriaGroupAdapter: CriteriaGroupAdapter
    private lateinit var binding: CriteriaFragmentBinding
    private var criteriaTypes: List<CriteriaType> = listOf()
    private var index: Int = 0
    private var semesters: Array<Semester> = arrayOf()
    private lateinit var criteriaActivityAdapter: CriteriaActivityAdapter
    private lateinit var userCriteriaDetail: UserCriteriaDetail

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        setUpViewModel()
        binding = DataBindingUtil.inflate(inflater, R.layout.criteria_fragment, container, false)
        criteriaGroupAdapter = CriteriaGroupAdapter(listOf(), this)
        criteriaActivityAdapter = CriteriaActivityAdapter(arrayListOf(), this)

        val semester: Semester = CriteriaFragmentArgs.fromBundle(requireArguments()).semester
        semesters = CriteriaFragmentArgs.fromBundle(requireArguments()).semesters
        viewModel.setSemester(semester)
        binding.buttonSemester.text = "Kì ${semester.name}"

        binding.apply {
            recyclerView.apply {
                adapter = criteriaGroupAdapter
                layoutManager = LinearLayoutManager(context)
            }

            recyclerViewCiteriaActivity.apply {
                adapter = criteriaActivityAdapter
                layoutManager = LinearLayoutManager(context)
            }

            buttonSemester.setOnClickListener {
                pickSemester()
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
                buttonSave.visibility = View.GONE
                viewModel.markCriteriaUser(semester.name, criteriaTypes)
            }
        }
        subscribeUI()
        return binding.root
    }

    private fun setUpViewModel(){
        viewModel = ViewModelProvider(this, factory).get(CriteriaViewModel::class.java)
    }

    @SuppressLint("SetTextI18n")
    private fun subscribeUI(){
        with(viewModel){
            criteriaTypes.observe(viewLifecycleOwner, Observer {
                binding.status = it.status
                if(checkResource(it)){
                    if(!it.data.isNullOrEmpty()){
                        this@CriteriaFragment.criteriaTypes = it.data
                        buttonNext.isEnabled = true
                        binding.criteriaType = this@CriteriaFragment.criteriaTypes[index]
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
            })

            activities.observe(viewLifecycleOwner, Observer {
                if(checkResource(it)){
                    binding.status = it.status
                    if(!it.data.isNullOrEmpty()){
                        it.data.forEach {userCriteriaActivity ->
                            if(criteriaActivityAdapter.criteriaActivityItems.none { criteriaActivityItem ->
                                    criteriaActivityItem.criteriaActivity.aId == userCriteriaActivity.aId
                                } && !isActivityInvalid(userCriteriaActivity)){
                                criteriaActivityAdapter.criteriaActivityItems.add(CriteriaActivityItem(userCriteriaActivity, false))
                            }
                        }
                        criteriaActivityAdapter.notifyDataSetChanged()
                    }
                }
            })

            markCriteriaUser.observe(viewLifecycleOwner, Observer {
                binding.status = it.status
                if(checkResource(it)){
                    showToast("Lưu minh chứng thành công")
                    buttonSave.visibility = View.GONE
                }else{
                    buttonSave.visibility = View.VISIBLE
                }
            })
        }
    }

    @SuppressLint("SetTextI18n")
    private fun pickSemester(){
        val semesterStrs = semesters.map {
            it.name
        }.toTypedArray()
        MaterialAlertDialogBuilder(requireContext())
            .setTitle("Chọn kì học")
            .setItems(semesterStrs){ _, which ->
                binding.buttonSemester.text = "Kì: ${semesterStrs[which]}"
                viewModel.setSemester(semesters[which])
            }.setNegativeButton("Huỷ"){_,_ ->

            }.show()
    }

    private fun updateData(criteriaType: CriteriaType){
        criteriaGroupAdapter.criteriaGroups = criteriaType.criteriaGroups
        criteriaGroupAdapter.notifyDataSetChanged()
    }

    override fun onProofClick(userCriteriaDetail: UserCriteriaDetail) {
        this@CriteriaFragment.userCriteriaDetail = userCriteriaDetail
        layoutProof.visibility = View.VISIBLE
        viewModel.setUserCriteriaDetail(userCriteriaDetail)
        criteriaActivityAdapter.criteriaActivityItems = arrayListOf()
        userCriteriaDetail.userCriteriaActivities.forEach {
            criteriaActivityAdapter.criteriaActivityItems.add(CriteriaActivityItem(it, true))
        }
        criteriaActivityAdapter.notifyDataSetChanged()
    }

    override fun onTextProofClick(userCriteriaDetail: UserCriteriaDetail) {
        val dialog = MaterialAlertDialogBuilder(requireContext())
        dialog.setTitle("Nhập minh chứng")

        val et = EditText(requireContext())
        et.textSize = 14f
        et.isSingleLine = true
        et.setText(userCriteriaDetail.description)
        val lp = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT)
        lp.setMargins(16, 0, 16, 0)
        et.layoutParams = lp
        dialog.setView(et)
        dialog.setPositiveButton("Xác nhận"){_, _ ->
            userCriteriaDetail.description = et.text.toString()
            criteriaGroupAdapter.notifyDataSetChanged()
            userCriteriaDetail.updateSPoint()
            updateStudentPoint()
        }.setNegativeButton("Huỷ"){_,_ ->

        }
        dialog.show()
    }

    override fun onClick(value: CriteriaActivityItem) {
        if(value.checked){
            MaterialAlertDialogBuilder(requireContext())
                .setTitle("Xoá hoạt động minh chứng")
                .setMessage("Bạn muốn xoá hoạt động minh chứng này khỏi tiêu chí: ${userCriteriaDetail.name}")
                .setPositiveButton("Xoá"){_,_ ->
                    value.checked = false
                    userCriteriaDetail.userCriteriaActivities.remove(value.criteriaActivity)
                    userCriteriaDetail.updateSPoint()
                    criteriaActivityAdapter.notifyDataSetChanged()
                    criteriaGroupAdapter.notifyDataSetChanged()
                    updateStudentPoint()
                }.setNegativeButton("Huỷ") { _, _ ->

                }.show()
        }else{
            value.checked = true
            userCriteriaDetail.userCriteriaActivities.add(value.criteriaActivity)
            userCriteriaDetail.sPoint = userCriteriaDetail.maxPoint
            criteriaActivityAdapter.notifyDataSetChanged()
            criteriaGroupAdapter.notifyDataSetChanged()
            updateStudentPoint()
        }
    }

    private fun getSumSPoint():Int{
        var sumSPoint = 0
        criteriaTypes.forEach {criteriaType ->
            criteriaType.criteriaGroups.forEach {criteriaGroup ->
                criteriaGroup.userCriteriaDetails.forEach {
                    sumSPoint += it.sPoint
                }
            }
        }
        return sumSPoint
    }

    @SuppressLint("SetTextI18n")
    private fun updateStudentPoint(){
        val sumSPoint = getSumSPoint()
        binding.apply {
            buttonSave.visibility = View.VISIBLE
            buttonSave.text = "Lưu, $sumSPoint điểm"
            textSumSPoint.text = "SV chấm: $sumSPoint"
            textCriteriaTypePoint.text = "SV: ${criteriaTypes[index].getStudentPoint()}/${criteriaTypes[index].maxPoint}"
        }
    }

    private fun isActivityInvalid(activity: UserCriteriaActivity): Boolean{
        criteriaTypes.forEach {
            if (it.isActivityInvalid(activity)){
                return true
            }
        }
        return false
    }

}