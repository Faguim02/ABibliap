package com.guim.abibliap

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.guim.abibliap.presentation.MainViewModel
import com.guim.abibliap.presentation.home.home_screen.HomeScreen
import com.guim.abibliap.ui.theme.ABibliapTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ABibliapTheme {
                // A surface container using the 'background' color from the theme
                HomeScreen()
//                FindBooks()
            }
        }
    }
}

@Composable
fun FindBooks(viewModel: MainViewModel = hiltViewModel()) {
    val books by viewModel.chapterDataResponse.collectAsState()
    
    books?.let {
        Text(text = it.toString())
    }
}