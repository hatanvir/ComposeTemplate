package com.tvr.myapplication.features.home

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.DateRange
import androidx.lifecycle.ViewModel
import com.tvr.myapplication.R

/**
 * Created by Tanvir Hasan on 18-02-2024 : 04-01.
 * Email: mhasan@intelehealth.org
 */
class HomeViewModel : ViewModel() {
    val bottomNavigationItems = listOf(
        BottomNavigationScreens.Post,
        BottomNavigationScreens.Photo,
        BottomNavigationScreens.Album,
        BottomNavigationScreens.Todo
    )
}

sealed class BottomNavigationScreens<VectorAsset>(val route: String, val icon: VectorAsset) {
    object Post : BottomNavigationScreens<Any?>("Post", Icons.Filled.CheckCircle)
    object Photo : BottomNavigationScreens<Any?>("Photo", Icons.Filled.AccountBox)
    object Album : BottomNavigationScreens<Any?>("Album",  Icons.Filled.AccountCircle)
    object Todo : BottomNavigationScreens<Any?>("Todo",  Icons.Filled.DateRange)
}