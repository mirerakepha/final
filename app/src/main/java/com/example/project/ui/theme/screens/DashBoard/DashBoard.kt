package com.example.project.ui.theme.screens.DashBoard

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material.icons.outlined.MailOutline
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.project.R
import com.example.project.navigation.ROUT_PROFILE
import com.example.project.ui.theme.Wpurple


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)




@Composable
fun DashBoardScreen(navController: NavHostController) {
    val mContext = LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Black)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        TopAppBar(title = { Text(text = "FindJobs", color = Color.Black) },
            modifier = Modifier.background(color = Wpurple))

        Spacer(modifier = Modifier.height(10.dp))

        //Search Bar
        var search by remember {
            mutableStateOf("")
        }
        //search bar

        OutlinedTextField(value = search, onValueChange = { search = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp)
                .clickable { navController.navigate("") },
            placeholder = { Text(text = "Search") },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "search"
                )
            })
        //end of search bar


        Spacer(modifier = Modifier.height(10.dp))

        Text(text = "Job Suggestions",
            color = Color.White,
            fontSize = 20.sp)


        //Suggestion 1
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(320.dp)
                .padding(start = 15.dp, end = 15.dp)
                .background(color = Wpurple)


        ) {
            Row {
                //image
                Box (){
                    Image(
                        painter = painterResource(id = R.drawable.jobify),
                        contentDescription = "hellcat",
                        modifier = Modifier
                            .size(30.dp)


                    )
                }


                Spacer(modifier = Modifier.width(10.dp))

                Column {
                    Text(text = "Meta",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black)

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(text = "UI Graphics Designer",
                        fontSize = 15.sp,
                        color = Color.Black)
                }
                Box (contentAlignment = Alignment.BottomEnd){
                    Icon(
                        imageVector = Icons.Default.Add,
                        contentDescription = "search"
                    )

                }
            }

        }

        Spacer(modifier = Modifier.height(10.dp))


        //Suggestion 2
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(320.dp)
                .padding(start = 15.dp, end = 15.dp)
                .background(color = Wpurple),

            ) {
            Row {
                //image
                Box (){
                    Image(
                        painter = painterResource(id = R.drawable.jobify),
                        contentDescription = "hellcat",
                        modifier = Modifier
                            .size(30.dp)


                    )
                }


                Spacer(modifier = Modifier.width(10.dp))

                Column {
                    Text(text = "Microsoft",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black)

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(text = "Full Stack Developer",
                        fontSize = 15.sp,
                        color = Color.Black)
                }
                Box (contentAlignment = Alignment.BottomEnd){
                    Icon(
                        imageVector = Icons.Default.Add,
                        contentDescription = "search"
                    )

                }
            }

        }

        Spacer(modifier = Modifier.height(10.dp))


        //Suggestion 3
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(320.dp)
                .padding(start = 15.dp, end = 15.dp)
                .background(color = Wpurple),

            ) {
            Row {
                //image
                Box (){
                    Image(
                        painter = painterResource(id = R.drawable.jobify),
                        contentDescription = "hellcat",
                        modifier = Modifier
                            .size(30.dp)


                    )
                }


                Spacer(modifier = Modifier.width(10.dp))

                Column {
                    Text(text = "BlackRock",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black)

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(text = "Accounts Clerk",
                        fontSize = 15.sp,
                        color = Color.Black)
                }
                Box (contentAlignment = Alignment.BottomEnd){
                    Icon(
                        imageVector = Icons.Default.Add,
                        contentDescription = "search"
                    )

                }
            }

        }

        Spacer(modifier = Modifier.height(10.dp))



        //Suggestion 4
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(320.dp)
                .padding(start = 15.dp, end = 15.dp)
                .background(color = Wpurple),

            ) {
            Row {
                //image
                Box (){
                    Image(
                        painter = painterResource(id = R.drawable.jobify),
                        contentDescription = "hellcat",
                        modifier = Modifier
                            .size(30.dp)


                    )
                }


                Spacer(modifier = Modifier.width(10.dp))

                Column {
                    Text(text = "State Street",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black)

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(text = "Cyber Sec Officer",
                        fontSize = 15.sp,
                        color = Color.Black)
                }
                Box (contentAlignment = Alignment.BottomEnd){
                    Icon(
                        imageVector = Icons.Default.Add,
                        contentDescription = "search"
                    )

                }
            }

        }


        Spacer(modifier = Modifier.height(10.dp))


        //Suggestion 5
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(320.dp)
                .padding(start = 15.dp, end = 15.dp)
                .background(color = Wpurple)
                .clickable { navController.navigate(ROUT_PROFILE) },

            ) {
            Row {
                //image
                Box (){
                    Image(
                        painter = painterResource(id = R.drawable.jobify),
                        contentDescription = "hellcat",
                        modifier = Modifier
                            .size(30.dp)


                    )
                }


                Spacer(modifier = Modifier.width(10.dp))

                Column {
                    Text(text = "Vanguard",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black)

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(text = "Web Developer",
                        fontSize = 15.sp,
                        color = Color.Black)
                }
                Box (contentAlignment = Alignment.BottomEnd){
                    Icon(
                        imageVector = Icons.Default.Add,
                        contentDescription = "search"
                    )

                }
            }

        }

        Spacer(modifier = Modifier.height(10.dp))


        //Suggestion 6
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(320.dp)
                .padding(start = 15.dp, end = 15.dp)
                .background(color = Wpurple)
                .clickable { navController.navigate(ROUT_PROFILE) },

            ) {
            Row {
                //image
                Box (){
                    Image(
                        painter = painterResource(id = R.drawable.jobify),
                        contentDescription = "hellcat",
                        modifier = Modifier
                            .size(30.dp)


                    )
                }


                Spacer(modifier = Modifier.width(10.dp))

                Column {
                    Text(text = "Solar City",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black)

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(text = "Electrical Engineer",
                        fontSize = 15.sp,
                        color = Color.Black)
                }
                Box (contentAlignment = Alignment.BottomEnd){
                    Icon(
                        imageVector = Icons.Default.Add,
                        contentDescription = "search"
                    )

                }
            }

        }

        Spacer(modifier = Modifier.height(10.dp))


        //Suggestion 7
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(320.dp)
                .padding(start = 15.dp, end = 15.dp)
                .background(color = Wpurple)
                .clickable { navController.navigate(ROUT_PROFILE) },

            ) {
            Row {
                //image
                Box (){
                    Image(
                        painter = painterResource(id = R.drawable.jobify),
                        contentDescription = "hellcat",
                        modifier = Modifier
                            .size(30.dp)


                    )
                }


                Spacer(modifier = Modifier.width(10.dp))

                Column {
                    Text(text = "Tesla",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black)

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(text = "Mechanical Engineer",
                        fontSize = 15.sp,
                        color = Color.Black)
                }
                Box (contentAlignment = Alignment.BottomEnd){
                    Icon(
                        imageVector = Icons.Default.Add,
                        contentDescription = "search"
                    )

                }
            }

        }


        Spacer(modifier = Modifier.height(10.dp))


        //Suggestion 8
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(320.dp)
                .padding(start = 15.dp, end = 15.dp)
                .background(color = Wpurple)
                .clickable { navController.navigate(ROUT_PROFILE) },

            ) {
            Row {
                //image
                Box (){
                    Image(
                        painter = painterResource(id = R.drawable.jobify),
                        contentDescription = "hellcat",
                        modifier = Modifier
                            .size(30.dp)


                    )
                }


                Spacer(modifier = Modifier.width(10.dp))

                Column {
                    Text(text = "Amazon",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black)

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(text = "Graphics Designer",
                        fontSize = 15.sp,
                        color = Color.Black)
                }
                Box (contentAlignment = Alignment.BottomEnd){
                    Icon(
                        imageVector = Icons.Default.Add,
                        contentDescription = "search"
                    )

                }
            }

        }


        Spacer(modifier = Modifier.height(10.dp))


        //Suggestion 9
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(320.dp)
                .padding(start = 15.dp, end = 15.dp)
                .background(color = Wpurple)
                .clickable { navController.navigate(ROUT_PROFILE) },

        ) {
            Row {
                //image
                Box (){
                    Image(
                        painter = painterResource(id = R.drawable.jobify),
                        contentDescription = "hellcat",
                        modifier = Modifier
                            .size(30.dp)


                    )
                }


                Spacer(modifier = Modifier.width(10.dp))

                Column {
                    Text(text = "Space X",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black)

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(text = "Aerospace Engineer",
                        fontSize = 15.sp,
                        color = Color.Black)
                }
                Box (contentAlignment = Alignment.BottomEnd){
                    Icon(
                        imageVector = Icons.Default.Add,
                        contentDescription = "search"
                    )

                }
            }

        }



        Spacer(modifier = Modifier.height(10.dp))


        //Suggestion 10
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(320.dp)
                .padding(start = 15.dp, end = 15.dp)
                .background(color = Wpurple)
                .clickable { navController.navigate(ROUT_PROFILE) },

        ) {
            Row {
                //image
                Box (){
                    Image(
                        painter = painterResource(id = R.drawable.jobify),
                        contentDescription = "hellcat",
                        modifier = Modifier
                            .size(30.dp)


                    )
                }


                Spacer(modifier = Modifier.width(10.dp))

                Column {
                    Text(text = "Safaricom",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black)

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(text = "Cyber Architect ",
                        fontSize = 15.sp,
                        color = Color.Black)
                }
                Box (contentAlignment = Alignment.BottomEnd){
                    Icon(
                        imageVector = Icons.Default.Add,
                        contentDescription = "search"
                    )

                }
            }

        }






        //Bottom Navigation Bar->Profile ->Search ->Notification  -->saved
        var selected by remember { mutableIntStateOf(0) }
        Scaffold(
            bottomBar = {
                NavigationBar {
                    bottomNavItems.forEachIndexed { index, bottomNavItem ->
                        NavigationBarItem(
                            selected = index == selected,
                            onClick = {
                                selected = index
                                navController.navigate(bottomNavItem.route)
                            },
                            icon = {
                                BadgedBox(
                                    badge = {
                                        if (bottomNavItem.badges != 0) {
                                            Badge {
                                                Text(text = bottomNavItem.badges.toString())
                                            }
                                        } else if (bottomNavItem.hasNews) {
                                            Badge()
                                        }
                                    }
                                ) {
                                    Icon(imageVector =
                                    if (index == selected)
                                        bottomNavItem.selectedIcon
                                    else
                                        bottomNavItem.unselectedIcon,
                                        contentDescription = bottomNavItem.title)
                                }

                            },
                            label = {
                                Text(text = bottomNavItem.title)
                            })
                    }
                }
            },


            floatingActionButton = {
                FloatingActionButton(onClick = { /*TODO*/ }) {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(imageVector = Icons.Default.Add,
                            contentDescription = "menu")
                    }
                }
            },
            //Content Section
            content = @Composable{
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Text(text = "DashBoard")

                }

            }

        )

    }
}



val bottomNavItems = listOf(
    BottomNavItem(
        title = "Application",
        route="application",
        selectedIcon=Icons.Filled.MailOutline,
        unselectedIcon=Icons.Outlined.MailOutline,
        hasNews = false,
        badges=0
    ),



    BottomNavItem(
        title = "Notifiaction",
        route="notification",
        selectedIcon=Icons.Filled.Favorite,
        unselectedIcon=Icons.Outlined.Favorite,
        hasNews = true,
        badges=5
    ),

    BottomNavItem(
        title = "Profile",
        route="profile",
        selectedIcon=Icons.Filled.Person,
        unselectedIcon=Icons.Outlined.Person,
        hasNews = true,
        badges=1
    ),


    )



data class BottomNavItem(
    val title :String,
    val route :String,
    val selectedIcon: ImageVector,
    val unselectedIcon :ImageVector,
    val hasNews :Boolean,
    val badges :Int
)







@Composable
@Preview
fun DashBoardScreenPreview() {
    DashBoardScreen(rememberNavController())
}