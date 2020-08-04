package com.starganteknologi.simposium.data.remote.service

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.*

interface LoginService {
    //1
    @Headers(
        "Content-Type: application/json"
    )
    @POST("api/login_check")
    fun login(@Body body: LoginRequest ) : Call<LoginResponse>

    //2
    companion object {
        //3
        val instance: LoginService by lazy {
            // 4
            val retrofit = Retrofit.Builder()
                .baseUrl("https://sigas-api.starganteknologi.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            // 5
            retrofit.create<LoginService>(
                LoginService::class.java) }
    }
}