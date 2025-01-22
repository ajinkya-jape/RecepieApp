package dev.ajinkyajape.recepieapp.models

/**
 * Created by Ajinkya Jape on 20/01/25.
 */

data class Category(val idCategory:String,
    val strCategory: String,
    val strCategoryThumb: String,
    val strCategoryDescription: String
    )

data class CategoriesResponse(val categories: List<Category>)