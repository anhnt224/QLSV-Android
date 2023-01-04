package com.emglab.qlsv.repositories

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import com.emglab.qlsv.common.AppExecutors
import com.emglab.qlsv.common.NetworkBoundResource
import com.emglab.qlsv.common.Resource
import com.emglab.qlsv.helper.SharedPrefsHelper
import com.emglab.qlsv.models.entity.*
import com.emglab.qlsv.models.req.MarkCriteriaUserReq
import com.emglab.qlsv.models.res.MyCTSVCap
import com.emglab.qlsv.models.res.activity.CTSVGetActivityByUserRes
import com.emglab.qlsv.models.res.criteria.GetListCriteriaTypesResp
import com.emglab.qlsv.models.res.teacher.GetListClassResp
import com.emglab.qlsv.models.res.teacher.GetListStudentResp
import com.emglab.qlsv.models.res.teacher.GetStudentInfoResp
import com.emglab.qlsv.models.res.user.GetStudentNoteResp
import com.emglab.qlsv.modules_teacher.contactParent.GetStudentInfoTokenResp
import com.emglab.qlsv.webservices.ApiResponse
import com.emglab.qlsv.webservices.WebService
import javax.inject.Inject

class TeacherRepository @Inject constructor(
    private val webService: WebService,
    private val appExecutors: AppExecutors,
    private val sharedPrefsHelper: SharedPrefsHelper
) {
    private var liveDataGetListStudents = MutableLiveData<List<Student>>()
    private var liveDataGetListClass = MutableLiveData<List<String>>()
    private var liveDataGetActivityByStudent = MutableLiveData<List<Activity>>()
    private var studentInfo = MutableLiveData<StudentInfo>()
    private var criteriaTypes = MediatorLiveData<List<CriteriaType>>()
    private var markCriteriaUser = MediatorLiveData<MyCTSVCap>()
    private var notes = MediatorLiveData<List<Note>>()
    private var liveDataSearchStudent = MutableLiveData<List<Student>>()
    private var liveDataAddStudentNote = MutableLiveData<MyCTSVCap>()
    private var liveDataDelStudentNote = MutableLiveData<MyCTSVCap>()
    private var studentInfoUrlToken = MutableLiveData<String?>()

    init {
        liveDataGetListStudents.value = listOf()
        liveDataGetListClass.value = listOf()
        liveDataGetActivityByStudent.value = listOf()
        studentInfo.value = StudentInfo()
        criteriaTypes.value = listOf()
        markCriteriaUser.value = MyCTSVCap()
        notes.value = listOf()
        liveDataSearchStudent.value = listOf()
        liveDataAddStudentNote.value = MyCTSVCap()
        liveDataDelStudentNote.value = MyCTSVCap()
        studentInfoUrlToken.value = null
    }

    fun getListStudent(
        semester: String,
        className: String,
        shouldFetch: Boolean = true
    ): LiveData<Resource<List<Student>>> {
        return object : NetworkBoundResource<List<Student>, GetListStudentResp>(appExecutors) {
            override fun saveCallResult(item: GetListStudentResp) {
                Thread(Runnable { liveDataGetListStudents.postValue(item.listStudents) }).start()
            }

            override fun shouldFetch(data: List<Student>?): Boolean {
                return shouldFetch || data == null
            }

            override fun loadFromDb(): LiveData<List<Student>> {
                return liveDataGetListStudents
            }

            override fun createCall(): LiveData<ApiResponse<GetListStudentResp>> {
                return webService.getListStudents(
                    sharedPrefsHelper.getUserName(),
                    sharedPrefsHelper.getToken(),
                    className,
                    semester
                )
            }

        }.asLiveData()
    }

    fun searchStudent(
        search: String,
        shouldFetch: Boolean = true
    ): LiveData<Resource<List<Student>>> {
        return object : NetworkBoundResource<List<Student>, GetListStudentResp>(appExecutors) {
            override fun saveCallResult(item: GetListStudentResp) {
                Thread(Runnable { liveDataSearchStudent.postValue(item.listStudents) }).start()
            }

            override fun shouldFetch(data: List<Student>?): Boolean {
                return shouldFetch || data == null
            }

            override fun loadFromDb(): LiveData<List<Student>> {
                return liveDataSearchStudent
            }

            override fun createCall(): LiveData<ApiResponse<GetListStudentResp>> {
                return webService.searchStudents(
                    userName = sharedPrefsHelper.getUserName(),
                    tokenCode = sharedPrefsHelper.getToken(),
                    search = search
                )
            }

        }.asLiveData()
    }

    fun getListClass(shouldFetch: Boolean = true): LiveData<Resource<List<String>>> {
        return object : NetworkBoundResource<List<String>, GetListClassResp>(appExecutors) {
            override fun saveCallResult(item: GetListClassResp) {
                Thread { liveDataGetListClass.postValue(item.listClass) }.start()
            }

            override fun shouldFetch(data: List<String>?): Boolean {
                return shouldFetch || data == null
            }

            override fun loadFromDb(): LiveData<List<String>> {
                return liveDataGetListClass
            }

            override fun createCall(): LiveData<ApiResponse<GetListClassResp>> {
                return webService.getClasses(
                    sharedPrefsHelper.getUserName(),
                    sharedPrefsHelper.getToken()
                )
            }

        }.asLiveData()
    }

    fun getActivityByStudent(
        studentId: String,
        shouldFetch: Boolean = true,
        callDelay: Long = 0
    ): LiveData<Resource<List<Activity>>> {
        return object :
            NetworkBoundResource<List<Activity>, CTSVGetActivityByUserRes>(appExecutors) {

            override fun saveCallResult(item: CTSVGetActivityByUserRes) {
                Thread(Runnable {
                    liveDataGetActivityByStudent.postValue(item.activities)
                }).start()
            }

            override fun shouldFetch(data: List<Activity>?): Boolean {
                return data == null || shouldFetch
            }

            override fun fetchDelayMillis(): Long {
                return callDelay
            }

            override fun loadFromDb(): LiveData<List<Activity>> {
                return liveDataGetActivityByStudent
            }

            override fun createCall(): LiveData<ApiResponse<CTSVGetActivityByUserRes>> =
                webService.getActivityByUser(
                    sharedPrefsHelper.getUserName(), sharedPrefsHelper.getToken(),
                    studentId, "", "", 1000, 0
                )

        }.asLiveData()
    }

    fun getStudentInfo(
        studentID: String,
        shouldFetch: Boolean = true
    ): LiveData<Resource<StudentInfo>> {
        studentInfo = MutableLiveData()
        studentInfo.value = StudentInfo()
        return object : NetworkBoundResource<StudentInfo, GetStudentInfoResp>(appExecutors) {
            override fun saveCallResult(item: GetStudentInfoResp) {
                Thread { studentInfo.postValue(item.studentInfo) }.start()
            }

            override fun shouldFetch(data: StudentInfo?): Boolean {
                return data == null || shouldFetch
            }

            override fun loadFromDb(): LiveData<StudentInfo> {
                return studentInfo
            }

            override fun createCall(): LiveData<ApiResponse<GetStudentInfoResp>> {
                return webService.getStudentInfoByID(
                    sharedPrefsHelper.getUserName(),
                    sharedPrefsHelper.getToken(),
                    studentID
                )
            }

        }.asLiveData()
    }

    fun getListCriteriaTypes(
        semester: String,
        studentId: String,
        shouldFetch: Boolean = true
    ): LiveData<Resource<List<CriteriaType>>> {
        return object :
            NetworkBoundResource<List<CriteriaType>, GetListCriteriaTypesResp>(appExecutors) {
            override fun saveCallResult(item: GetListCriteriaTypesResp) {
                Thread(Runnable { criteriaTypes.postValue(item.criteriaTypes) }).start()
            }

            override fun shouldFetch(data: List<CriteriaType>?): Boolean {
                return data == null || shouldFetch
            }

            override fun loadFromDb(): LiveData<List<CriteriaType>> {
                return criteriaTypes
            }

            override fun createCall(): LiveData<ApiResponse<GetListCriteriaTypesResp>> {
                return webService.getListCriteriaTypes(
                    userName = sharedPrefsHelper.getUserName(),
                    tokenCode = sharedPrefsHelper.getToken(),
                    userCode = studentId,
                    semester = semester
                )
            }

        }.asLiveData()
    }

    fun markCriteriaUser(
        semester: String,
        studentId: String,
        criteriaTypes: List<CriteriaType>,
        shouldFetch: Boolean = true
    ): LiveData<Resource<MyCTSVCap>> {
        return object : NetworkBoundResource<MyCTSVCap, MyCTSVCap>(appExecutors) {
            override fun saveCallResult(item: MyCTSVCap) {
                Thread(Runnable { markCriteriaUser.postValue(item) }).start()
            }

            override fun shouldFetch(data: MyCTSVCap?): Boolean {
                return data == null || shouldFetch
            }

            override fun loadFromDb(): LiveData<MyCTSVCap> {
                return markCriteriaUser
            }

            override fun createCall(): LiveData<ApiResponse<MyCTSVCap>> {
                val markCriteriaUserReq = MarkCriteriaUserReq(
                    sharedPrefsHelper.getUserName(),
                    studentId,
                    sharedPrefsHelper.getToken(),
                    semester,
                    criteriaTypes
                )
                return webService.markCriteriaUser(markCriteriaUserReq)
            }
        }.asLiveData()
    }

    /**
     * Get student notes by StudentID
     */
    fun getStudentNotes(
        studentID: String,
        shouldFetch: Boolean = true
    ): LiveData<Resource<List<Note>>> {
        return object : NetworkBoundResource<List<Note>, GetStudentNoteResp>(appExecutors) {
            override fun saveCallResult(item: GetStudentNoteResp) {
                Thread(Runnable {
                    notes.postValue(item.notes)
                }).start()
            }

            override fun shouldFetch(data: List<Note>?): Boolean {
                return data == null || shouldFetch
            }

            override fun loadFromDb(): LiveData<List<Note>> {
                return notes
            }

            override fun createCall(): LiveData<ApiResponse<GetStudentNoteResp>> {
                return webService.getStudentNotes(
                    userName = sharedPrefsHelper.getUserName(),
                    tokenCode = sharedPrefsHelper.getToken(),
                    studentID = studentID
                )
            }

        }.asLiveData()
    }

    /**
     *
     */
    fun addStudentNote(
        studentID: String,
        note: String,
        shouldFetch: Boolean = true
    ): LiveData<Resource<MyCTSVCap>> {
        return object : NetworkBoundResource<MyCTSVCap, MyCTSVCap>(appExecutors) {
            override fun saveCallResult(item: MyCTSVCap) {
                Thread(Runnable { liveDataAddStudentNote.postValue(item) }).start()
            }

            override fun shouldFetch(data: MyCTSVCap?): Boolean {
                return data == null || shouldFetch
            }

            override fun loadFromDb(): LiveData<MyCTSVCap> {
                return liveDataAddStudentNote
            }

            override fun createCall(): LiveData<ApiResponse<MyCTSVCap>> {
                return webService.addNote(
                    userName = sharedPrefsHelper.getUserName(),
                    tokenCode = sharedPrefsHelper.getToken(),
                    studentID = studentID,
                    note = note
                )
            }

        }.asLiveData()
    }

    /**
     *
     */
    fun delStudentNote(id: Int, shouldFetch: Boolean = true): LiveData<Resource<MyCTSVCap>> {
        return object : NetworkBoundResource<MyCTSVCap, MyCTSVCap>(appExecutors) {
            override fun saveCallResult(item: MyCTSVCap) {
                Thread(Runnable { liveDataDelStudentNote.postValue(item) }).start()
            }

            override fun shouldFetch(data: MyCTSVCap?): Boolean {
                return data == null || shouldFetch
            }

            override fun loadFromDb(): LiveData<MyCTSVCap> {
                return liveDataDelStudentNote
            }

            override fun createCall(): LiveData<ApiResponse<MyCTSVCap>> {
                return webService.delStudentNote(
                    userName = sharedPrefsHelper.getUserName(),
                    tokenCode = sharedPrefsHelper.getToken(),
                    rowID = id
                )
            }

        }.asLiveData()
    }

    fun getStudentInfoUrlToken(
        id: String,
        shouldFetch: Boolean = true
    ): LiveData<Resource<String?>> {
        studentInfoUrlToken = MutableLiveData(null)
        return object : NetworkBoundResource<String?, GetStudentInfoTokenResp>(appExecutors) {
            override fun saveCallResult(item: GetStudentInfoTokenResp) {
                Thread {
                    studentInfoUrlToken.postValue(item.urlToken)
                }.start()
            }

            override fun shouldFetch(data: String?): Boolean {
                return shouldFetch || data == null
            }

            override fun loadFromDb(): LiveData<String?> {
                return studentInfoUrlToken
            }

            override fun createCall(): LiveData<ApiResponse<GetStudentInfoTokenResp>> {
                return webService.getStudentInfoUrlToken(
                    userName = sharedPrefsHelper.getUserName(),
                    token = sharedPrefsHelper.getToken(),
                    userCode = id
                )
            }


        }.asLiveData()
    }
}