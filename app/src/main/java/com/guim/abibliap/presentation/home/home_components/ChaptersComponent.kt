package com.guim.abibliap.presentation.home.home_components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ChaptersComponent(chapters: Int) {

    Box(
        modifier = Modifier.height(240.dp).padding(horizontal = 8.dp)
    ) {
        LazyVerticalGrid(columns = GridCells.Fixed(4), ) {
            items(chapters) {
                ChapterComponent(it + 1)
            }
        }
    }

}

@Composable
fun ChapterComponent(chapter: Int) {
    Button(
        modifier = Modifier.padding(8.dp),
        onClick = {},
        shape = RoundedCornerShape(8.dp)
    ) {
        Text(
            text = chapter.toString()
        )
    }
}