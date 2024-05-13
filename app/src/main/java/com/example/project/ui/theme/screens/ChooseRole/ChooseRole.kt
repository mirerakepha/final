package com.example.project.ui.theme.screens.ChooseRole

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.project.navigation.ROUT_COMPANYREGISTRATION
import com.example.project.navigation.ROUT_JOBSEEKER
import com.example.project.ui.theme.Wpurple

@Composable
fun ChooseRoleScreen(navController: NavHostController) {

    Column(modifier = Modifier
        .background(color = Color.Black),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {


        //Button for Company
        Button(onClick = {
            navController.navigate(ROUT_COMPANYREGISTRATION)
        }, modifier = Modifier
            .background(color = Wpurple)
            .padding(start = 15.dp, end = 15.dp)) {

            Text(text = "Register Company",
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                fontSize = 15.sp)

        }


        Spacer(modifier = Modifier.height(30.dp))


        //Button for JobSeeker
        Button(onClick = {
            navController.navigate(ROUT_JOBSEEKER)
        }, modifier = Modifier
            .background(color = Wpurple)
            .padding(start = 15.dp, end = 15.dp)) {
            Text(text = "Register As Jobseekeer",
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                fontSize = 15.sp)


        }
    }

}

@Preview
@Composable
fun ChooseRoleScreenPreview() {
    ChooseRoleScreen(rememberNavController())
}