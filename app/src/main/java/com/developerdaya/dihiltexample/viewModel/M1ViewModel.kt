package com.developerdaya.dihiltexample.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.developerdaya.dihiltexample.base.BaseViewModel
import com.developerdaya.dihiltexample.resp.LoginResponse
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers

class M1ViewModel : BaseViewModel() {
    lateinit var disposable: Disposable
    val mLogin = MutableLiveData<LoginResponse>()
    val error = MutableLiveData<Throwable>()
    val buttonText = MutableLiveData<String>().apply { value = "Login using Hint DI1" }
    val apiResponse = MutableLiveData<String>()

    fun hitLogin(countryCode: String, mobileNumber: String, deviceType: Int, deviceToken: String) {
        disposable = api.loginApi(
            mobileNumber,
            countryCode,
            deviceType,
            deviceToken
        )
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                mLogin.value = it
            },
                {
                    error.value = it
                })
    }
}
