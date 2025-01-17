package com.test.kharchenko.heartrate

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import cafe.adriel.voyager.core.registry.ScreenRegistry
import cafe.adriel.voyager.navigator.Navigator
import com.test.kharchenko.heartrate.navigation.di.navigationModule
import com.test.kharchenko.heartrate.presentation.splashscreen.SplashScreen
import com.test.kharchenko.heartrate.ui.theme.HeartRateTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()

        ScreenRegistry(navigationModule)

        setContent {
            HeartRateTheme {
                Navigator(SplashScreen())
            }
        }
    }
}