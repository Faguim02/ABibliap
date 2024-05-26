package com.guim.abibliap.util

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp

@Composable
fun MySpacer(size: Dp) = Spacer(modifier = Modifier.size(size))

fun String.trimStartEnd(): String = this.trimStart().trimEnd()