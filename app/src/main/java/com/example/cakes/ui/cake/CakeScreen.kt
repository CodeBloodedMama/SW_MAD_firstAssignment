package com.example.cakes.ui.cake

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.example.cakes.model.CakeModel
import com.example.cakes.ui.components.CakeItem

@Composable
fun CakeScreen(cakes: List<CakeModel>, onCakeClicked: (Int) -> Unit) {
    LazyColumn {
        items(cakes) { cake ->
            CakeItem(cake = cake) {
                onCakeClicked(cake.id)
            }
        }
    }
}
