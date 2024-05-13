package com.example.project.ui.theme.screens.signup

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.project.data.AuthViewModel
import com.example.project.navigation.ROUT_LOGIN
import com.example.project.ui.theme.Wpurple

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignupScreen(navController: NavHostController) {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.Black),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {

        Text(text = "Register here")

        var email by remember { mutableStateOf(TextFieldValue("")) }
        var password by remember { mutableStateOf(TextFieldValue("")) }
        var context = LocalContext.current

        OutlinedTextField(value = email , onValueChange = {email=it})

        OutlinedTextField(value = password , onValueChange = {password=it})

        Button(onClick = {
            // HANDLE SIGNUP LOGIC //
            var xyz = AuthViewModel(navController, context)
            xyz.signup(email.text.trim(),password.text.trim())

        }) {
            Text(text = "Signup")
        }

        Button(onClick = {
            navController.run { navigate(ROUT_LOGIN)}
        }, modifier = Modifier.background(color = Wpurple)) {
            Text(text = "Have account? Login",
                color = Color.Black)
        }


    }
}

@Preview
@Composable
fun SignupScreenPreview() {
    SignupScreen(rememberNavController())
}