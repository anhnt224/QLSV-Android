package com.emglab.qlsv.teacher.fragment.form

import android.annotation.SuppressLint
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.observe
import com.emglab.qlsv.R
import com.emglab.qlsv.databinding.TEditFormFragmentBinding
import com.emglab.qlsv.di.Injectable
import com.emglab.qlsv.di.ViewModelFactory
import com.emglab.qlsv.extension.checkResource
import com.emglab.qlsv.extension.showToast
import com.emglab.qlsv.models.entity.FormQuestion
import com.emglab.qlsv.models.entity.Question
import com.emglab.qlsv.models.entity.QuestionType
import com.emglab.qlsv.teacher.viewmodel.form.TEditFormViewModel
import com.emglab.qlsv.ui.fragments.form.EditFormFragmentArgs
import com.google.android.material.checkbox.MaterialCheckBox
import kotlinx.android.synthetic.main.edit_form_fragment.*
import javax.inject.Inject

class TEditFormFragment : Fragment(), Injectable {
    @Inject
    lateinit var factory: ViewModelFactory

    private lateinit var viewModel: TEditFormViewModel
    private lateinit var binding: TEditFormFragmentBinding
    private var index = 0
    private var formQuestions: List<FormQuestion> = listOf()
    private var questions: List<Question> = listOf()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        setUpViewModel()
        binding = DataBindingUtil.inflate(inflater, R.layout.t_edit_form_fragment, container, false)
        val form = TEditFormFragmentArgs.fromBundle(requireArguments()).form
        questions = EditFormFragmentArgs.fromBundle(requireArguments()).questions.toList()

        viewModel.getListQuestions(formType = form.typePaper)
        binding.apply {
            buttonNext.setOnClickListener {
                index ++
                if(index == formQuestions.size - 1){
                    buttonNext.isEnabled = false
                }
                buttonPrev.isEnabled = true
                showQuestion(formQuestion = formQuestions[index])
            }
            buttonPrev.setOnClickListener {
                index --
                if(index == 0){
                    buttonPrev.isEnabled = false
                }
                buttonNext.isEnabled = true
                showQuestion(formQuestion = formQuestions[index])
            }
            buttonUpdate.setOnClickListener {
                viewModel.updateForm(form.rowId ,formQuestions)
            }
        }
        subscribeUI()
        return binding.root
    }

    private fun setUpViewModel(){
        viewModel = ViewModelProvider(this, factory).get(TEditFormViewModel::class.java)
    }

    private fun subscribeUI(){
        with(viewModel){
            questions.observe(viewLifecycleOwner){
                binding.resource = it
                if (checkResource(it)){
                    if(it.data != null && it.data.isNotEmpty()){
                        formQuestions = it.data
                        fillAnswer()
                        checkProgress()
                        if(it.data.size > 1){
                            binding.buttonNext.isEnabled = true
                        }
                        showQuestion(it.data[0])
                        buttonUpdate.isEnabled = false
                    }
                }
            }

            updateForm.observe(viewLifecycleOwner){
                binding.resource = it
                if(checkResource(it)){
                    showToast("Cập nhật thông tin thành công")
                }
            }
        }
    }

    @SuppressLint("SetTextI18n")
    private fun showQuestion(formQuestion: FormQuestion){
        binding.questionType = formQuestion.getType()
        binding.textQuestion.text = "${index + 1}. ${formQuestion.question}"
        when(formQuestion.getType()){
            QuestionType.PARAGRAPH -> {
                showAnswerParagraph(formQuestion)
            }
            QuestionType.SINGLE_CHOICE -> {
                showAnswerSingleChoice(formQuestion)
            }
            QuestionType.CHECK_BOX -> {
                showAnswerCheckBox(formQuestion)
            }
        }
    }

    private fun showAnswerSingleChoice(formQuestion: FormQuestion){
        binding.layoutSingleChoice.removeAllViewsInLayout()
        formQuestion.answers.forEachIndexed{_, answer ->
            val radioButton = RadioButton(requireContext())
            radioButton.text = answer.content
            radioButton.setOnCheckedChangeListener{_, isChecked ->
                if(isChecked){
                    formQuestion.answer = radioButton.text.toString()
                    checkProgress()
                }
            }
            binding.layoutSingleChoice.addView(radioButton)
        }

        binding.apply {
            for(i in 0 until layoutSingleChoice.childCount){
                val view = layoutSingleChoice.getChildAt(i) as RadioButton
                if(formQuestion.answer == view.text.toString()){
                    layoutSingleChoice.check(view.id)
                }
            }
        }
    }

    private fun showAnswerCheckBox(formQuestion: FormQuestion){
        binding.layoutCheckBox.removeAllViews()
        formQuestion.answers.forEach {
            val checkBox = MaterialCheckBox(requireContext())
            checkBox.text = it.content
            checkBox.setOnCheckedChangeListener { _, isChecked ->
                if(isChecked){
                    if(!formQuestion.answer.contains(it.content)){
                        formQuestion.answer = formQuestion.answer.plus(checkBox.text.toString() + ";")
                    }
                }else{
                    formQuestion.answer = formQuestion.answer.replace(checkBox.text.toString() + ";", "")
                }
                checkProgress()
            }
            binding.layoutCheckBox.addView(checkBox)
        }
        binding.apply {
            for(i in 0 until layoutCheckBox.childCount){
                val view = layoutCheckBox.getChildAt(i) as CheckBox
                view.isChecked = formQuestion.answer.contains(view.text.toString())
            }
        }
    }

    private fun showAnswerParagraph(formQuestion: FormQuestion){
        val editText = EditText(requireContext())
        editText.isSingleLine = true

        editText.setText(formQuestion.answer)
        editText.addTextChangedListener(object: TextWatcher {
            override fun afterTextChanged(s: Editable?) {

            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                formQuestion.answer = s.toString()
                checkProgress()
            }
        })
        binding.layoutParagraph.removeAllViews()
        binding.layoutParagraph.addView(editText)
    }

    @SuppressLint("SetTextI18n")
    fun checkProgress(){
        var progress = 0
        formQuestions.forEach {
            if(it.answer.isNotEmpty()){
                progress ++
            }
        }
        binding.apply {
            progressBar.progress = progress
            progressBar.max = formQuestions.size
            textProgress.text = "${progress}/${formQuestions.size}"
            buttonUpdate.isEnabled = progress == formQuestions.size
        }
    }

    private fun fillAnswer(){
        formQuestions.forEach {formQuestion ->
            if (!questions.filter { it.id == formQuestion.idQuestion }.isNullOrEmpty()){
                formQuestion.answer = questions.first { it.id == formQuestion.idQuestion }.answer
            }
        }
    }

}