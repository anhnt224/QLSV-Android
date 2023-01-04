package com.emglab.qlsv.ui.viewmodels.running

import androidx.lifecycle.ViewModel
import com.emglab.qlsv.repositories.RunRepository
import javax.inject.Inject

class RunningDataViewModel @Inject constructor(
    private val runRepository: RunRepository
) : ViewModel()