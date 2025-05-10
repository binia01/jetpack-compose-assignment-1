package com.example.courseapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.courseapp.data.Course
import com.example.courseapp.ui.screen.CourseScreen
import com.example.courseapp.ui.theme.CourseAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CourseAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                   CourseScreen(courseList = sampleCourses)
                }
            }
        }
    }
}


val sampleCourses = listOf(
    Course(
        title = "Introduction to Computer Science",
        code = "CS101",
        creditHours = 3,
        description = "An overview of fundamental computer science concepts including algorithms, data structures, and programming basics.",
        prerequisites = listOf()
    ),
    Course(
        title = "Data Structures and Algorithms",
        code = "CS201",
        creditHours = 4,
        description = "Covers data structures such as arrays, stacks, queues, linked lists, trees, and graphs, along with algorithm analysis.",
        prerequisites = listOf("CS101")
    ),
    Course(
        title = "Object-Oriented Programming",
        code = "CS202",
        creditHours = 3,
        description = "Focuses on principles of object-oriented programming using languages such as Java or Kotlin.",
        prerequisites = listOf("CS101")
    ),
    Course(
        title = "Operating Systems",
        code = "CS301",
        creditHours = 4,
        description = "Introduction to the design and implementation of operating systems, covering processes, memory, and file systems.",
        prerequisites = listOf("CS201", "CS202")
    ),
    Course(
        title = "Database Systems",
        code = "CS305",
        creditHours = 3,
        description = "Explores relational databases, SQL, normalization, and transactions.",
        prerequisites = listOf("CS201")
    ),
    Course(
        title = "Software Engineering",
        code = "CS310",
        creditHours = 3,
        description = "Covers software development methodologies, design patterns, testing, and project management.",
        prerequisites = listOf("CS202")
    ),
    Course(
        title = "Mobile App Development",
        code = "CS320",
        creditHours = 3,
        description = "Practical course on building Android applications using Kotlin and Jetpack Compose.",
        prerequisites = listOf("CS202")
    ),
    Course(
        title = "Computer Networks",
        code = "CS330",
        creditHours = 3,
        description = "Introduces the fundamentals of computer networking, protocols, TCP/IP, and network security basics.",
        prerequisites = listOf("CS201")
    ),
    Course(
        title = "Artificial Intelligence",
        code = "CS410",
        creditHours = 3,
        description = "Introduction to AI principles including search, reasoning, machine learning, and natural language processing.",
        prerequisites = listOf("CS201", "CS305")
    ),
    Course(
        title = "Capstone Project",
        code = "CS499",
        creditHours = 4,
        description = "A team-based project course that integrates knowledge from the CS curriculum to develop a complete software solution.",
        prerequisites = listOf("CS310", "CS305", "CS320")
    ),
    Course(
        title = "Discrete Mathematics",
        code = "MATH210",
        creditHours = 3,
        description = "Covers logic, set theory, combinatorics, graph theory, and proofs, which are foundational for computer science.",
        prerequisites = listOf()
    ),
    Course(
        title = "Linear Algebra",
        code = "MATH220",
        creditHours = 3,
        description = "An introduction to vector spaces, matrices, determinants, eigenvalues, and linear transformations.",
        prerequisites = listOf("MATH210")
    ),
    Course(
        title = "Web Development",
        code = "CS250",
        creditHours = 3,
        description = "Covers frontend and backend development using HTML, CSS, JavaScript, and frameworks like React or Spring Boot.",
        prerequisites = listOf("CS202")
    ),
    Course(
        title = "Cybersecurity Fundamentals",
        code = "CS360",
        creditHours = 3,
        description = "Introduces key concepts in cybersecurity including cryptography, network security, and threat modeling.",
        prerequisites = listOf("CS330")
    ),
    Course(
        title = "Human-Computer Interaction",
        code = "CS370",
        creditHours = 3,
        description = "Explores user interface design, usability testing, and interaction paradigms.",
        prerequisites = listOf("CS202")
    ),
    Course(
        title = "Parallel and Distributed Systems",
        code = "CS430",
        creditHours = 3,
        description = "Covers concepts and design of parallel and distributed computing, including multithreading and cluster computing.",
        prerequisites = listOf("CS301")
    ),
    Course(
        title = "Machine Learning",
        code = "CS420",
        creditHours = 4,
        description = "Covers supervised and unsupervised learning, neural networks, decision trees, and model evaluation.",
        prerequisites = listOf("CS410", "MATH220")
    ),
    Course(
        title = "Cloud Computing",
        code = "CS440",
        creditHours = 3,
        description = "Introduces cloud architectures, services (AWS, Azure), virtualization, and deployment.",
        prerequisites = listOf("CS305", "CS330")
    ),
    Course(
        title = "Game Development",
        code = "CS460",
        creditHours = 3,
        description = "An introduction to game design and development using engines like Unity or Unreal.",
        prerequisites = listOf("CS202", "CS250")
    ),
    Course(
        title = "Ethics in Computing",
        code = "CS480",
        creditHours = 2,
        description = "Explores ethical, legal, and societal issues related to computing technologies.",
        prerequisites = listOf("CS101")
    )
)
