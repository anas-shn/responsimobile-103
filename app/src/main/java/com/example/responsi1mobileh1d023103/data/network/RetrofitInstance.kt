package com.example.responsi1mobileh1d023103.data.network

import com.example.responsi1mobileh1d023103.utils.Constans
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class RetrofitInstance {
val api: FootballApi by lazy {
    Retrofit.Builder()
        .baseUrl(Constans.BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(FootballApi::class.java)
}
}