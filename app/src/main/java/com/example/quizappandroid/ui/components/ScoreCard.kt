package com.example.quizappandroid.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.AbsoluteCutCornerShape
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
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
import com.example.quizappandroid.R
import com.example.quizappandroid.ui.theme.QuizAppAndroidTheme


@Preview
@Composable
fun previewScoreCard() {
    QuizAppAndroidTheme {
        Surface (
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ){
            Column {
                ScoreCard()
            }
        }
    }
}

@Composable
fun ScoreCard(){
        Card(modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 10.dp)
            .background(Color.White)
            .shadow(elevation = 5.dp),
        ) {
            Row (modifier = Modifier
                .fillMaxWidth()
                .background(Color.White)
                .padding(16.dp),
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically){
                Column {
                    Row {
                        Image(
                            painter = painterResource(R.drawable.trophy),
                            contentDescription = stringResource(R.string.profile_picture_description),
                            modifier = Modifier.size(36.dp).padding(top = 5.dp)
                        )
                        Column (modifier = Modifier.padding(horizontal = 10.dp)){
                            Text(
                                text = stringResource(R.string.ranking),
                                style = TextStyle(
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.W400,
                                    color = Color(0xFF323232)
                                )
                            )
                            Text(
                                text = stringResource(R.string.ranking_position),
                                style = TextStyle(
                                        fontSize = 18.sp,
                                        fontWeight = FontWeight.W700,
                                        color = Color(0xFF3EB8D4)
                                )
                            )
                        }
                    }
                }
                Box(
                    modifier = Modifier
                        .height(50.dp)
                        .width(1.dp)
                        .background(Color.Gray)
                )
                Column {
                    Column {
                        Row {
                            Image(
                                painter = painterResource(R.drawable.coin),
                                contentDescription = stringResource(R.string.profile_picture_description),
                                modifier = Modifier.size(36.dp).padding(top = 5.dp)
                            )
                            Column (modifier = Modifier.padding(horizontal = 10.dp)){
                                Text(
                                    text = stringResource(R.string.points),
                                    style = TextStyle(
                                        fontSize = 12.sp,
                                        fontWeight = FontWeight.W400,
                                        color = Color(0xFF323232)
                                    )
                                )
                                Text(
                                    text = stringResource(R.string.poins_value),
                                    style = TextStyle(
                                        fontSize = 18.sp,
                                        fontWeight = FontWeight.W700,
                                        color = Color(0xFF3EB8D4)
                                    )
                                )
                            }
                        }
                    }
                }
            }
        }
}