package com.example.project.ui.theme.screens.Notifications

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.project.navigation.ROUT_DASHBOARD
import com.example.project.ui.theme.Wpurple


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NotificationScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Black)
            .horizontalScroll(rememberScrollState())
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ){




        //Top app bar
        TopAppBar(title = { Text(text = "Profile") },
            //Back to the DashBoard
            navigationIcon = {
                IconButton(onClick = { navController.navigate(ROUT_DASHBOARD) }) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack, contentDescription = "marrowback",
                        tint = Color.Black
                    )

                }

            },

            modifier = Modifier.background(color = Wpurple)


        )


    }
    Spacer(modifier = Modifier.height(10.dp))

    Card(modifier = Modifier
        .fillMaxWidth()
        .padding(start = 10.dp, end = 10.dp)
        .height(100.dp)
        .background(color = Wpurple), ) {
        //Notification 1
        Text(text = "")
    }

    Spacer(modifier = Modifier.height(5.dp))

    Card(modifier = Modifier
        .fillMaxWidth()
        .padding(start = 10.dp, end = 10.dp)
        .height(100.dp)
        .background(color = Wpurple), ) {
        //Notification 2
        Text(text = "")
    }

    Spacer(modifier = Modifier.height(5.dp))

    Card(modifier = Modifier
        .fillMaxWidth()
        .padding(start = 10.dp, end = 10.dp)
        .height(100.dp)
        .background(color = Wpurple), ) {
        //Notification 3
        Text(text = "")
    }

    Spacer(modifier = Modifier.height(10.dp))

    Card(modifier = Modifier
        .fillMaxWidth()
        .padding(start = 10.dp, end = 10.dp)
        .height(100.dp)
        .background(color = Wpurple), ) {
        //Notification 4
        Text(text = "")
    }

    Spacer(modifier = Modifier.height(5.dp))

    Card(modifier = Modifier
        .fillMaxWidth()
        .padding(start = 10.dp, end = 10.dp)
        .height(100.dp)
        .background(color = Wpurple), ) {
        //Notification 5
        Text(text = "")
    }

    Spacer(modifier = Modifier.height(5.dp))

    Card(modifier = Modifier
        .fillMaxWidth()
        .padding(start = 10.dp, end = 10.dp)
        .height(100.dp)
        .background(color = Wpurple), ) {
        //Notification 6
        Text(text = "")
    }

    Spacer(modifier = Modifier.height(5.dp))

    Card(modifier = Modifier
        .fillMaxWidth()
        .padding(start = 10.dp, end = 10.dp)
        .height(100.dp)
        .background(color = Wpurple), ) {
        //Notification 7
        Text(text = "")
    }

}

@Preview
@Composable
fun NotificationScreenPreview() {
    NotificationScreen(rememberNavController())
}