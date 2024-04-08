package com.example.cakes.repository
import com.example.cakes.model.CakeModel

object CakeRepository {
    private val cakeList = listOf(
        CakeModel(
            id = 1,
            name = "Classic Chocolate Cake",
            shortDescription = "A rich chocolate cake for all occasions.",
            detailDescription = "This is a detailed description of the Classic Chocolate Cake...",
            ingredients = listOf(
                "1/2 cup cocoa powder",
                "2 cups all-purpose flour",
                // ... other ingredients
            ),
            steps = listOf(
                "Preheat the oven to 350°F.",
                "Mix the dry ingredients together.",
                // ... other steps
            )
        ),
        // Add more recipes...
    )

    fun getAllCakes(): List<CakeModel> = cakeList

    fun getCakeById(id: Int): CakeModel? = cakeList.find { it.id == id }

    fun toggleFavorite(id: Int) {
        val cake = getCakeById(id)
        cake?.let {
            it.isFavorite = !it.isFavorite
        }
    }
}