package dev.ajinkyajape.recepieapp.ui.components

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import dev.ajinkyajape.recepieapp.models.Category
import dev.ajinkyajape.recepieapp.utils.Screens
import dev.ajinkyajape.recepieapp.viewmodel.RecipeViewModel

/**
 * Created by Ajinkya Jape on 05/03/25.
 */

@Composable
fun RecipeApp(navController: NavHostController) {
    val recipeViewModel: RecipeViewModel = viewModel()
    val viewstate by recipeViewModel.categoriesState

    NavHost(navController = navController, startDestination = Screens.RecipeScreen.route) {

        composable(route = Screens.RecipeScreen.route) {
            RecipeScreen(viewstate = viewstate,
                navigateToDetails = {
                    /*
                    * This part is responsible for passing data from the current screen to detail screen.
                    * */
                    navController.currentBackStackEntry?.savedStateHandle?.set("cat", it)
                    navController.navigate(Screens.CategoryDetailScreen.route)
                })
        }

        composable(route = Screens.CategoryDetailScreen.route) {

            val category = navController.previousBackStackEntry?.savedStateHandle?.
                get<Category>("cat") ?: Category("","","","")

            CategoryDetailScreen(category = category)
        }
    }

}