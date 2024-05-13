package com.example.project.ui.theme.screens.SplashScreen

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.project.R
import com.example.project.navigation.ROUT_CHOOSEROLE
import com.example.project.ui.theme.Wpurple
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun SplashScreen(navController: NavHostController) {

    Column(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.Black),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val coroutine = rememberCoroutineScope()
        coroutine.launch() {
            delay(5000)
            navController.navigate(ROUT_CHOOSEROLE)
        }
        //Animation
        Box (modifier = Modifier
            .fillMaxWidth(),
            contentAlignment = Alignment.Center){
            Image(

                painter = painterResource(id = R.drawable.jobify),
                contentDescription = "hellcat",
                modifier = Modifier
                    .size(300.dp)

            )
        }


        Spacer(modifier = Modifier.height(15.dp))



        //text
        Text(text = "Your Gateway To Career Success",
            color = Wpurple,
            fontWeight = FontWeight.Bold,
            fontSize = 30.sp)

        Spacer(modifier = Modifier.height(10.dp))


        Text(text = "Find your dream job easier and faster",
            color = Color.LightGray,
            fontSize = 15.sp)



    }

}

@Preview
@Composable
fun SplashScreenPreview() {
    SplashScreen(rememberNavController())
}