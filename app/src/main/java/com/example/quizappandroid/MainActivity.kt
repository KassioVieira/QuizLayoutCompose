package com.example.quizappandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.quizappandroid.ui.components.ProfileHeader
import com.example.quizappandroid.ui.components.ScoreCard
import com.example.quizappandroid.ui.theme.QuizAppAndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuizAppAndroidTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column {
                        ProfileHeader()
                        ScoreCard()
                        Spacer(modifier = Modifier.height(5.dp))
                        Box(modifier = Modifier.padding(top = 29.dp, start = 16.dp)) {
                            Text(
                                text = getString(R.string.let_s_play),
                                style = TextStyle(
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight.W700,
                                    color = Color(0xFF1C1C1C)
                                )
                            )
                        }
                    }
                }
            }
        }
    }

    @Preview
    @Composable
    fun previewMainView () {
        QuizAppAndroidTheme {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {
                Column {
                    ProfileHeader()
                    ScoreCard()
                    Box(modifier = Modifier.padding(top = 29.dp, start = 16.dp)) {
                        Text(
                            text = "Let's Play",
                            style = TextStyle(
                                fontSize = 20.sp,
                                fontWeight = FontWeight.W700,
                                color = Color(0xFF1C1C1C)
                            )
                        )
                    }
                }
            }
        }
    }
}