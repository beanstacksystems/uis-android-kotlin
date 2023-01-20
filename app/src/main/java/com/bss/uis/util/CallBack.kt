package com.bss.uis.util

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import kotlin.coroutines.Continuation
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException
import kotlin.coroutines.suspendCoroutine


suspend fun <T> Call<T>.awaitRespo(): T = suspendCoroutine { continuation ->
    val callback = object : Callback<T> {
        override fun onResponse(call: Call<T>, response: Response<T>) {
            continuation.resumeNormallyOrWithException {
                response.isSuccessful || throw IllegalStateException("Http error ${response.code()}")
                response.body() ?: throw IllegalStateException("Response body is null")
            }
        }
        override fun onFailure(call: Call<T>, t: Throwable) = continuation.resumeWithException(t)
    }
    enqueue(callback)
}

private inline fun <T> Continuation<T>.resumeNormallyOrWithException(getter: () -> T) = try {
    val result = getter()
    resume(result)
} catch (exception: Throwable) {
    resumeWithException(exception)
}

// crVelox