package com.example.project.ui.theme.screens.JobSeeker

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
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
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.project.navigation.ROUT_LOGIN
import com.example.project.navigation.ROUT_PROFILE
import com.example.project.ui.theme.Wgrey
import com.example.project.ui.theme.Wpurple

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun JobSeekerRegistrationScreen(navController: NavHostController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Black),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Signup Here",
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Cursive
        )
        Spacer(modifier = Modifier.height(15.dp))

        var name by remember { mutableStateOf("") }
        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }

        OutlinedTextField(modifier = Modifier
            .background(color = Wpurple)
            .fillMaxWidth()
            .padding(start = 15.dp, end = 15.dp),
            value = name,
            onValueChange = {name = it},
            label = { Text(text = "Name", color = Wgrey) },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Text
            )
        )

        Spacer(modifier = Modifier.height(30.dp))

        OutlinedTextField(modifier = Modifier.background(color = Wpurple)
            .fillMaxWidth()
            .padding(start = 15.dp, end = 15.dp),
            value = email,
            onValueChange = {email = it},
            label = { Text(text = "Email", color = Wgrey) },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email
            )
        )

        Spacer(modifier = Modifier.height(30.dp))


        OutlinedTextField(modifier = Modifier.background(color = Wpurple)
            .fillMaxWidth()
            .padding(start = 20.dp, end = 20.dp),
            value = password,
            onValueChange = {password = it},
            label = { Text(text = "Password", color = Wgrey) },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password
            )
        )

        Spacer(modifier = Modifier.height(30.dp))

        val context = LocalContext.current
        val authViewModel = AuthViewModel(navController, context)

        Button(onClick = {
            navController.navigate(ROUT_PROFILE)
            authViewModel.signup(name, email, )
        }, modifier = Modifier.background(color = Wpurple)) {
            Text(text = "Register ", color = Color.Black)
        }

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "have an account? login ",
            modifier = Modifier.clickable { navController.navigate(ROUT_LOGIN) },
            color = Wpurple,
            fontSize = 15.sp
        )



    }
}

@Composable
@Preview(showBackground = true)
fun JobSeekerRegistrationScreenPreview() {

    JobSeekerRegistrationScreen(navController = rememberNavController())

}