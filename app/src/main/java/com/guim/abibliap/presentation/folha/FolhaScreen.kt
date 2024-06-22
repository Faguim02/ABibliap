package com.guim.abibliap.presentation.folha

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.guim.abibliap.ui.theme.ABibliapTheme
import java.lang.reflect.Modifier

@Composable
fun FolhaScreen() {
    Scaffold { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(innerPadding)
                .padding(16.dp),
            contentAlignment = Alignment.TopCenter
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .padding(16.dp)
            ) {
                Text(
                    text = "Gênesis",
                    fontSize = 36.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 8.dp)
                )
                Text(
                    text = "1",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Normal,
                    modifier = Modifier.padding(bottom = 8.dp)
                )
                Text(
                    text = "A criação do Universo e da raça humana",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.padding(bottom = 16.dp)
                )
                Text(
                    text = """
                        No princípio criou Deus o céu e a terra.
                        E a terra era sem forma e vazia; e havia trevas sobre a face do abismo; e o Espírito de Deus se movia sobre a face das águas.
                        E disse Deus: Haja luz; e houve luz.
                        E viu Deus que era boa a luz; e fez Deus separação entre a luz e as trevas.
                        E Deus chamou à luz Dia; e às trevas chamou Noite. E foi a tarde e a manhã, o dia primeiro.
                        E disse Deus: Haja uma expansão no meio das águas, e haja separação entre águas e águas.
                        E fez Deus a expansão, e fez separação entre as águas que estavam debaixo da expansão e as águas que estavam sobre a expansão; e assim foi.
                    """.trimIndent(),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Normal
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewFolhaScreen() {
    ABibliapTheme {
        FolhaScreen()
    }
}