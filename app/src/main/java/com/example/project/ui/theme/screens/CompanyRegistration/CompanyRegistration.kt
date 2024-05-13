package com.example.project.ui.theme.screens.CompanyRegistration

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.project.navigation.ROUT_APPLICATIONS
import com.example.project.navigation.ROUT_LOGIN
import com.example.project.ui.theme.Wpurple


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CompanyRegistrationScreen(navController: NavHostController) {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.Black)
    ) {
        Text(text = "Register here",
            color = Color.White)

        var email by remember { mutableStateOf(TextFieldValue("")) }
        var password by remember { mutableStateOf(TextFieldValue("")) }
        var context = LocalContext.current

        OutlinedTextField(value = email , onValueChange = {email=it})

        OutlinedTextField(value = password , onValueChange = {password=it})

        Button(onClick = {
            navController.navigate(ROUT_APPLICATIONS)
            // HANDLE SIGNUP LOGIC //
            var xyz = AuthViewModel(navController, context)
            xyz.signup(email.text.trim(),password.text.trim())

        }) {
            Text(text = "Signup")
        }

        Text(text = "have an account? login ",
            modifier = Modifier.clickable { navController.navigate(ROUT_LOGIN) },
            color = Wpurple,
            fontSize = 15.sp
        )


    }

}

@Preview
@Composable
fun CompanyRegistrationScreenPreview() {
    CompanyRegistrationScreen(rememberNavController())
}