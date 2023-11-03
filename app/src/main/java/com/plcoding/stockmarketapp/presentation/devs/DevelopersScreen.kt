package com.plcoding.stockmarketapp.presentation.devs

import android.annotation.SuppressLint
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.expandVertically
import androidx.compose.animation.shrinkVertically
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.TopAppBar
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
//import androidx.compose.material3.MaterialTheme
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import androidx.compose.material.MaterialTheme
import androidx.compose.material.MaterialTheme.shapes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AppBlocking
import androidx.compose.material.icons.filled.AttachMoney
import androidx.compose.material.icons.filled.Money
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.SmallTopAppBar

//
//@OptIn(ExperimentalMaterial3Api::class)
//@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
//@Composable
//fun DevelopersScreen() {
//    val systemUiController = rememberSystemUiController()
//    val colors = MaterialTheme.colors
//    val typography = MaterialTheme.typography
//    val shapes = MaterialTheme.shapes
//
//    var developers by remember { mutableStateOf(getSampleDevelopers()) }
//
//    LaunchedEffect(systemUiController) {
//        systemUiController.setSystemBarsColor(
//            color = colors.background,
//            darkIcons = colors.isLight
//        )
//    }
//
//    Scaffold(
//        topBar = {
//            TopAppBar(
//                title = {
//                    Text(
//                        text = "Developers",
//                        style = typography.h3
//                    )
//                },
//                backgroundColor = colors.background,
//                contentColor = colors.onBackground
//            )
//        },
//        content = {
//            Surface(
//                modifier = Modifier
//                    .fillMaxSize()
//                    .padding(start = 16.dp, end = 16.dp, top = 56.dp) // Adjust top padding to avoid overlap
//                    .statusBarsPadding(), // Account for system bars
//                color = colors.background
//            ) {
//                DeveloperList(developers)
//            }
//        }
//    )
//}
//
//@Composable
//fun DeveloperList(developers: List<Developer>) {
//    LazyColumn(
//        modifier = Modifier
//            .fillMaxSize()
//            .padding(16.dp)
//    ) {
//        items(developers) { developer ->
//            AnimatedVisibility(
//                visible = true,
//                enter = expandVertically(),
//                exit = shrinkVertically()
//            ) {
//                DeveloperListItem(developer = developer)
//            }
//            Divider(modifier = Modifier.padding(vertical = 8.dp)) // Add spacing between items
//        }
//    }
//}
//
//@Composable
//fun DeveloperListItem(developer: Developer) {
//    Card(
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(8.dp),
//        shape = shapes.medium, // Use a rounded card shape
//        elevation = 4.dp,
//        backgroundColor = MaterialTheme.colors.primary
//    ) {
//        Row(
//            modifier = Modifier
//                .padding(16.dp)
//                .fillMaxWidth(),
//            verticalAlignment = Alignment.CenterVertically
//        ) {
//            Icon(
//                imageVector = Icons.Default.Person,
//                contentDescription = "Developer icon",
//                tint = MaterialTheme.colors.onPrimary
//            )
//            Spacer(modifier = Modifier.width(16.dp)) // Add spacing between icon and text
//            Column {
//                Text(
//                    text = developer.name,
//                    style = typography.h5,
//                    color = MaterialTheme.colors.onPrimary
//                )
//                Text(
//                    text = developer.role,
//                    style = typography.body2,
//                    color = MaterialTheme.colors.onPrimary.copy(alpha = 0.7f)
//                )
//            }
//        }
//    }
//}
//
//data class Developer(val name: String, val role: String)
//
//fun getSampleDevelopers(): List<Developer> {
//    return listOf(
//        Developer(name = "Kavya", role = "UI/UX Designer & Developer"),
//        Developer(name = "Naresh Parkav", role = "Backend Developer")
//    )
//}

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun DevelopersScreen() {
        val colors = MaterialTheme.colors
        val typography = MaterialTheme.typography

        Scaffold(
            topBar = {
                TopAppBar(
                    title = {
                        Text(
                            text = "About",
                            style = typography.h5,
                            color= Color.Green
                        )
                    },
                    backgroundColor = colors.background,
                    contentColor = colors.onBackground
                )
            },
            content = {
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 50.dp),
                    shape = MaterialTheme.shapes.medium,
                    elevation = 2.dp,
                    backgroundColor = colors.surface
                )  {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(horizontal = 16.dp, vertical = 32.dp),
                    verticalArrangement = Arrangement.Center
                ) {
                    // App icon and name
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            imageVector = Icons.Default.AttachMoney,
                            contentDescription = "App icon",
                            modifier = Modifier.size(48.dp),
                            tint = colors.primary
                        )
                        Spacer(modifier = Modifier.width(16.dp))
                        Column {
                            Text(
                                text = "StockSense",
                                style = typography.h4,
                                color = colors.onBackground
                            )
                            Text(
                                text = "Stalk the Stocks Market",
                                style = typography.subtitle1,
                                color = colors.onBackground.copy(alpha = 0.7f)
                            )
                        }
                    }
                }

                    Spacer(modifier = Modifier.height(32.dp))

                    // App version and developer information
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 16.dp),
                        shape = MaterialTheme.shapes.medium,
                        elevation = 2.dp,
                        backgroundColor = colors.surface
                    ) {
                        Column(
                            modifier = Modifier.padding(16.dp),
                            verticalArrangement = Arrangement.Center
                        ) {
                            Text(
                                text = "Version: 1.0.0",
                                style = typography.body2,
                                color = colors.onSurface.copy(alpha = 0.7f)
                            )

                            Spacer(modifier = Modifier.height(16.dp))

                            Text(
                                text = "Created by:",
                                style = typography.body2,
                                color = colors.onSurface
                            )
                            Text(
                                text = "Kavya ",
                                style = typography.body1,
                                color = colors.onSurface
                            )
                            Text(
                                text = "Parkav",
                                style = typography.body1,
                                color = colors.onSurface
                            )
                        }
                    }
                }
            }
        )
    }










