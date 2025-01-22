package dev.ajinkyajape.recepieapp.api

import dev.ajinkyajape.recepieapp.models.CategoriesResponse
import retrofit2.http.GET

/**
 * Created by Ajinkya Jape on 20/01/25.
 */


interface ApiService{
    @GET("categories.php")
    suspend fun getCategories(): CategoriesResponse

}