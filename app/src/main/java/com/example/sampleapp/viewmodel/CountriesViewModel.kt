package com.example.sampleapp.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.sampleapp.model.Countries
import com.example.sampleapp.service.CountriesRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class CountriesViewModel: ViewModel() {

    private val countriesRepository: CountriesRepository = CountriesRepository()
    private val countriesMutableLiveData = MutableLiveData<List<Countries>>()

    val countriesListLiveData: LiveData<List<Countries>> = countriesMutableLiveData

    fun getCountriesList() {
        viewModelScope.launch() {
            try {
                val countriesList = countriesRepository.getCountriesList()
                countriesMutableLiveData.value = countriesList
            } catch(e:Exception) { }
        }
    }


}