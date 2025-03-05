package dev.ajinkyajape.recepieapp.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

/**
 * Created by Ajinkya Jape on 20/01/25.
 */

@Parcelize
data class Category(val idCategory:String,
    val strCategory: String,
    val strCategoryThumb: String,
    val strCategoryDescription: String
    ):Parcelable

data class CategoriesResponse(val categories: List<Category>)