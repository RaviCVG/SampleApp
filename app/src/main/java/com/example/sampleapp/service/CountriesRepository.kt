package com.example.sampleapp.service

import com.example.sampleapp.RetrofitInstance
import com.example.sampleapp.model.Countries

class CountriesRepository {
    private val countryService = RetrofitInstance.countryService
    /*private val countryService:CountryService by lazy {
        RetrofitInstance.countryService
    }*/

    suspend fun getCountriesList(): List<Countries> {
        val countryResponse = countryService.getCountries()
        return countryResponse.countryList
    }
}