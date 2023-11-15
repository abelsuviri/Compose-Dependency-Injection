package com.abelsuviri.composedi

import com.abelsuviri.composedi.ScreenNavigation
import com.abelsuviri.composedi.ScreenNavigationImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class NavigationModule {
    @Binds
    abstract fun bindNavigation(screenNavigation: ScreenNavigationImpl): ScreenNavigation
}
