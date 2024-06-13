package com.guim.abibliap.presentation.home.home_components

import android.graphics.drawable.Icon
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.guim.abibliap.data.dto.book.Abbrev
import com.guim.abibliap.domain.model.book.BookData
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun BookComponent(bookData: BookData) {

    var expandChapters by remember { mutableStateOf(false) }

    var coroutimeScopo = rememberCoroutineScope()

    when(expandChapters) {
        true -> {
            BookItemComponent(
                bookData = bookData,
                handleExpandChapters = {
                    expandChapters = !expandChapters
                },
                isExpanded = expandChapters
            )
            Row {
                ChaptersComponent(bookData.chapters)
            }
        }
        else -> BookItemComponent(
            bookData = bookData,
            handleExpandChapters = {
                expandChapters = !expandChapters
            },
            isExpanded = expandChapters
        )
    }


}

@Composable
fun BookItemComponent(bookData: BookData, handleExpandChapters: () -> Unit, isExpanded: Boolean) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = bookData.name
        )
        IconButton(
            onClick = handleExpandChapters,
        ) {

            when(isExpanded) {
                false -> {
                    Icon(
                        imageVector = Icons.Default.KeyboardArrowDown,
                        contentDescription = null
                    )
                }
                else -> {
                    Icon(
                        imageVector = Icons.Default.KeyboardArrowRight,
                        contentDescription = null
                    )
                }
            }
        }
    }
}

@Preview()
@Composable
fun previewBookComponent() {

    val bookData = BookData(
        name = "Gênesis", group = "", author = "", comment = "", testament = "", abbrev = Abbrev(en = "gn", pt = "gn"), chapters = 50
    )

    MaterialTheme {
        BookComponent(bookData = bookData)
    }
}