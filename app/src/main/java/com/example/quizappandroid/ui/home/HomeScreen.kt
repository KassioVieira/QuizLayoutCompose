package com.example.quizappandroid.ui.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.quizappandroid.R
import com.example.quizappandroid.ui.components.ProfileHeader
import com.example.quizappandroid.ui.components.ScoreCard
import com.example.quizappandroid.ui.components.SubjectItem
import com.example.quizappandroid.ui.theme.QuizAppAndroidTheme

@Preview
@Composable
fun previewMainView () {

    val subjects = listOf(
        Subject("Sports", R.drawable.basketball, 50, true),
        Subject("Chemistry", R.drawable.chemistry, 30,false),
        Subject("Math", R.drawable.calculator, 95,false),
        Subject("History", R.drawable.calendar, 128,false),
        Subject("Biological", R.drawable.dna, 30,false),
        Subject("Geography", R.drawable.map, 24,true),
    )

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
                Spacer(modifier = Modifier.height(5.dp))
                LazyVerticalGrid(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp),
                    columns = GridCells.Fixed(2),
                    content = {
                        items(subjects.size) { index ->
                            SubjectItem(subjects[index].subject,subjects[index].icon, subjects[index].numberQuestions, subjects[index].isShort){}
                        }
                    },
                    verticalArrangement = Arrangement.spacedBy(2.dp),
                    horizontalArrangement = Arrangement.spacedBy(16.dp)
                )
            }
        }
    }
}
@Composable
fun HomeScreen (navController: NavController) {

    val subjects = listOf(
        Subject("Sports", R.drawable.basketball, 50, true),
        Subject("Chemistry", R.drawable.chemistry, 30,false),
        Subject("Math", R.drawable.calculator, 95,false),
        Subject("History", R.drawable.calendar, 128,false),
        Subject("Biological", R.drawable.dna, 30,false),
        Subject("Geography", R.drawable.map, 24,true),
    )

    Column {
        ProfileHeader()
        ScoreCard()
        Spacer(modifier = Modifier.height(5.dp))
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
        Spacer(modifier = Modifier.height(5.dp))
        LazyVerticalGrid(
            modifier = Modifier.fillMaxWidth(),
            columns = GridCells.Fixed(2),
            content = {
                items(subjects.size) { index ->
                    SubjectItem(subjects[index].subject,subjects[index].icon, subjects[index].numberQuestions,subjects[index].isShort) {
                        navController.navigate("Questions")
                    }
                }
            },
            verticalArrangement = Arrangement.spacedBy(8.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        )
    }
}

data class Subject(
    val subject: String,
    val icon: Int,
    val numberQuestions: Int,
    val isShort: Boolean,
)