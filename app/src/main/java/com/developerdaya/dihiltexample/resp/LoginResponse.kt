package com.developerdaya.dihiltexample.resp

import com.google.gson.annotations.SerializedName

data class LoginResponse(
    @SerializedName("messsage")
    val messsage: String,
    @SerializedName("response")
    val response: Response
) {
    data class Response(
        @SerializedName("active")
        val active: Boolean,
        @SerializedName("country")
        val country: String,
        @SerializedName("countryCode")
        val countryCode: String,
        @SerializedName("created_at")
        val createdAt: Long,
        @SerializedName("dateOfBirth")
        val dateOfBirth: String,
        @SerializedName("deviceToken")
        val deviceToken: String,
        @SerializedName("deviceType")
        val deviceType: Int,
        @SerializedName("email")
        val email: String,
        @SerializedName("firstName")
        val firstName: String,
        @SerializedName("gender")
        val gender: String,
        @SerializedName("_id")
        val id: String,
        @SerializedName("isBlocked")
        val isBlocked: Int,
        @SerializedName("is_deleted")
        val isDeleted: Boolean,
        @SerializedName("isProfileCompleted")
        val isProfileCompleted: Boolean,
        @SerializedName("lastName")
        val lastName: String,
        @SerializedName("mobileNumber")
        val mobileNumber: String,
        @SerializedName("modified_at")
        val modifiedAt: Long,
        @SerializedName("nationality")
        val nationality: String,
        @SerializedName("no_of_calls")
        val noOfCalls: Int,
        @SerializedName("notify_me")
        val notifyMe: Boolean,
        @SerializedName("otpInfo")
        val otpInfo: OtpInfo,
        @SerializedName("profileImage")
        val profileImage: String,
        @SerializedName("refered_by")
        val referedBy: Any,
        @SerializedName("refered_count")
        val referedCount: Int,
        @SerializedName("refered_key")
        val referedKey: String,
        @SerializedName("token")
        val token: String
    ) {
        data class OtpInfo(
            @SerializedName("expTime")
            val expTime: String,
            @SerializedName("otp")
            val otp: Int
        )
    }
}