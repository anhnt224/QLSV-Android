package com.emglab.qlsv.ui.adapter.activity

import com.emglab.qlsv.models.entity.Activity

interface IActivityAdapterCallBack {
    fun itemClick(activity: Activity)
}