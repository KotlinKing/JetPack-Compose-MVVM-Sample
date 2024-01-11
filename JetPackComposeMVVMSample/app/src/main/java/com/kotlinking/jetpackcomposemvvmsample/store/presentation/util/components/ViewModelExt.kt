package com.kotlinking.jetpackcomposemvvmsample.store.presentation.util.components

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.kotlinking.jetpackcomposemvvmsample.util.EventBus
import kotlinx.coroutines.launch

fun ViewModel.sendEvent(event: Any) {
    viewModelScope.launch {
        EventBus.sendEvent(event)
    }
}