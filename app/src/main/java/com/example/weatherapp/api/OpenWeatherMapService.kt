package com.example.weatherapp.api

import com.example.weatherapp.model.OpenWeatherMapResponseData
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface OpenWeatherMapService {
    @GET("weather")
    fun getWeather(
        @Query("Nur-Sultan") location: String,
        @Query("ec804500f3d04ca2935ecfc36a593c73") token: String
    ) : Call<OpenWeatherMapResponseData>
}