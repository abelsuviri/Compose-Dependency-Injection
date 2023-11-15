package com.abelsuviri.composedi

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DependencyHolderViewModel @Inject constructor(
    private val getSomeDataUseCase: GetSomeDataUseCase,
    val screenNavigation: ScreenNavigation
) : ViewModel() {
    
}

@Composable
fun ViewModelDependencyHolderComposable(
    viewModel: DependencyHolderViewModel = hiltViewModel()
) {
    Button(onClick = { viewModel.screenNavigation.navigate() }) {
        Text(text = "Navigate")
    }
}
