package com.example.cakes.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.NavigationDrawerItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.cakes.repository.CakeRepository

@Composable
fun CakeDrawer(onCakeSelected: (Int) -> Unit) {
    Column(modifier = Modifier.padding(top = 24.dp)) {
        // Iterate over each cake in the repository
        CakeRepository.getAllCakes().forEach { cake ->
            NavigationDrawerItem(
                label = { Text(cake.name) },
                selected = false, // Implement selection logic as needed
                onClick = { onCakeSelected(cake.id) },
                modifier = Modifier.padding(vertical = 4.dp),
                // Apply Material Theme styles
                colors = NavigationDrawerItemDefaults.colors()
            )
        }
    }
}
