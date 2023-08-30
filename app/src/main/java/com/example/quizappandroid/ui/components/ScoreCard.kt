package com.example.quizappandroid.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.quizappandroid.R

@Composable
fun ScoreCard(){
    Surface(modifier = Modifier.padding(horizontal = 16.dp)) {
        Card(modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.background)
            .shadow(elevation = 5.dp),
        ) {
            Row (modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(16.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically){
                Column {
                    Text(text = stringResource(R.string.ranking))
                }
                Column {
                    Text(text = stringResource(R.string.points))
                }
            }
        }
    }
}