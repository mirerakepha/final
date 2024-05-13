package com.example.project.ui.theme.screens.Settings

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.project.navigation.ROUT_ABOUT
import com.example.project.navigation.ROUT_CHOOSEROLE
import com.example.project.navigation.ROUT_DASHBOARD
import com.example.project.navigation.ROUT_PROFILE
import com.example.project.ui.theme.Wpurple

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SettingsScreen(navController: NavHostController) {
    Column (modifier = Modifier.fillMaxSize()){
        var mContext = LocalContext.current


        TopAppBar(title = { Text(text = "Settings") },
            //Back to the DashBoard
            navigationIcon = {
                IconButton(onClick = { navController.navigate(ROUT_DASHBOARD)}) {
                    Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "back")

                }


            },

            modifier = Modifier.background(color = Wpurple)


        )

        Spacer(modifier = Modifier.height(5.dp))



        //log out
        Card(modifier = Modifier
            .fillMaxWidth()
            .clickable { navController.navigate(ROUT_CHOOSEROLE)
                Toast.makeText(mContext, "please wait",
                    Toast.LENGTH_SHORT).show() }
            .padding(start = 10.dp, end = 10.dp)
            .height(100.dp)
            .background(color = Wpurple), ) {
            //log out
            Text(text = "Log Out", color = Color.Black )

        }



        //Edit Profile
        Card(modifier = Modifier
            .fillMaxWidth()
            .clickable { navController.navigate(ROUT_PROFILE)
                Toast.makeText(mContext, "please wait",
                    Toast.LENGTH_SHORT).show() }
            .padding(start = 10.dp, end = 10.dp)
            .height(100.dp)
            .background(color = Wpurple), ) {
            //Edit Profile
            Text(text = "Edit Profile",color = Color.Black
            )

        }


        //About
        Card(modifier = Modifier
            .fillMaxWidth()
            .clickable { navController.navigate(ROUT_ABOUT)
                Toast.makeText(mContext, "please wait",
                    Toast.LENGTH_SHORT).show() }
            .padding(start = 10.dp, end = 10.dp)
            .height(100.dp)
            .background(color = Wpurple), ) {
            //About
            Text(text = "About", color  = Color.Black
            )

        }




    }

}

@Preview
@Composable
fun SettingsScreenPreview() {
    SettingsScreen(rememberNavController())
}