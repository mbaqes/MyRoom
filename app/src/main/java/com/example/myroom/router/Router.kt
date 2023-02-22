package com.example.myroom.router

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myroom.pages.homepage.HomePage
import com.example.myroom.pages.loginpage.LoginPage


@Composable
fun Router() {
    val navcontroller = rememberNavController()
    NavHost(navController = navcontroller, startDestination =AppNavigator.LoginPage.route) {
        composable(route = AppNavigator.LoginPage.route){
          LoginPage(navcontroller)
        }
        composable(route = AppNavigator.HomePage.route){
            HomePage(navcontroller)
        }

    }
}