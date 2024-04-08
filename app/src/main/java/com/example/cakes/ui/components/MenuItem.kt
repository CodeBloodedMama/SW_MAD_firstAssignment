package com.example.cakes.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItem
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

// Defining a composable function for a menu item in the drawer
@Composable
fun MenuItem(icon: ImageVector, label: String, onClick: () -> Unit) {
    // Using Row for horizontal arrangement of icon and text
    Row(
        modifier = Modifier
            .clickable(onClick = onClick) // Making the Row clickable
            .padding(8.dp) // Adding padding around the Row
    ) {
        Icon(
            imageVector = icon,
            contentDescription = label,
            modifier = Modifier.padding(end = 8.dp) // Padding between the icon and the text
        )
        Text(
            text = label,
            style = MaterialTheme.typography.bodyLarge // Applying typography from the Material theme
        )
    }
}

// A sample usage of MenuItem in a Composable
@Composable
fun MenuItemSample() {
    MenuItem(
        icon = Icons.Filled.Favorite,
        label = "Favorites",
        onClick = { /* Handle click here */ }
    )
}
