package com.guim.abibliap.presentation.home.home_screen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import com.guim.abibliap.data.dto.book.Abbrev
import com.guim.abibliap.domain.model.book.BookData
import com.guim.abibliap.domain.model.books.BooksData
import com.guim.abibliap.presentation.MainViewModel
import com.guim.abibliap.presentation.home.home_components.BookComponent
import com.guim.abibliap.ui.theme.Merriweather
import com.guim.abibliap.util.Result

@Composable()
fun HomeScreen(navController: NavController, viewModel: MainViewModel = hiltViewModel()) {

    LaunchedEffect(
        key1 = true,
        block = {
            viewModel.findAllBooks()
        }
    )

    val booksResponse = viewModel.booksDataResponse.collectAsState().value

    Scaffold(
        topBar = {
            Column {
                Spacer(modifier = Modifier.height(64.dp))
                Text(
                    modifier = Modifier
                        .fillMaxWidth(),
                    text = "ABíbliap",
                    style = TextStyle(
                        fontFamily = Merriweather,
                        fontWeight = FontWeight.Black,
                        fontSize = 32.sp,
                        textAlign = TextAlign.Center
                    )
                )
                Spacer(modifier = Modifier.height(32.dp))
            }
        }
    ) { padding ->
        Column(
            modifier = Modifier.padding(padding)
        ) {

            when(booksResponse) {
                is Result.Loading -> {
                    Text(("Carregando"))
                }
                is Result.Error -> {
                    Text("Erro")
                }
                is Result.Success -> {
                    val booksResult = booksResponse.data
                    ListForBooks(booksResult)
                }
                else -> Unit
            }

        }
    }

}

@Composable
fun ListForBooks(booksData: List<BookData>) {
    LazyColumn {
        item {
            IconButton(
                onClick = {}
            ) {
                Icon(
                    imageVector = Icons.Default.PlayArrow,
                    contentDescription = null
                )
            }
        }

        items(booksData) {
            BookComponent(bookData = it)
        }
    }
}

//@Preview()
//@Composable
//fun previewHomeScreen() {
//    ABibliapTheme() {
//        HomeScreen()
//    }
//}