package com.example.project.ui.theme.screens.Help

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.project.ui.theme.Wpurple

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HelpScreen(navController: NavHostController) {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.Black),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        TopAppBar(title = { "Help" },



            )

        Text(text = "Welcome to FindJobs! We're here to make your experience as smooth and enjoyable as possible. If you ever find yourself unsure of how to navigate through our features or need assistance with any aspect of the app, you're in the right place. This help screen serves as your go-to resource for answers to commonly asked questions and guidance on using our app's functionalities. Whether you're a seasoned user or just getting started, we're committed to providing clear and concise instructions to help you make the most out of your time here.\n" +
                "\n" +
                "From setting up your account to exploring advanced features, we've got you covered. Feel free to browse through the topics listed or use the search bar to find specific answers. If you can't find what you're looking for, don't hesitate to reach out to our support team directly. We're dedicated to ensuring that your journey with our app is seamless and enjoyable, and we're here to assist you every step of the way.",
            color = Wpurple)



    }
}

@Preview
@Composable
fun HelpScreenPreview() {
    HelpScreen(rememberNavController())
}