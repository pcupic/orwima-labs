package hr.ferit.patrikcupic.myapplication

import NavigationController
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import hr.ferit.patrikcupic.myapplication.data.RecipeViewModel
import hr.ferit.patrikcupic.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewModel by viewModels<RecipeViewModel>()
        setContent {
                NavigationController(viewModel)
        }
    }
}
