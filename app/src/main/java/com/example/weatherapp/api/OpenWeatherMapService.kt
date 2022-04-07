package com.example.weatherapp.api

import com.example.weatherapp.model.OpenWeatherMapResponseData
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface OpenWeatherMapService {
    @GET("weather")
    fun getWeather(
        @Query("q") location: String,
        @Query("appid") token: String
    ) : Call<OpenWeatherMapResponseData>
}