package com.emglab.qlsv.teacher.fragment

import android.content.Intent
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.emglab.qlsv.databinding.FragmentTTutorBinding
import com.emglab.qlsv.di.Injectable
import com.emglab.qlsv.di.ViewModelFactory
import com.emglab.qlsv.extension.openLink
import com.emglab.qlsv.models.entity.TutorJob
import com.emglab.qlsv.teacher.viewmodel.TTutorViewModel
import com.google.firebase.ktx.Firebase
import com.google.firebase.remoteconfig.ktx.remoteConfig
import com.google.gson.Gson
import javax.inject.Inject

class TTutorFragment : Fragment(), Injectable {
    private lateinit var viewModel: TTutorViewModel
    private lateinit var binding: FragmentTTutorBinding
    @Inject
    lateinit var factory: ViewModelFactory
    val remoteConfig = Firebase.remoteConfig
    var tutorJob: TutorJob = TutorJob()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTTutorBinding.inflate(inflater, container, false)
        setupViewModel()
        fetchRemoteConfig()
        binding.apply {
            closeButton.setOnClickListener {
                Navigation.findNavController(requireView()).navigateUp()
            }

            findTutorButton.setOnClickListener {
                openLink(tutorJob!!.findTutorLink)
            }

            tutorRegistrationButton.setOnClickListener {
                openLink(tutorJob!!.tutorRegistrationLink)
            }

            shareButton.setOnClickListener {
                showSharingDialogWithURL(tutorJob!!.findTutorDesc, tutorJob!!.findTutorLink)
            }
        }
        return binding.root
    }

    private fun setupViewModel(){
        viewModel = ViewModelProvider(this, factory).get(TTutorViewModel::class.java)
    }

    private fun fetchRemoteConfig(){
        val str = remoteConfig.getString("tutor_job")
        val gson = Gson()
        try {
            tutorJob = gson.fromJson(str, TutorJob::class.java)
            binding.tutorJob = tutorJob
        }catch (e: Exception){

        }
    }

    private fun showSharingDialogWithURL(text: String, url: String) {
        val intent = Intent()
        intent.action = Intent.ACTION_SEND
        intent.type = "text/plain"
        intent.putExtra(Intent.EXTRA_TEXT, "$text: $url")
        startActivity(Intent.createChooser(intent, "Share with:"))
    }
}