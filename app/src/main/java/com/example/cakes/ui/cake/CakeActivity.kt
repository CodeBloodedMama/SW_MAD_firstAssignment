package com.example.cakes.ui.cake

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.cakes.repository.CakeRepository
import com.example.cakes.ui.theme.CakesTheme
import com.example.cakes.ui.cake.details.CakeDetailsActivity


class CakeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CakesTheme {
                CakeScreen(cakes = CakeRepository.getAllCakes()) { cakeId ->
                    val intent = Intent(this, CakeDetailsActivity::class.java).apply {
                        putExtra("cakeId", cakeId)
                    }
                    startActivity(intent)
                }
            }
        }
    }
}
