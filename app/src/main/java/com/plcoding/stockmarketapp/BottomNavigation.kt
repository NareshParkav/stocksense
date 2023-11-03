package com.plcoding.stockmarketapp

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.DeveloperMode
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.filled.Feed
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.plcoding.stockmarketapp.presentation.NavGraphs
import com.plcoding.stockmarketapp.presentation.company_info.CompanyInfoScreen
import com.plcoding.stockmarketapp.presentation.company_listings.CompanyListingsScreen
import com.plcoding.stockmarketapp.presentation.devs.DevelopersScreen
import com.plcoding.stockmarketapp.presentation.news_screen.NewsScreen
import com.ramcosta.composedestinations.DestinationsNavHost

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun BottomNavigationExample() {
    val screens = listOf("Home", "Feed", "About")
    var selectedScreen by remember { mutableStateOf(screens.first()) }

    Scaffold(
        bottomBar = {
            NavigationBar {
                screens.forEach { screen ->
                    NavigationBarItem(
                        icon = {
                            Icon(
                                imageVector = getIconForScreen(screen),
                                contentDescription = screen,
                                tint = Color(0xFF060D2E)
                            )
                        },
                        label = { Text(screen, color = MaterialTheme.colorScheme.primary) },
                        selected = screen == selectedScreen,
                        onClick = { selectedScreen = screen },
                        modifier = Modifier.padding(5.dp),
                    )
                }
            }
        },

                content = {
            val content: @Composable () -> Unit = {
                when (selectedScreen) {
                    "Home" -> DestinationsNavHost(navGraph = NavGraphs.root)
                    "Feed" -> NewsScreen()
                    "About" -> DevelopersScreen()
                    else -> DestinationsNavHost(navGraph = NavGraphs.root)
                }
            }

            content()
        }
    )

}

fun getIconForScreen(screen: String): ImageVector {
    return when (screen) {
        "Home" -> Icons.Default.Home
        "Feed" -> Icons.Default.Feed
        "About" -> Icons.Default.DeveloperMode
        else -> Icons.Default.Home
    }
}
