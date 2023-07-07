package com.example.sampleapp.model

import com.google.gson.annotations.SerializedName

data class Countries (
    @SerializedName("name"    ) var name    : String? = null,
    @SerializedName("capital" ) var capital : String? = null,
    @SerializedName("iso2"    ) var iso2    : String? = null,
    @SerializedName("iso3"    ) var iso3    : String? = null
)
