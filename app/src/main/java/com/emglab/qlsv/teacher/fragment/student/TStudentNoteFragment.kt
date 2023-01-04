package com.emglab.qlsv.teacher.fragment.student

import android.app.Dialog
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.observe
import androidx.recyclerview.widget.LinearLayoutManager
import com.emglab.qlsv.R
import com.emglab.qlsv.common.RetryCallback
import com.emglab.qlsv.databinding.TStudentNoteFragmentBinding
import com.emglab.qlsv.di.Injectable
import com.emglab.qlsv.di.ViewModelFactory
import com.emglab.qlsv.extension.checkResource
import com.emglab.qlsv.models.entity.Note
import com.emglab.qlsv.teacher.viewmodel.student.TStudentNoteViewModel
import com.emglab.qlsv.ui.adapter.user.NoteAdapter
import com.google.android.material.button.MaterialButton
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.android.material.textfield.TextInputEditText
import javax.inject.Inject

class TStudentNoteFragment : Fragment(), Injectable, NoteAdapter.OnItemClickListener {

    private lateinit var viewModel: TStudentNoteViewModel
    @Inject
    lateinit var factory: ViewModelFactory
    private lateinit var binding: TStudentNoteFragmentBinding
    private lateinit var noteAdapter: NoteAdapter
    private var note: String = ""
    private var studentID: String = ""

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        setUpViewModel()
        setHasOptionsMenu(true)

        binding = DataBindingUtil.inflate(inflater, R.layout.t_student_note_fragment, container, false)
        noteAdapter = NoteAdapter(listOf(), this)
        binding.recyclerView.apply {
            adapter = noteAdapter
            layoutManager = LinearLayoutManager(requireContext())
        }

        studentID = TStudentNoteFragmentArgs.fromBundle(requireArguments()).studentID
        viewModel.getStudentNotes(studentID)

        binding.retryCallBack = object: RetryCallback {
            override fun retry() {
                viewModel.getStudentNotes(studentID)
            }

        }
        subscribeUI()
        return binding.root
    }

    private fun setUpViewModel(){
        viewModel = ViewModelProvider(this, factory).get(TStudentNoteViewModel::class.java)
    }

    private fun subscribeUI(){
        with(viewModel){
            notes.observe(viewLifecycleOwner){
                binding.status = it.status
                if(checkResource(it) && it.data != null){
                    noteAdapter.notes = it.data
                    noteAdapter.notifyDataSetChanged()
                }
            }

            addNote.observe(viewLifecycleOwner){
                binding.status = it.status
                if(checkResource(it)){
                    note = ""
                    getStudentNotes(studentID)
                }
            }

            delNote.observe(viewLifecycleOwner){
                binding.status = it.status
                if(checkResource(it)){
                    getStudentNotes(studentID)
                }
            }
        }
    }

    /**
     * Called when long click note
     */
    override fun onLongClick(note: Note) {
        MaterialAlertDialogBuilder(requireContext())
            .setTitle("Xoá ghi chú")
            .setMessage(note.note)
            .setNegativeButton("Xoá"){_,_ ->
                viewModel.delNote(note.id)
            }.setPositiveButton("Huỷ", null)
            .show()
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_t_student_note, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.addNote -> {
                showDialogAddNote()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun showDialogAddNote(){
        val dialog = Dialog(requireContext())

        dialog.setTitle("Thêm ghi chú")
        dialog.setContentView(R.layout.dialog_with_textview)
        val etNote = dialog.findViewById<TextInputEditText>(R.id.etNote)
        val btnDone = dialog.findViewById<MaterialButton>(R.id.btnDone)
        val btnCancel = dialog.findViewById<MaterialButton>(R.id.btnCancel)

        etNote.setText(note)

        btnDone.setOnClickListener {
            note = etNote.text.toString()
            addNote(note)
            dialog.dismiss()
        }

        btnCancel.setOnClickListener {
            dialog.dismiss()
        }

        dialog.setCancelable(false)
        dialog.show()
    }

    private fun addNote(note: String){
        val studentID: String = TStudentNoteFragmentArgs.fromBundle(requireArguments()).studentID
        viewModel.addNote(studentID, note)
    }

}