package com.emglab.qlsv.teacher.fragment.student

import android.annotation.SuppressLint
import android.app.AlertDialog
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.view.*
import androidx.appcompat.widget.SearchView
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.observe
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.emglab.qlsv.R
import com.emglab.qlsv.common.RetryCallback
import com.emglab.qlsv.databinding.ListStudentFragmentBinding
import com.emglab.qlsv.di.Injectable
import com.emglab.qlsv.di.ViewModelFactory
import com.emglab.qlsv.extension.checkResource
import com.emglab.qlsv.models.entity.FilterType
import com.emglab.qlsv.models.entity.Student
import com.emglab.qlsv.teacher.adapters.OnItemStudentButtonClickLister
import com.emglab.qlsv.teacher.adapters.StudentAdapter
import com.emglab.qlsv.teacher.viewmodel.student.ListStudentViewModel
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.firebase.ktx.Firebase
import com.google.firebase.remoteconfig.ktx.remoteConfig
import javax.inject.Inject

@SuppressLint("SetTextI18n")
class ListStudentFragment : Fragment(), Injectable, OnItemStudentButtonClickLister {

    @Inject lateinit var factory: ViewModelFactory
    private lateinit var viewModel: ListStudentViewModel
    private lateinit var binding: ListStudentFragmentBinding
    private lateinit var studentAdapter: StudentAdapter
    private var semesters: Array<String> = arrayOf("2019-1", "2019-2", "2020-1", "2020-2", "2021-1", "2021-2")
    private var semesterSelected: String = "2022-1"
    private var classSelected: String = ""
    private var allClass = "Tất cả"
    private var listClasses: Array<String> = arrayOf()
    private lateinit var searchView: SearchView
    private var students: List<Student> = listOf()
    private var filterTypes = FilterType.values()
    private var selectedFilterType = FilterType.ALL
    private var isGetStudentsFirst = false
    private val remoteConfig = Firebase.remoteConfig

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        setUpViewModel()
        setHasOptionsMenu(true)
        binding = DataBindingUtil.inflate(inflater, R.layout.list_student_fragment, container, false)

        semesters = remoteConfig.getString("semesters").split(',').toTypedArray()
        semesterSelected = semesters.lastOrNull() ?: "2022-1"

        studentAdapter = StudentAdapter(listOf(), this)
        binding.recyclerView.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = studentAdapter
        }

        binding.btSemester.text = "Kì $semesterSelected"

        binding.btSemester.setOnClickListener {
            chooseSemester()
        }

        binding.btClass.setOnClickListener {
            chooseClass()
        }

        binding.callback = object : RetryCallback {
            override fun retry() {
                viewModel.getListClasses()
            }
        }

        subscribeUI()
        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        isGetStudentsFirst = true
    }

    private fun setUpViewModel(){
        viewModel = ViewModelProvider(this, factory).get(ListStudentViewModel::class.java)
    }

    @SuppressLint("NotifyDataSetChanged")
    private fun subscribeUI(){
        with(viewModel){
            students.observe(viewLifecycleOwner){
                binding.status = it.status
                if(checkResource(it) && it.data != null){
                    studentAdapter.students = it.data
                    this@ListStudentFragment.students = it.data
                    studentAdapter.notifyDataSetChanged()
                }
            }

            classes.observe(viewLifecycleOwner){
                binding.status = it.status
                if(checkResource(it) && it.data != null){
                    listClasses = it.data.toTypedArray()
                    listClasses = listClasses.plus(allClass)
                    if(listClasses.isNotEmpty() && isGetStudentsFirst){
                        isGetStudentsFirst = false
                        classSelected = listClasses.first()
                        binding.btClass.text = classSelected
                        viewModel.setParameter(semesterSelected, classSelected, "")
                    }
                }
            }

            getFilterType().observe(viewLifecycleOwner){
                selectedFilterType = it
                studentAdapter.students = filterListStudent(this@ListStudentFragment.students, it)
                studentAdapter.notifyDataSetChanged()
            }

            parameter.observe(viewLifecycleOwner){
                binding.btClass.text = it.className
                binding.btSemester.text = "Kì ${it.semester}"
            }
        }
    }

    @SuppressLint("SetTextI18n")
    private fun chooseSemester(){
        MaterialAlertDialogBuilder(requireContext())
            .setTitle("Chọn kì học")
            .setItems(semesters) {_, i ->
                semesterSelected = semesters[i]
                viewModel.setParameter(semesterSelected, classSelected, "")
                binding.btSemester.text = "Kì $semesterSelected"
            }.show()
    }

    private fun chooseClass(){
        MaterialAlertDialogBuilder(requireContext())
            .setTitle("Chọn lớp")
            .setItems(listClasses) {_, i ->
                classSelected = listClasses[i]
                viewModel.setParameter(semesterSelected, classSelected, "")
                binding.btClass.text = classSelected
            }.show()
    }

    /**
     *
     */

    override fun onButtonActivityClick(student: Student) {
        Navigation.findNavController(requireView()).navigate(ListStudentFragmentDirections.actionListStudentFragmentToListActivitiesOfStudentFragment(student))
    }

    override fun onButtonInfoClick(studentID: String) {
        Navigation.findNavController(requireView()).navigate(ListStudentFragmentDirections.actionListStudentFragmentToStudentInfoFragment(studentID))
    }

    override fun onButtonMarkClick(studentID: String, studentName: String) {
        Navigation.findNavController(requireView()).navigate(ListStudentFragmentDirections.actionListStudentFragmentToTeacherMarkFragment(studentID, studentName, semesterSelected))
    }

    /**
     *
     */

    @SuppressLint("DefaultLocale")
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_list_student, menu)

        searchView = menu.findItem(R.id.search).actionView as SearchView
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(searchText: String): Boolean {
                if(classSelected == allClass){
                    viewModel.setParameter(semesterSelected, classSelected, searchText)
                }
                return true
            }

            @SuppressLint("NotifyDataSetChanged")
            override fun onQueryTextChange(searchText: String): Boolean {
                if(classSelected == allClass){
                    return true
                }

                /**
                 *
                 */
                studentAdapter.students = students.filter {
                    it.name.toLowerCase().contains(searchText.toLowerCase())
                }
                studentAdapter.notifyDataSetChanged()
                return true
            }

        })

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId){
            R.id.filter ->{
                showFilterTypeDialog()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun showFilterTypeDialog() {
        val builder = AlertDialog.Builder(requireContext())
        builder.setTitle("Lọc sinh viên")
        val selection = filterTypes.map {
            it.itemName
        }.toTypedArray()
        builder.setSingleChoiceItems(selection, selectedFilterType.type) { _, which ->
            when (which) {
                0 -> {
                    viewModel.setFilterType(FilterType.ALL)
                }
                1 -> {
                    viewModel.setFilterType(FilterType.SCORED)
                }
                2 -> {
                    viewModel.setFilterType(FilterType.NOT_SCORED_YET)
                }
                3 -> {
                    viewModel.setFilterType(FilterType.DIFFERENCE_SCORED)
                }
            }
        }
        builder.setPositiveButton("OK"){ dialog, _ ->
            dialog.dismiss()
        }
        builder.setNegativeButton("Hủy"){ dialog, _ ->
            dialog.dismiss()
        }
        val dialog = builder.create()
        dialog.show()
    }

    private fun filterListStudent(list: List<Student>, typeFilter: FilterType): List<Student>{
        var listStudentFiltered = listOf<Student>()
        when(typeFilter){
            FilterType.ALL ->{
                listStudentFiltered = list
            }
            FilterType.SCORED ->{
                listStudentFiltered = list.filter {
                    it.isScored()
                }
            }
            FilterType.NOT_SCORED_YET ->{
                listStudentFiltered = list.filter {
                    it.isNotScoredYet()
                }
            }
            FilterType.DIFFERENCE_SCORED ->{
                listStudentFiltered = list.filter {
                    it.isDifferenceScored()
                }
            }
        }
        return listStudentFiltered
    }
}




