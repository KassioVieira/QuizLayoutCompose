package com.example.quizappandroid.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import com.example.quizappandroid.R
import com.example.quizappandroid.ui.theme.QuizAppAndroidTheme


@Preview
@Composable
fun previewSubjectItem() {
    QuizAppAndroidTheme {
        Surface (
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ){
            Column {
                SubjectItem("Sports", R.drawable.coin, 50, false) {

                }
            }
        }
    }
}

@Composable
fun SubjectItem (subject: String, icon: Int, numberQuestions: Int, isShort: Boolean, onItemClick: SubjectItemClickCallback) {
    var dynamicHeight = if (isShort) 155.dp else 185.dp
    var topDistance = if (isShort) 60.dp else 90.dp

    Box (
        modifier = Modifier
            .width(155.dp)
            .height(dynamicHeight)
    ){
        Image(
            painter = painterResource(icon),
            contentDescription = stringResource(icon),
            modifier = Modifier
                .size(90.dp)
                .padding(start = 26.dp)
                .offset(y = (-14).dp).zIndex(1f)
        )
        Card (
            modifier = Modifier
                .padding(vertical = 10.dp, horizontal = 16.dp)
                .background(Color.Transparent)
                .shadow(elevation = 5.dp)){

            Column (modifier = Modifier
                .clickable { onItemClick()  }
                .fillMaxWidth()
                .fillMaxHeight()
                .background(Color.White)){
                Box (modifier = Modifier.padding(start = 16.dp, top = topDistance)){
                    Text(
                        text = subject,
                        style = TextStyle(
                            fontSize = 16.sp,
                            fontWeight = FontWeight.W500,
                            color = Color(0xFF1C1C1C)
                        )
                    )
                }
                Box (modifier = Modifier.padding(start = 16.dp, top = 7.dp, bottom = 23.dp)){
                    Text(
                        text = "$numberQuestions Questions",
                        style = TextStyle(
                            fontSize = 12.sp,
                            fontWeight = FontWeight.W400,
                            color = Color(0xFF323232)
                        )
                    )
                }
            }
        }
    }
}

typealias SubjectItemClickCallback = () -> Unit