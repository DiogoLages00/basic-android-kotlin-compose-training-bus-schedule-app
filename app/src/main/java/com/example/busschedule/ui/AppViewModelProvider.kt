package com.example.busschedule.ui

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.busschedule.BusScheduleApplication


object AppViewModelProvider {
    val Factory : ViewModelProvider.Factory = viewModelFactory {
        initializer {
            BusScheduleViewModel(
                busScheduleApplication().container.busScheduleRepository
            )
        }
    }
}

fun CreationExtras.busScheduleApplication(): BusScheduleApplication =
    (this[AndroidViewModelFactory.APPLICATION_KEY] as BusScheduleApplication)
