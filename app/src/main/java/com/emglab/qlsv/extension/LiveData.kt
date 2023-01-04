package com.emglab.qlsv.extension;

import androidx.lifecycle.MutableLiveData

fun <T> MutableLiveData<T>.notifyObserver(){
    this.value = this.value
}
