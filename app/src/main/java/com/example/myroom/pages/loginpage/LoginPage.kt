package com.example.myroom.pages.loginpage

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.example.myroom.router.AppNavigator

@Composable
fun LoginPage(navcontroller: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Text(text = "LoginPage")
        Button(onClick = {
            navcontroller.navigate(AppNavigator.HomePage.route){
                popUpTo(AppNavigator.LoginPage.route){
                    inclusive=true
                }
            }
        }) {
            Text(text = "GO TO HOME PAGE !!")
        }
    }
}