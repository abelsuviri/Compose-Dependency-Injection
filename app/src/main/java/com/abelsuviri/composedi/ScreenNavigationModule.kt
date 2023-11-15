package com.abelsuviri.composedi

import org.koin.dsl.module

val navigationModule = module {
    single<ScreenNavigation> { ScreenNavigationImpl() }
}
