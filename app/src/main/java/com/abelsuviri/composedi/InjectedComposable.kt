package com.abelsuviri.composedi

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import org.koin.compose.koinInject

@Composable
fun InjectedComposable(
    screenNavigation: ScreenNavigation = koinInject()
) {
    Button(onClick = { screenNavigation.navigate() }) {
        Text(text = "Navigate")
    }
}
