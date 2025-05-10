package com.example.courseapp.ui.screen

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.courseapp.data.Course
import com.example.courseapp.ui.components.CourseCard

@Composable
fun CourseScreen(
    courseList: List<Course>
){
    LazyColumn(modifier = Modifier.padding(8.dp)) {
        items(courseList) { course ->
            CourseCard(course = course)
        }
    }
}