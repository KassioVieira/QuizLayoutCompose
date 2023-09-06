package com.example.quizappandroid.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.quizappandroid.ui.theme.QuizAppAndroidTheme

@Preview
@Composable
fun previewProgress() {
    QuizAppAndroidTheme {
        Surface (
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ){
            Column {
                Progress()
            }
        }
    }
}

@Composable
fun Progress () {
    var progress by remember { mutableStateOf(0.5f) }

   Box (
       modifier = Modifier
           .fillMaxWidth()
           .padding(end = 24.dp, top = 16.dp)
           .height(34.dp)
           .border(1.dp, Color(0xFFEFEFEF), CircleShape)
           .background(Color.Transparent),
       contentAlignment = Alignment.Center
   ){
       Row (
           modifier = Modifier
               .fillMaxWidth(),
           horizontalArrangement = Arrangement.SpaceAround,
           verticalAlignment = Alignment.CenterVertically
       ){
           LinearProgressIndicator(
               progress = progress,
               modifier = Modifier
                   .weight(0.87f)
                   .height(8.dp)
                   .padding(start = 17.dp, end = 19.dp)
                   .clip(CircleShape),
               color = Color(0xFFFF9F41)
           )
           Text(
               text = "5/10",
               style = TextStyle(
                   fontSize = 12.sp,
                   fontWeight = FontWeight.W700,
                   color = Color(0xFF3EB8D4)
               ),
               modifier = Modifier.weight(0.12f)
           )
       }
   }
}