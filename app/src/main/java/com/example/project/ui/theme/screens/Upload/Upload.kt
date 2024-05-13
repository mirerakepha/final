package com.example.project.ui.theme.screens.Upload

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.project.data.UploadViewModel
import com.google.firebase.auth.FirebaseAuth

@Composable
fun UploadScreen(navController: NavHostController) {
    val auth = FirebaseAuth.getInstance()
    val storageViewModel: UploadViewModel = viewModel()
    val imageBitmap: ImageBitmap? = storageViewModel.imageBitmap
    val uploading = storageViewModel.uploading

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // Display the uploaded image
        imageBitmap?.let { bitmap ->
            Image(
                bitmap = bitmap,
                contentDescription = null,
                modifier = Modifier.size(200.dp)
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Button to upload an image
        Button(
            onClick = { storageViewModel.uploadImage(auth.currentUser?.uid) },
            modifier = Modifier.fillMaxWidth()
        ) {
            if (uploading) {
                CircularProgressIndicator()
            } else {
                Text("Upload Image")
            }
        }
    }
}

@Preview
@Composable
fun UploadScreenPreview() {
    UploadScreen(rememberNavController())
}