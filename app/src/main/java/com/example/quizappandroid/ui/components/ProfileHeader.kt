package com.example.quizappandroid.ui.components

import android.provider.CalendarContract.Colors
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.quizappandroid.R
import com.example.quizappandroid.ui.theme.LightColorScheme
import com.example.quizappandroid.ui.theme.QuizAppAndroidTheme

@Preview
@Composable
fun HeaderComponentPreview() {
    QuizAppAndroidTheme {
        Surface (
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ){
            Column {
                ProfileHeader()
            }
        }
    }
}
@Composable
fun ProfileHeader() {
    Row (
    modifier = Modifier
        .fillMaxWidth()
        .wrapContentHeight()
        .padding(16.dp),
    horizontalArrangement = Arrangement.SpaceBetween,
    verticalAlignment = Alignment.CenterVertically
    ){
        Column {
            Text(
                text = stringResource(R.string.welcome),
                style = MaterialTheme.typography.headlineLarge,
            )
            Spacer(modifier = Modifier.height(5.dp))
            Text(
                text = stringResource(R.string.message),
                style = MaterialTheme.typography.headlineSmall,
            )
        }
        Box(
            modifier = Modifier
                .size(54.dp)
                .clip(CircleShape)
                .border(1.5.dp, LightColorScheme.secondaryContainer, CircleShape)
        ) {
            Box(
                modifier = Modifier
                    .matchParentSize()
                    .background(LightColorScheme.secondaryContainer)
            )

            Image(
                painter = painterResource(R.drawable.happy),
                contentDescription = stringResource(R.string.profile_picture_description),
                modifier = Modifier.matchParentSize()
            )
        }
    }
}