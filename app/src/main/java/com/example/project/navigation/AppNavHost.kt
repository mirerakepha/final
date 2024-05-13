package com.example.project.navigation

import android.window.SplashScreen
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.project.ui.theme.screens.About.About
import com.example.project.ui.theme.screens.Applications.Applications
import com.example.project.ui.theme.screens.ChooseRole.ChooseRoleScreen
import com.example.project.ui.theme.screens.CompanyRegistration.CompanyRegistrationScreen
import com.example.project.ui.theme.screens.DashBoard.DashBoardScreen
import com.example.project.ui.theme.screens.JobSeeker.JobSeekerRegistrationScreen
import com.example.project.ui.theme.screens.Notifications.NotificationScreen
import com.example.project.ui.theme.screens.Profile.ProfileScreen
import com.example.project.ui.theme.screens.Settings.SettingsScreen
import com.example.project.ui.theme.screens.SplashScreen.SplashScreen
import com.example.project.ui.theme.screens.login.LoginScreen
import com.example.project.ui.theme.screens.signup.SignupScreen


@Composable
fun AppNavHost(modifier: Modifier = Modifier, navController: NavHostController = rememberNavController(), startDestination:String = ROUT_LOGIN) {
    NavHost(navController = navController, modifier=modifier, startDestination = startDestination){


        composable(ROUT_LOGIN){
            LoginScreen(navController)
        }

        composable(ROUT_SIGNUP){
            SignupScreen(navController)
        }



        composable(ROUT_DASHBOARD){
            DashBoardScreen(navController)
        }

        composable(ROUT_SPLASH){
            SplashScreen(navController)
        }

        composable(ROUT_JOBSEEKER){
            JobSeekerRegistrationScreen(navController)
        }

        composable(ROUT_CHOOSEROLE){
            ChooseRoleScreen(navController)
        }

        composable(ROUT_PROFILE){
            ProfileScreen(navController)
        }

        composable(ROUT_COMPANYREGISTRATION){
            CompanyRegistrationScreen(navController)
        }


        composable(ROUT_NOTIFICATION){
            NotificationScreen(navController)
        }


        composable(ROUT_ABOUT){
            About(navController)
        }


        composable(ROUT_APPLICATIONS){
            Applications(navController)
        }

        composable(ROUT_SETTINGS){
            SettingsScreen(navController)
        }
    }
}

