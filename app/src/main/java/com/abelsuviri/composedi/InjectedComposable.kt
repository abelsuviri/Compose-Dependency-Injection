package com.abelsuviri.composedi

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun InjectedComposable(
    screenNavigation: ScreenNavigation = provideInjectedNavigationEntryPoint().screenNavigation
) {
    Button(onClick = { screenNavigation.navigate() }) {
        Text(text = "Navigate")
    }
}
