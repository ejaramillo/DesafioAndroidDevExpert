package com.example.desafioandroiddevexperto

import retrofit2.http.GET

interface MoviesService {
    
    @GET("discover/movie?api_key=72c1ba5ee0c235cc46c840db7216d154")
    suspend fun getMovies(): MovieResult
}