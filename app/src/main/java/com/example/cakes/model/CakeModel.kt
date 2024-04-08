package com.example.cakes.model

data class CakeModel(
    val id: Int,
    val name: String,
    val shortDescription: String,
    val detailDescription: String,
    val ingredients: List<String>,
    val steps: List<String>,
    var isFavorite: Boolean = false
)
