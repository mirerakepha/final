package com.example.project.ui.theme.screens.Profile

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.project.R
import com.example.project.navigation.ROUT_DASHBOARD
import com.example.project.navigation.ROUT_SETTINGS
import com.example.project.ui.theme.Wpurple

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileScreen(navController: NavHostController) {


    Column(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.Black), horizontalAlignment = Alignment.CenterHorizontally) {
        TopAppBar(title = { Text(text = "Profile") },
            //Back to the DashBoard
            navigationIcon = {
                IconButton(onClick = { navController.navigate(ROUT_DASHBOARD) }) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack, contentDescription = "arrowback",
                        tint = Color.Black
                    )

                }

            },
            actions = {
                //editting icon
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Edit, contentDescription = "add",
                        tint = Color.Black
                    )

                }

                //settings icon
                IconButton(onClick = { navController.navigate(ROUT_SETTINGS) }) {
                    Icon(
                        imageVector = Icons.Default.Settings, contentDescription = "settings",
                        tint = Color.Black
                    )

                }
            },

            modifier = Modifier.background(color = Wpurple)


        )
        //End of top app bar

        Spacer(modifier = Modifier.height(10.dp))

        //profile Photo
        Box (modifier = Modifier
            .fillMaxWidth(),
            contentAlignment = Alignment.Center){
            Image(
                painter = painterResource(id = R.drawable.jobify),
                contentDescription = "hellcat",
                modifier = Modifier
                    .size(350.dp)


            )
        }
        Spacer(modifier = Modifier.height(10.dp))


        //Full Names
        var fullnames by remember { mutableStateOf("") }


        TextField(value = fullnames, onValueChange = {fullnames = it},

            placeholder = { Text(text = "Enter firstname") },
            leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "PERSON") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )

        Spacer(modifier = Modifier.height(20.dp))


        //Email
        var email by remember { mutableStateOf("") }
        TextField(value = email, onValueChange = {fullnames = it},
            placeholder = { Text(text = "Email address") },
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "PERSON") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )


        Spacer(modifier = Modifier.height(20.dp))



        //Contact
        var contact by remember { mutableStateOf("") }
        TextField(value = contact, onValueChange = {contact = it},
            placeholder = { Text(text = "Contact") },
            leadingIcon = { Icon(imageVector = Icons.Default.Phone, contentDescription = "PERSON") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )


        Spacer(modifier = Modifier.height(20.dp))


        //Field

        //Experience
        //Current location (city + country)
        var location by remember { mutableStateOf("") }
        TextField(value = location, onValueChange = {location = it},
            placeholder = { Text(text = "Location") },
            leadingIcon = { Icon(imageVector = Icons.Default.LocationOn, contentDescription = "PERSON") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )

        Spacer(modifier = Modifier.height(20.dp))


        var bio by remember { mutableStateOf("") }

        TextField(value = bio, onValueChange = {bio = it},
            placeholder = { Text(text = "Bio") },

            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )







    }


}

@Preview
@Composable
fun ProfileScreenPreview() {
    ProfileScreen(rememberNavController())
}