package com.example.cakes.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable

@Composable
fun MenuBar(onMenuItemClicked: (String) -> Unit) {
    Column {
        // Add menu items here
        MenuItem(text = "Home") { onMenuItemClicked("Home") }
        MenuItem(text = "Favorites") { onMenuItemClicked("Favorites") }

    }
}
