package com.example.dima.kotlinstart.network

import com.example.dima.kotlinstart.model.Android
import io.reactivex.Observable
import retrofit2.http.GET

interface RequestInterface {

    @GET("api/android")
    fun getData() : Observable<List<Android>>
}