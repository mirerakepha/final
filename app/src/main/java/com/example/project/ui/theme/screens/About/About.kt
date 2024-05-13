package com.example.project.ui.theme.screens.About

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
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
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.project.navigation.ROUT_DASHBOARD
import com.example.project.ui.theme.Wpurple

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun About(navController: NavHostController) {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.Black)
        .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {

        TopAppBar(
            title = { Text(text = "About") },
            modifier = Modifier.background(color = Wpurple),
            navigationIcon = {
                IconButton(onClick = {
                    navController.navigate(ROUT_DASHBOARD)
                }) {
                    Icon(
                        imageVector = Icons.Default.Clear, contentDescription = "arrowback",
                        tint = Color.White
                    )

                }

            },
        )

        Text(
            text = "Welcome to FindJobs\n" +
                    "\n" +
                    "As the developer of this platform, I am thrilled to introduce you to a revolutionary way of connecting job seekers with their dream opportunities. At [Your Company Name], our mission is to empower individuals like you to navigate the ever-evolving job market with confidence and ease.\n" +
                    "\n" +
                    "Here's what you can expect from FindJobs:\n" +
                    "\n" +
                    "    User-Centric Design: We've crafted every aspect of our app with your needs in mind. From intuitive navigation to personalized recommendations, we strive to make your job search experience seamless and enjoyable.\n" +
                    "\n" +
                    "    Comprehensive Job Listings: Gain access to a vast array of job openings across various industries and locations. Whether you're a recent graduate or a seasoned professional, there's something here for everyone.\n" +
                    "\n" +
                    "    Advanced Search Filters: Refine your search criteria to find the perfect match. Filter by job title, location, salary range, and more to pinpoint opportunities that align with your preferences and goals.\n" +
                    "\n" +
                    "    Real-Time Updates: Stay informed about the latest job postings and application statuses with our real-time notifications. Never miss out on an opportunity again!\n" +
                    "\n" +
                    "    Community Support: Join a thriving community of job seekers and industry professionals. Share insights, seek advice, and network with like-minded individuals to enhance your career prospects.\n" +
                    "\n" +
                    "    Data Security: Rest assured that your privacy and security are our top priorities. We employ state-of-the-art encryption and data protection measures to safeguard your personal information.\n" +
                    "\n" +
                    "Thank you for choosing FindJobs for your job search journey. We're excited to be a part of your success story!\n" +
                    "\n" +
                    "Happy job hunting\n" +
                    "\n" +
                    "Kepha Mirera\n" +
                    "Founder & Developer, RUBY",
            color = Wpurple,

            fontSize = 30.sp,
            modifier = Modifier.padding(start = 20.dp, end = 20.dp),
        )



    }
}

@Preview
@Composable
fun AboutScreenPreview() {
    About(rememberNavController())
}