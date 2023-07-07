package com.example.sampleapp

import com.example.sampleapp.service.CountryService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    private const val BASE_URL = "https://countriesnow.space/api/v0.1/"

    private val retrofitInstance: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val countryService: CountryService by lazy {
        retrofitInstance.create(CountryService::class.java)
    }
}