package com.guim.abibliap.presentation.home.home_screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.guim.abibliap.data.dto.book.Abbrev
import com.guim.abibliap.domain.model.book.BookData
import com.guim.abibliap.domain.model.books.BooksData
import com.guim.abibliap.presentation.home.home_components.BookComponent
import com.guim.abibliap.ui.theme.ABibliapTheme
import com.guim.abibliap.ui.theme.Merriweather

@OptIn(ExperimentalMaterial3Api::class)
@Composable()
fun HomeScreen() {

    val booksData = listOf<BookData>(
        BookData(
            name = "Gênesis",
            group = "Pentateuco",
            author = "Moisés",
            comment = "",
            testament = "Antigo Testamento",
            abbrev = Abbrev(en = "gn", pt = "gn"),
            chapters = 50
        ),
        BookData(
            name = "Êxodo",
            group = "Pentateuco",
            author = "Moisés",
            comment = "",
            testament = "Antigo Testamento",
            abbrev = Abbrev(en = "ex", pt = "ex"),
            chapters = 40
        ),
        BookData(
            name = "Levítico",
            group = "Pentateuco",
            author = "Moisés",
            comment = "",
            testament = "Antigo Testamento",
            abbrev = Abbrev(en = "lv", pt = "lv"),
            chapters = 27
        ),
        BookData(
            name = "Números",
            group = "Pentateuco",
            author = "Moisés",
            comment = "",
            testament = "Antigo Testamento",
            abbrev = Abbrev(en = "nm", pt = "nm"),
            chapters = 36
        ),
        BookData(
            name = "Deuteronômio",
            group = "Pentateuco",
            author = "Moisés",
            comment = "",
            testament = "Antigo Testamento",
            abbrev = Abbrev(en = "dt", pt = "dt"),
            chapters = 34
        ),
        // ... omitidos para abreviar o exemplo
        BookData(
            name = "Apocalipse",
            group = "",
            author = "João",
            comment = "",
            testament = "Novo Testamento",
            abbrev = Abbrev(en = "rv", pt = "ap"),
            chapters = 22
        )
    )

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
    ) {padding ->
        Column(
            modifier = Modifier.padding(padding)
        ) {

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
    }

}

@Preview()
@Composable
fun previewHomeScreen() {
    ABibliapTheme() {
        HomeScreen()
    }
}