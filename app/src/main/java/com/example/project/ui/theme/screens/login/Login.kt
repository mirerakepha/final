package com.example.project.ui.theme.screens.login

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
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
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.project.navigation.ROUT_DASHBOARD
import com.example.project.navigation.ROUT_JOBSEEKER
import com.example.project.ui.theme.Wpurple

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(navController: NavHostController) {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.Black), horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Login here")
        Spacer(modifier = Modifier.height(15.dp))

        var email by remember { mutableStateOf(TextFieldValue("")) }
        var password by remember { mutableStateOf(TextFieldValue("")) }
        var context = LocalContext.current

        OutlinedTextField(modifier = Modifier
            .background(color = Wpurple)
            .fillMaxWidth()
            .padding(start = 15.dp, end = 15.dp),value = email , onValueChange = {email=it})

        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(modifier = Modifier
            .background(color = Wpurple)
            .fillMaxWidth()
            .padding(start = 15.dp, end = 15.dp),value = password , onValueChange = {password=it},
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "search"
                )
            })

        Button(modifier = Modifier
            .background(color = Wpurple)
            .padding(start = 30.dp, end = 30.dp),
            onClick = {navController.navigate(ROUT_DASHBOARD)
                // HANDLE LOGIN LOGIC //
                var xyz = AuthViewModel(navController, context)
                xyz.login(email.text,password.text)

            }) {
            Text(text = "Login", color = Color.Black)
        }

        Spacer(modifier = Modifier.height(20.dp))


        Text(text = "No Account? SignUp",
            modifier = Modifier
                .clickable { navController.navigate(ROUT_JOBSEEKER) })


    }
}

@Preview
@Composable
fun LoginScreenPreview() {
    LoginScreen(rememberNavController())
}