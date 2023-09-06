package com.example.quizappandroid.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.quizappandroid.ui.theme.QuizAppAndroidTheme

@Preview
@Composable
fun previewCloseButton() {
    QuizAppAndroidTheme {
        Surface (
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ){
            Column {
                CloseButton(){}
            }
        }
    }
}

@Composable
fun CloseButton (closeClick: CloseButtonClickCallback) {
    Box (
        modifier = Modifier
            .width(38.dp)
            .height(38.dp)
            .border(1.dp, Color(0xFFEFEFEF), CircleShape)
            .background(Color.Transparent)
            .clip(CircleShape)
            .clickable { closeClick() },
        contentAlignment = Alignment.Center
    ){
        Image(
            painter = rememberVectorPainter(Icons.Default.Close),
            contentDescription = "Close Button",
            modifier = Modifier
                .matchParentSize()
                .padding(8.dp),
        )
    }
}

typealias CloseButtonClickCallback = () -> Unit