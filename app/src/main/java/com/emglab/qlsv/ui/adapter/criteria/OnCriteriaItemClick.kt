package com.emglab.qlsv.ui.adapter.criteria

import com.emglab.qlsv.models.entity.UserCriteriaDetail

interface OnCriteriaItemClick {
    fun onProofClick(userCriteriaDetail: UserCriteriaDetail)
    fun onTextProofClick(userCriteriaDetail: UserCriteriaDetail)
}