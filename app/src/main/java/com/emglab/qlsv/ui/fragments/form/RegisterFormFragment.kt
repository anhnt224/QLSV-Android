package com.emglab.qlsv.ui.fragments.form

import android.annotation.SuppressLint
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.observe
import androidx.navigation.Navigation
import com.emglab.qlsv.R
import com.emglab.qlsv.databinding.RegistFormFragmentBinding
import com.emglab.qlsv.di.Injectable
import com.emglab.qlsv.di.ViewModelFactory
import com.emglab.qlsv.extension.checkResource
import com.emglab.qlsv.extension.showToast
import com.emglab.qlsv.models.entity.Form
import com.emglab.qlsv.models.entity.FormQuestion
import com.emglab.qlsv.models.entity.QuestionType
import com.emglab.qlsv.ui.viewmodels.form.RegisterFormViewModel
import com.google.android.material.checkbox.MaterialCheckBox
import javax.inject.Inject


class RegisterFormFragment : Fragment(), Injectable {

    companion object {
        fun newInstance() = RegisterFormFragment()
    }

    private lateinit var viewModel: RegisterFormViewModel
    private lateinit var binding: RegistFormFragmentBinding
    private var index = 0
    @Inject
    lateinit var factory: ViewModelFactory
    private var formQuestions: List<FormQuestion> = listOf()
    private lateinit var form: Form

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        setUpViewModel()
        binding = DataBindingUtil.inflate(inflater, R.layout.regist_form_fragment, container, false)
        form = RegisterFormFragmentArgs.fromBundle(requireArguments()).form

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
            buttonRegister.setOnClickListener {
                registerForm()
            }
        }
        subscribeUI()
        return binding.root
    }

    private fun registerForm() {
        if(form.isPaper()){
            Navigation.findNavController(requireView()).navigate(RegisterFormFragmentDirections.actionRegisterFormFragmentToChooseDeliveryTypeFragment(formQuestions.toTypedArray()))
        }else{
            viewModel.registerForm(formQuestions)
        }
    }

    private fun setUpViewModel(){
        viewModel = ViewModelProvider(this, factory).get(RegisterFormViewModel::class.java)
    }

    private fun subscribeUI(){
        with(viewModel){
            questions.observe(viewLifecycleOwner){
                binding.resource = it
                if (checkResource(it)){
                    if(it.data != null && it.data.isNotEmpty()){
                        formQuestions = it.data
                        checkProgress()
                        if(it.data.size > 1){
                            binding.buttonNext.isEnabled = true
                        }
                        showQuestion(it.data[0])
                    }
                }
            }

            registerForm.observe(viewLifecycleOwner){
                binding.resource = it
                if(checkResource(it)){
                    showToast("Đăng kí giấy tờ thành công")
                    Navigation.findNavController(requireView()).navigateUp()
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
        formQuestion.answers.forEachIndexed{index, answer ->
            val radioButton = RadioButton(requireContext())
            radioButton.text = answer.content
            radioButton.setOnCheckedChangeListener{buttonView, isChecked ->
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
        editText.addTextChangedListener(object: TextWatcher{
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
            buttonRegister.isEnabled = progress == formQuestions.size
        }
    }
}