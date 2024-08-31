package com.developerdaya.dihiltexample.util

import com.developerdaya.dihiltexample.resp.LoginResponse
import io.reactivex.Observable
import retrofit2.http.*


interface ApiInterface {
    @FormUrlEncoded
    @POST("user/loginUser")
    fun loginApi(
        @Field("mobileNumber") mobileNumber: String,
        @Field("countryCode") countryCode: String,
        @Field("deviceType") deviceType: Int,
        @Field("deviceToken") deviceToken: String,
    ): Observable<LoginResponse>

}










