package com.emglab.qlsv.repositories

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.emglab.qlsv.common.AppExecutors
import com.emglab.qlsv.common.NetworkBoundResource
import com.emglab.qlsv.common.Resource
import com.emglab.qlsv.helper.SharedPrefsHelper
import com.emglab.qlsv.models.entity.Form
import com.emglab.qlsv.models.entity.FormQuestion
import com.emglab.qlsv.models.req.RegisterFormReq
import com.emglab.qlsv.models.req.UpdateFormReq
import com.emglab.qlsv.models.res.MyCTSVCap
import com.emglab.qlsv.models.res.form.GetFormDetailResp
import com.emglab.qlsv.models.res.form.GetListFormsRegiteredResp
import com.emglab.qlsv.models.res.form.GetListFormsResp
import com.emglab.qlsv.models.res.form.GetListQuestionsResp
import com.emglab.qlsv.webservices.ApiResponse
import com.emglab.qlsv.webservices.FormWebService
import javax.inject.Inject

class FormRepository @Inject constructor(
    private var formWebService: FormWebService,
    private var appExecutors: AppExecutors,
    private var sharedPrefsHelper: SharedPrefsHelper
) {
    private var forms: MutableLiveData<List<Form>> = MutableLiveData()
    private var form: MutableLiveData<Form> = MutableLiveData()
    private var questions: MutableLiveData<List<FormQuestion>> = MutableLiveData()
    private var registerForm = MutableLiveData<MyCTSVCap>()
    private var delForm = MutableLiveData<MyCTSVCap>()
    private var updateForm = MutableLiveData<MyCTSVCap>()
    private var rateForm = MutableLiveData<MyCTSVCap>()

    init {
        forms.value = listOf()
        form.value = Form()
        questions.value = listOf()
        registerForm.value = MyCTSVCap()
        delForm.value = MyCTSVCap()
        updateForm.value = MyCTSVCap()
        rateForm.value = MyCTSVCap()
    }

    fun getListForms(shouldFetch: Boolean = true): LiveData<Resource<List<Form>>>{
        return object: NetworkBoundResource<List<Form>, GetListFormsResp>(appExecutors){
            override fun saveCallResult(item: GetListFormsResp) {
                Thread(Runnable { forms.postValue(item.forms) }).start()
            }

            override fun shouldFetch(data: List<Form>?): Boolean {
                return data == null || shouldFetch
            }

            override fun loadFromDb(): LiveData<List<Form>> {
                return forms
            }

            override fun createCall(): LiveData<ApiResponse<GetListFormsResp>> {
                return formWebService.getListForm(sharedPrefsHelper.getToken())
            }

        }.asLiveData()
    }

    fun getListFormsRegistered(shouldFetch: Boolean = true): LiveData<Resource<List<Form>>>{
        return object: NetworkBoundResource<List<Form>, GetListFormsRegiteredResp>(appExecutors){
            override fun saveCallResult(item: GetListFormsRegiteredResp) {
                Thread(Runnable { forms.postValue(item.forms) }).start()
            }

            override fun shouldFetch(data: List<Form>?): Boolean {
                return data == null || shouldFetch
            }

            override fun loadFromDb(): LiveData<List<Form>> {
                return forms
            }

            override fun createCall(): LiveData<ApiResponse<GetListFormsRegiteredResp>> {
                return formWebService.getListFormRegistered(sharedPrefsHelper.getToken())
            }

        }.asLiveData()
    }
    fun deleteForm(rowID: Int, shouldFetch: Boolean = true): LiveData<Resource<MyCTSVCap>>{
        return object : NetworkBoundResource<MyCTSVCap, MyCTSVCap>(appExecutors){
            override fun saveCallResult(item: MyCTSVCap) {
                Thread(Runnable { delForm.postValue(item) }).start()
            }

            override fun shouldFetch(data: MyCTSVCap?): Boolean {
                return data == null || shouldFetch
            }

            override fun loadFromDb(): LiveData<MyCTSVCap> {
                return delForm
            }

            override fun createCall(): LiveData<ApiResponse<MyCTSVCap>> {
                return formWebService.deleteForm(sharedPrefsHelper.getToken(), rowID)
            }

        }.asLiveData()
    }

    fun getFormDetail(rowId: Int, shouldFetch: Boolean = true): LiveData<Resource<Form>>{
        return object: NetworkBoundResource<Form, GetFormDetailResp>(appExecutors){
            override fun saveCallResult(item: GetFormDetailResp) {
                Thread(Runnable { form.postValue(item.form) }).start()
            }

            override fun shouldFetch(data: Form?): Boolean {
                return data == null || shouldFetch
            }

            override fun loadFromDb(): LiveData<Form> {
                return form
            }

            override fun createCall(): LiveData<ApiResponse<GetFormDetailResp>> {
                return formWebService.getFormDetail(sharedPrefsHelper.getToken(), rowId)
            }

        }.asLiveData()
    }

    fun getListQuestions(formType: String, shouldFetch: Boolean = true): LiveData<Resource<List<FormQuestion>>>{
        return object: NetworkBoundResource<List<FormQuestion>, GetListQuestionsResp>(appExecutors){
            override fun saveCallResult(item: GetListQuestionsResp) {
                Thread(Runnable { questions.postValue(item.questions) }).start()
            }

            override fun shouldFetch(data: List<FormQuestion>?): Boolean {
                return data == null || shouldFetch
            }

            override fun loadFromDb(): LiveData<List<FormQuestion>> {
                return questions
            }

            override fun createCall(): LiveData<ApiResponse<GetListQuestionsResp>> {
                return formWebService.getListQuestions(sharedPrefsHelper.getToken(), formType)
            }

        }.asLiveData()
    }

    fun registerForm(questions: List<FormQuestion>, deliveryType: Int = 0, studentContactID: Int = 0, shouldFetch: Boolean = true): LiveData<Resource<MyCTSVCap>>{
        return object: NetworkBoundResource<MyCTSVCap, MyCTSVCap>(appExecutors){
            override fun saveCallResult(item: MyCTSVCap) {
                Thread(Runnable { registerForm.postValue(item) }).start()
            }

            override fun shouldFetch(data: MyCTSVCap?): Boolean {
                return shouldFetch || data == null
            }

            override fun loadFromDb(): LiveData<MyCTSVCap> {
                return registerForm
            }

            override fun createCall(): LiveData<ApiResponse<MyCTSVCap>> {
                val registerFormReq = RegisterFormReq(
                    token = sharedPrefsHelper.getToken(),
                    questions = questions,
                    studentContactID = studentContactID,
                    deliveryType = deliveryType
                )
                return formWebService.registerForm(registerFormReq)
            }

        }.asLiveData()
    }

    fun updateForm(rowID: Int, questions: List<FormQuestion>, shouldFetch: Boolean = true): LiveData<Resource<MyCTSVCap>>{
        return object: NetworkBoundResource<MyCTSVCap, MyCTSVCap>(appExecutors){
            override fun saveCallResult(item: MyCTSVCap) {
                Thread(Runnable { updateForm.postValue(item) }).start()
            }

            override fun shouldFetch(data: MyCTSVCap?): Boolean {
                return shouldFetch || data == null
            }

            override fun loadFromDb(): LiveData<MyCTSVCap> {
                return updateForm
            }

            override fun createCall(): LiveData<ApiResponse<MyCTSVCap>> {
                val updateFormReq = UpdateFormReq(sharedPrefsHelper.getToken(), rowID, questions = questions)
                return formWebService.updateForm(updateFormReq)
            }

        }.asLiveData()
    }

    fun rateForm(rowID: Int, rating: Int, comment: String, shouldFetch: Boolean = true): LiveData<Resource<MyCTSVCap>>{
        return object: NetworkBoundResource<MyCTSVCap, MyCTSVCap>(appExecutors){
            override fun saveCallResult(item: MyCTSVCap) {
                Thread(Runnable { rateForm.postValue(item) }).start()
            }

            override fun shouldFetch(data: MyCTSVCap?): Boolean {
                return data == null || shouldFetch
            }

            override fun loadFromDb(): LiveData<MyCTSVCap> {
                return rateForm
            }

            override fun createCall(): LiveData<ApiResponse<MyCTSVCap>> {
                return formWebService.rateForm(sharedPrefsHelper.getToken(), rowID, rating, comment)
            }

        }.asLiveData()
    }
}