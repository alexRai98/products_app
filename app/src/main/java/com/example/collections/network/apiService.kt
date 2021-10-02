package com.example.collections.network

import retrofit2.http.GET
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

const val BASE_URL = "https://api.github.com/"
interface ApiService {
    @GET("")
    fun getAllProducts(): String
}

private var retrofit = Retrofit.Builder()
    .baseUrl(BASE_URL)
    .addConverterFactory(MoshiConverterFactory.create())
    .build()

var service: ApiService = retrofit.create(ApiService::class.java)