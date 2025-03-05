package dev.ajinkyajape.recepieapp.utils

/**
 * Created by Ajinkya Jape on 05/03/25.
 */

sealed class Screens (val route: String) {
    object RecipeScreen:Screens("recipe_screen")
    object CategoryDetailScreen:Screens("category_detail_screen")
}