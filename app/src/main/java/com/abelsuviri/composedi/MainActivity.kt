package com.abelsuviri.composedi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.abelsuviri.composedi.ui.theme.ComposeDITheme
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    
    @Inject
    lateinit var screenNavigation: ScreenNavigation
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeDITheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column {
                        Greeting(screenNavigation)
                        InjectedComposable()
                        ViewModelDependencyHolderComposable()
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(screenNavigation: ScreenNavigation) {
    GreetingDetailed(screenNavigation = screenNavigation)
}

@Composable
fun GreetingDetailed(screenNavigation: ScreenNavigation) {
    Button(onClick = { screenNavigation.navigate() }) {
        androidx.compose.material.Text(text = "Navigate")
    }
}
