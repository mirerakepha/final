package com.example.project.data

import android.content.Context
import android.widget.Toast
import androidx.navigation.NavHostController
import com.example.project.navigation.ROUT_LOGIN
import com.example.project.navigation.ROUT_PROFILE
import com.google.firebase.auth.FirebaseAuth

class ProfileViewModel(var navController: NavHostController, var context: Context) {
    var mAuth: FirebaseAuth
    init {
        mAuth = FirebaseAuth.getInstance()
    }

    fun profile(email:String, password:String){
        mAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener {
            if (it.isSuccessful){
                Toast.makeText(context, "Update successful", Toast.LENGTH_SHORT).show()
                navController.navigate(ROUT_PROFILE)
            }
        }
    }

    fun logout(){
        mAuth.signOut()
        navController.navigate(ROUT_LOGIN)
    }

    fun isLoggedIn():Boolean{
        return mAuth.currentUser != null
    }
}