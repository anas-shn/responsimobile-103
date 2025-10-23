package com.example.responsi1mobileh1d023103.data.network

import com.example.responsi1mobileh1d023103.data.model.SearchResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers

interface FootballApi {
    @Headers("X-Auth-Token: 92577d3c5cf8499e952b2c75e5ccf442")
    @GET("teams/583")
    suspend fun getData(): Response<SearchResponse>
}