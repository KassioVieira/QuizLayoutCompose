package com.example.quizappandroid

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.quizappandroid.ui.home.HomeScreen
import com.example.quizappandroid.ui.screens.questions.QuestionsScreen
import com.example.quizappandroid.ui.theme.QuizAppAndroidTheme

@Composable
fun QuizRoutes() {
    val navController = rememberNavController()

    NavHost(navController, startDestination = "Home") {
        composable("Home") {
            QuizAppAndroidTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    HomeScreen(navController)
                }
            }
        }
        composable("Questions") {
            QuizAppAndroidTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    QuestionsScreen(navController)
                }
            }
        }
    }
}