package com.example.cakes.ui.cake.details

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.cakes.repository.CakeRepository
import com.example.cakes.ui.theme.CakesTheme

class CakeDetailsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val cakeId = intent.getIntExtra("cakeId", -1)
        val cakeDetails = CakeRepository.getCakeById(cakeId)

        cakeDetails?.let { cake ->
            setContent {
                CakesTheme {

                    CakeDetailsScreen(cake = cake)
                }
            }
        } ?: finish()
    }
}
