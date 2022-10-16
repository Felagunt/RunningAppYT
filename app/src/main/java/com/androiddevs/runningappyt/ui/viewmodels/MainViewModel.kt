package com.androiddevs.runningappyt.ui.viewmodels

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.androiddevs.runningappyt.repositories.MainRepository
import javax.inject.Inject

//@HiltViewModel
//class MainViewModel @Inject constructor(
//    val mainRepository: MainRepository
//): ViewModel() {

class MainViewModel @ViewModelInject constructor(
    val mainRepository: MainRepository
): ViewModel() {
}