package com.example.api

import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {
    @GET("posts/1")
    fun getData(): Call<List<MyDataItem>>

}