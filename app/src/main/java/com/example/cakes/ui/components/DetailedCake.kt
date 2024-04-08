package com.example.cakes.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.cakes.model.CakeModel

@Composable
fun DetailedCake(cake: CakeModel) {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(text = cake.name, style = MaterialTheme.typography.headlineMedium)
        Text(text = cake.detailDescription, style = MaterialTheme.typography.bodyMedium, modifier = Modifier.padding(top = 8.dp))

        // Display ingredients
        Text(text = "Ingredients:", style = MaterialTheme.typography.titleMedium, modifier = Modifier.padding(top = 16.dp))
        cake.ingredients.forEach { ingredient ->
            Text(text = "- $ingredient", style = MaterialTheme.typography.bodyMedium, modifier = Modifier.padding(start = 16.dp))
        }

        // Display steps
        Text(text = "Steps:", style = MaterialTheme.typography.titleMedium, modifier = Modifier.padding(top = 16.dp))
        cake.steps.forEachIndexed { index, step ->
            Text(text = "${index + 1}. $step", style = MaterialTheme.typography.bodyMedium, modifier = Modifier.padding(start = 16.dp, top = 8.dp))
        }
    }
}
