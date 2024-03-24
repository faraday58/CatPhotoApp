package com.mexiti.catphotoapp.network

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import com.mexiti.catphotoapp.model.CatPhoto
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit
import retrofit2.http.GET


interface CatApiService{
    @GET("v1/images/search?limit=10")
    suspend fun getPhotos():List<CatPhoto>
}

