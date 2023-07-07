package com.example.sampleapp.model

import com.google.gson.annotations.SerializedName


data class CountriesResponse (
    @SerializedName("error" ) var error : Boolean?        = null,
    @SerializedName("msg"   ) var msg   : String?         = null,
    @SerializedName("data"  ) var countryList  : ArrayList<Countries> = arrayListOf()
)