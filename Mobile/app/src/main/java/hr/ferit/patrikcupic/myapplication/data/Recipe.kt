package hr.ferit.patrikcupic.myapplication.data

import androidx.annotation.DrawableRes
import hr.ferit.patrikcupic.myapplication.R
import hr.ferit.patrikcupic.myapplication.data.Ingredient

data class Recipe(
    var id: String = "",
    val image: String = "",
    val title: String = "",
    val category: String = "",
    val cookingTime: String = "",
    val energy: String = "",
    val rating: String = "",
    val description: String = "",
    val reviews: String = "",
    val ingredients: List<Ingredient> = listOf(),
    var isFavorite: Boolean = false
)
data class Ingredient(
    val image: String = "",
    val title: String = "",
    val subtitle: String = ""
)


/*
val recipes: List<Recipe> = listOf(
    Recipe(
        image = R.drawable.strawberry_pie_1,
        title = "Strawberry Cake",
        category = "Desserts",
        cookingTime = "50 min",
        energy = "620 kcal",
        rating = "4.9",
        description = "This dessert is very tasty and not difficult to prepare. Also, you can replace strawberries with any other berry you like.",
        reviews = "84 photos 430 comments",
        ingredients = listOf(
            Ingredient(R.drawable.flour, "Flour", "450 g"),
            Ingredient(R.drawable.eggs, "Eggs", "4"),
            Ingredient(R.drawable.juice, "Lemon juice", "150 g"),
            Ingredient(R.drawable.strawberry, "Strawberry", "200 g"),
            Ingredient(R.drawable.suggar, "Sugar", "1 cup"),
            Ingredient(R.drawable.mint, "Mint", "20 g"),
            Ingredient(R.drawable.vanilla, "Vanilla", "1/2 teaspoon")
        )
    ),
    Recipe(
        image = R.drawable.strawberry_pie_2,
        title = "Strawberry Cake 2",
        category = "Desserts",
        cookingTime = "50 min",
        energy = "620 kcal",
        rating = "4.8",
        description = "A delightful cake that combines the sweetness of strawberries with a light sponge.",
        reviews = "50 photos 200 comments",
        ingredients = listOf(
            Ingredient(R.drawable.flour, "Flour", "500 g"),
            Ingredient(R.drawable.eggs, "Eggs", "5"),
            Ingredient(R.drawable.juice, "Lemon juice", "100 g"),
            Ingredient(R.drawable.strawberry, "Strawberry", "250 g"),
            Ingredient(R.drawable.suggar, "Sugar", "1.5 cups"),
            Ingredient(R.drawable.mint, "Mint", "15 g"),
            Ingredient(R.drawable.vanilla, "Vanilla", "1 teaspoon")
        )
    ),
    Recipe(
        image = R.drawable.strawberry_pie_3,
        title = "Strawberry Cake 3",
        category = "Desserts",
        cookingTime = "60 min",
        energy = "650 kcal",
        rating = "4.7",
        description = "A rich and creamy strawberry cake perfect for special occasions.",
        reviews = "30 photos 150 comments",
        ingredients = listOf(
            Ingredient(R.drawable.flour, "Flour", "400 g"),
            Ingredient(R.drawable.eggs, "Eggs", "3"),
            Ingredient(R.drawable.juice, "Lemon juice", "120 g"),
            Ingredient(R.drawable.strawberry, "Strawberry", "300 g"),
            Ingredient(R.drawable.suggar, "Sugar", "1 cup"),
            Ingredient(R.drawable.mint, "Mint", "10 g"),
            Ingredient(R.drawable.vanilla, "Vanilla", "1 teaspoon")
        )
    )
)
*/