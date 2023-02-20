package com.bss.uis.data.remote

import com.bss.uis.data.remote.dto.response.PinCodeResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface PincodeInterface {

    @GET("{pin}")
    fun fetchPinData(@Path(value = "pin") pin: String?): Call<List<PinCodeResponse?>>
}