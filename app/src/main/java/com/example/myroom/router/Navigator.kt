package com.example.myroom.router

sealed class AppNavigator(val route :String) {
    object LoginPage:AppNavigator(route = "LoginPage")
    object HomePage:AppNavigator(route = "HomePage")
}