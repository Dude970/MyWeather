package com.example.myweather.data.forecastModels

data class Weather(
    val description: String,
    val icon: String,
    val id: Int,
    val main: String
)