package com.example.quizappandroid.ui.screens.questions

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.quizappandroid.ui.components.CloseButton
import com.example.quizappandroid.ui.components.Progress
import com.example.quizappandroid.ui.theme.QuizAppAndroidTheme

@Preview
@Composable
fun previewQuestionsScreen() {
    QuizAppAndroidTheme {
        Surface (
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ){
            Column {
                Row {
                    Box (modifier = Modifier.weight(0.1f).padding(top = 16.dp, start = 5.dp)){
                        CloseButton(){
                        }
                    }
                    Spacer(modifier = Modifier.width(16.dp))
                   Box (modifier = Modifier.weight(0.9f)){
                       Progress()
                   }
                }
            }
        }
    }
}

@Composable
fun QuestionsScreen (navController: NavController) {
    Column {
        Row {
            CloseButton(){
                navController.popBackStack()
            }
            Progress()
        }
    }
}


