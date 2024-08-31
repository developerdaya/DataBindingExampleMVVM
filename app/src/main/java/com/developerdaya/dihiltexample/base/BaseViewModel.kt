package com.developerdaya.dihiltexample.base

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.developerdaya.dihiltexample.util.ApiInterface
import com.consultantuser.webservice.Retrofit

abstract class BaseViewModel : ViewModel() {
    val throwable = MutableLiveData<Throwable?>()
    val success = MutableLiveData<Any>()

    val api : ApiInterface by lazy {
        Retrofit.createBaseApiService()
    }

    fun onResponseError(it: Throwable?) {
        throwable.postValue(it)
    }

}