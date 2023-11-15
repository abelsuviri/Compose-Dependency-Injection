package com.abelsuviri.composedi

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import dagger.hilt.EntryPoint
import dagger.hilt.EntryPoints
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

private lateinit var injectedNavigationEntryPoint: InjectedNavigationEntryPoint

@Composable
fun provideInjectedNavigationEntryPoint(): InjectedNavigationEntryPoint {
    if (!::injectedNavigationEntryPoint.isInitialized) {
        injectedNavigationEntryPoint = EntryPoints.get(
            LocalContext.current.applicationContext,
            InjectedNavigationEntryPoint::class.java
        )
    }

    return injectedNavigationEntryPoint
}

@EntryPoint
@InstallIn(SingletonComponent::class)
interface InjectedNavigationEntryPoint {
    val screenNavigation: ScreenNavigation
}