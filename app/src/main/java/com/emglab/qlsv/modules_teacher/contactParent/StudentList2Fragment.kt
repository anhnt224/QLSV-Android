package com.emglab.qlsv.modules_teacher.contactParent

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Build
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.fragment.app.Fragment
import androidx.appcompat.widget.SearchView
import androidx.core.app.ActivityCompat
import androidx.lifecycle.observe
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.emglab.qlsv.R
import com.emglab.qlsv.common.RetryCallback
import com.emglab.qlsv.common.Status
import com.emglab.qlsv.databinding.FragmentStudentList2Binding
import com.emglab.qlsv.di.Injectable
import com.emglab.qlsv.di.ViewModelFactory
import com.emglab.qlsv.extension.checkResource
import com.emglab.qlsv.extension.showToast
import com.emglab.qlsv.models.entity.FilterType
import com.emglab.qlsv.models.entity.Student
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import javax.inject.Inject

private const val REQUEST_SEND_SMS = 1001

class StudentList2Fragment : Fragment(), Injectable, Student2AdapterListener {

    private lateinit var viewModel: StudentList2ViewModel

    @Inject
    lateinit var factory: ViewModelFactory
    private lateinit var binding: FragmentStudentList2Binding
    private lateinit var studentAdapter: Student2Adapter
    private var semesters: Array<String> =
        arrayOf("2019-1", "2019-2", "2020-1", "2020-2", "2021-1", "2021-2")
    private var semesterSelected: String = "2022-1"
    private var classSelected: String = ""
    private var allClass = "Tất cả"
    private var listClasses: Array<String> = arrayOf()
    private lateinit var searchView: SearchView
    private var students: List<Student> = listOf()
    private var filterTypes = FilterType.values()
    private var selectedFilterType = FilterType.ALL
    private var selectedStudent: Student? = null
    private var urlToken: String? = null
    private var isGetStudentsFirst = false

    @SuppressLint("SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentStudentList2Binding.inflate(inflater, container, false)
        setupRecyclerView()
        setHasOptionsMenu(true)

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

        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        isGetStudentsFirst = true
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        setupViewModel()
        subscribeUI()
    }

    private fun setupViewModel() {
        viewModel = ViewModelProvider(this, factory).get(StudentList2ViewModel::class.java)
    }

    @SuppressLint("SetTextI18n")
    private fun subscribeUI() {
        with(viewModel) {
            students.observe(viewLifecycleOwner) {
                binding.status = it.status
                if (checkResource(it) && it.data != null) {
                    this@StudentList2Fragment.students = it.data
                    studentAdapter.updateList(it.data)
                }
            }

            classes.observe(viewLifecycleOwner) {
                binding.status = it.status
                if (checkResource(it) && it.data != null) {
                    listClasses = it.data.toTypedArray()
                    listClasses = listClasses.plus(allClass)
                    if (listClasses.isNotEmpty() && isGetStudentsFirst) {
                        isGetStudentsFirst = false
                        classSelected = listClasses.first()
                        binding.btClass.text = classSelected
                        viewModel.setParameter(semesterSelected, classSelected, "")
                    }
                }
            }

            getFilterType().observe(viewLifecycleOwner) {
                selectedFilterType = it
                val studentFiltered = filterListStudent(this@StudentList2Fragment.students, it)
                studentAdapter.updateList(studentFiltered)
            }

            parameter.observe(viewLifecycleOwner) {
                binding.btSemester.text = "Kì ${it.semester}"
                binding.btClass.text = it.className
            }
        }
    }

    private fun setupRecyclerView() {
        studentAdapter = Student2Adapter(listOf(), this)
        binding.recyclerView.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = studentAdapter
        }
    }

    /**
     * Student2Adapter Listener implements
     * onCallButtonClick
     * onContactButtonClick
     * onInfoButtonClick
     * onItemClick
     */
    override fun onCallButtonClick(student: Student) {
        showCallDialog(student)
    }

    override fun onContactButtonClick(student: Student) {
        if (student.id == selectedStudent?.id && urlToken != null) {
            showContactDialog(student, urlToken!!)
        } else {
            selectedStudent = student
            urlToken = null
            viewModel.getStudentInfoUrlToken(student.id)
            viewModel.apply {
                studentInfoUrlToken.observe(viewLifecycleOwner) {
                    binding.status = it.status
                    if (checkResource(it) && it.data != null) {
                        showContactDialog(student, it.data)
                        studentInfoUrlToken.removeObservers(viewLifecycleOwner)
                    }
                    if (it.status == Status.ERROR || it.status == Status.ERROR_TOKEN) {
                        studentInfoUrlToken.removeObservers(viewLifecycleOwner)
                    }
                }
            }
        }
    }

    override fun onInfoButtonClick(student: Student) {
        if (student.id == selectedStudent?.id && urlToken != null) {
            showStudentInfo(student, urlToken!!)
        } else {
            selectedStudent = student
            urlToken = null
            viewModel.getStudentInfoUrlToken(student.id)
            viewModel.apply {
                studentInfoUrlToken2.observe(viewLifecycleOwner) {
                    binding.status = it.status
                    if (checkResource(it) && it.data != null) {
                        showStudentInfo(student, it.data)
                        studentInfoUrlToken.removeObservers(viewLifecycleOwner)
                    }
                    if (it.status == Status.ERROR || it.status == Status.ERROR_TOKEN) {
                        studentInfoUrlToken.removeObservers(viewLifecycleOwner)
                    }
                }
            }
        }
    }

    override fun onItemClick(student: Student) {
        val action = StudentList2FragmentDirections.actionStudentList2FragmentToTStudentNoteFragment(student.id)
        Navigation.findNavController(requireView()).navigate(action)
    }

    private fun showStudentInfo(student: Student, urlToken: String){
        val url = getStudentInfoUrl(student, urlToken)
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse(url))

        if (browserIntent.resolveActivity(requireContext().packageManager) != null) {
            startActivity(browserIntent)
        }
    }

    private fun showContactDialog(student: Student, urlToken: String) {
        val dialog = MaterialAlertDialogBuilder(requireContext())
        dialog.setTitle("Liên hệ phụ huynh sinh viên")
        dialog.setMessage("Gửi link kết quả học tập của sinh viên cho phụ huynh")
        if (student.fatherName != "" && student.fatherPhone != "") {
            dialog.setPositiveButton("Gửi SMS cho PH ${student.fatherName}") { _, _ ->
                sendSMS(student.fatherPhone, urlToken, student)
            }
        }

        if (student.motherName != "" && student.motherPhone != "") {
            dialog.setNegativeButton("Gửi SMS cho PH ${student.motherName}") { _, _ ->
                sendSMS(student.motherPhone, urlToken, student)
            }
        }
        dialog.setNeutralButton("Bỏ qua", null)
        dialog.show()
    }

    private fun sendSMS(phoneNumber: String, urlToken: String, student: Student) {
        val content =
            "Tôi là giáo viên chủ nhiệm của sinh viên ${student.name}." +
                    " Tôi gửi phụ huynh thông tin tình hình học tập và rèn luyện của sinh viên." +
                    " Để xem chi tiết xin mời phụ huynh truy cập vào link sau đây: ${getStudentInfoUrl(student, urlToken)}"
        Log.d("_AC", content)
        val intent = Intent(Intent.ACTION_VIEW).apply {
            data = Uri.parse("smsto:$phoneNumber")
            putExtra("sms_body", content)
        }
        startActivity(intent)
    }

    private fun getStudentInfoUrl(student: Student, urlToken: String): String {
        return "https://ctsv.hust.edu.vn/#/ph/${student.id}/$urlToken"
    }

    private fun hasSendSMSPermission(): Boolean {
        val result = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            requireContext().checkSelfPermission(android.Manifest.permission.SEND_SMS)
        } else {
            requireContext().checkCallingOrSelfPermission(android.Manifest.permission.SEND_SMS)
        }
        return result == PackageManager.PERMISSION_GRANTED
    }

    private fun requestSMSPermission() {
        ActivityCompat.requestPermissions(
            requireActivity(),
            arrayOf(android.Manifest.permission.SEND_SMS),
            REQUEST_SEND_SMS
        )
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        when (requestCode) {
            REQUEST_SEND_SMS -> {
                if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    showToast("Bạn đã cấp quyền gửi tin nhắn")
                } else {
                    showToast("Vui lòng cấp quyền truy gửi tin nhắn SMS để tiếp tục")
                }
            }
        }
    }

    @SuppressLint("SetTextI18n")
    private fun chooseSemester() {
        MaterialAlertDialogBuilder(requireContext())
            .setTitle("Chọn kì học")
            .setItems(semesters) { _, i ->
                semesterSelected = semesters[i]
                viewModel.setParameter(semesterSelected, classSelected, "")
                binding.btSemester.text = "Kì $semesterSelected"
            }.show()
    }

    private fun chooseClass() {
        MaterialAlertDialogBuilder(requireContext())
            .setTitle("Chọn lớp")
            .setItems(listClasses) { _, i ->
                classSelected = listClasses[i]
                viewModel.setParameter(semesterSelected, classSelected, "")
                binding.btClass.text = classSelected
            }.show()
    }

    private fun showCallDialog(student: Student) {
        val dialog = MaterialAlertDialogBuilder(requireContext()).setTitle("Gọi điện cho phụ huynh")
        if (student.fatherName.isNotEmpty() && student.fatherPhone.isNotEmpty()) {
            dialog.setPositiveButton(student.fatherName) { _, _ ->
                makePhoneCall(student.fatherPhone)
            }
        }
        if (student.motherName.isNotEmpty() && student.motherPhone.isNotEmpty()) {
            dialog.setNegativeButton(student.motherName) { _, _ ->
                makePhoneCall(student.motherPhone)
            }
        }
        dialog.setNeutralButton("Bỏ qua", null)
        dialog.show()
    }

    private fun makePhoneCall(number: String) {
        try {
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$number"))
            startActivity(intent)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    @SuppressLint("DefaultLocale")
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_list_student, menu)

        searchView = menu.findItem(R.id.search).actionView as SearchView
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(searchText: String): Boolean {
                if (classSelected == allClass) {
                    viewModel.setParameter(semesterSelected, classSelected, searchText)
                }
                return true
            }

            override fun onQueryTextChange(searchText: String): Boolean {
                if (classSelected == allClass) {
                    return true
                }

                val studentList = students.filter {
                    it.name.toLowerCase().contains(searchText.toLowerCase())
                }
                studentAdapter.updateList(studentList)
                return true
            }

        })

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.filter -> {
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
        builder.setPositiveButton("OK") { dialog, _ ->
            dialog.dismiss()
        }
        builder.setNegativeButton("Hủy") { dialog, _ ->
            dialog.dismiss()
        }
        val dialog = builder.create()
        dialog.show()
    }

    private fun filterListStudent(list: List<Student>, typeFilter: FilterType): List<Student> {
        var listStudentFiltered = listOf<Student>()
        when (typeFilter) {
            FilterType.ALL -> {
                listStudentFiltered = list
            }
            FilterType.SCORED -> {
                listStudentFiltered = list.filter {
                    it.isScored()
                }
            }
            FilterType.NOT_SCORED_YET -> {
                listStudentFiltered = list.filter {
                    it.isNotScoredYet()
                }
            }
            FilterType.DIFFERENCE_SCORED -> {
                listStudentFiltered = list.filter {
                    it.isDifferenceScored()
                }
            }
        }
        return listStudentFiltered
    }

}