package com.example.sampleapp.compose

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import com.example.sampleapp.viewmodel.CountriesViewModel

@Composable
fun CountryListScreen(viewModel: CountriesViewModel) {

    val countryList by viewModel.countriesListLiveData.observeAsState(emptyList())

    LaunchedEffect(Unit) {
        viewModel.getCountriesList()
    }

    Column {
        if (countryList.isEmpty()) {
            // Show loading indicator or placeholder
            Text(text = "Loading...")
        } else {
            // Display the list of country
            LazyColumn {
                items(items = countryList, itemContent = { country ->
                    country?.name?.let { Text(text = it) }
                    Divider()
                })
            }
        }
    }

}