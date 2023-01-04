package com.emglab.qlsv.ui.fragments.user

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.observe
import androidx.recyclerview.widget.LinearLayoutManager
import com.emglab.qlsv.R
import com.emglab.qlsv.common.RetryCallback
import com.emglab.qlsv.databinding.NotesFragmentBinding
import com.emglab.qlsv.di.Injectable
import com.emglab.qlsv.di.ViewModelFactory
import com.emglab.qlsv.extension.checkResource
import com.emglab.qlsv.models.entity.Note
import com.emglab.qlsv.ui.adapter.user.NoteAdapter
import com.emglab.qlsv.ui.viewmodels.user.NotesViewModel
import javax.inject.Inject

class NotesFragment : Fragment(), Injectable, NoteAdapter.OnItemClickListener {

    private lateinit var viewModel: NotesViewModel
    @Inject
    lateinit var factory: ViewModelFactory
    private lateinit var binding: NotesFragmentBinding
    private lateinit var noteAdapter: NoteAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        setUpViewModel()
        binding = DataBindingUtil.inflate(inflater, R.layout.notes_fragment, container, false)
        noteAdapter = NoteAdapter(listOf(), this)
        binding.recyclerView.apply {
            adapter = noteAdapter
            layoutManager = LinearLayoutManager(requireContext())
        }

        binding.retryCallBack = object: RetryCallback {
            override fun retry() {
                viewModel.getStudentNotes()
            }

        }
        subscribeUI()
        return binding.root
    }

    private fun setUpViewModel(){
        viewModel = ViewModelProvider(this, factory).get(NotesViewModel::class.java)
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
        }
    }

    /**
     * Called when long click note
     */
    override fun onLongClick(note: Note) {
        //
    }
}