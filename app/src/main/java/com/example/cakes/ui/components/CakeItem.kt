package com.example.cakes.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.cakes.model.CakeModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CakeItem(cake: CakeModel, onClick: () -> Unit) {
    Card(
        modifier = Modifier.padding(PaddingValues(all = 8.dp)),
        onClick = onClick
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = cake.name, style = MaterialTheme.typography.headlineSmall)
            Text(text = cake.shortDescription, style = MaterialTheme.typography.bodyMedium)
        }
    }
}
