package com.example.sampleapp.service

import com.example.sampleapp.model.CountriesResponse
import retrofit2.http.GET

interface CountryService {

    @GET("countries/capital")
    suspend fun getCountries(): CountriesResponse
}