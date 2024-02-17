package com.tvr.myapplication.features.home

import android.os.Bundle
import android.widget.Toolbar
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.tvr.myapplication.R
import com.tvr.myapplication.ui.theme.ComposeTemplateTheme

class HomeActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTemplateTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
                    Scaffold(topBar = { TopBar() }, bottomBar = { BottomNav() }) {
                        Text(
                            modifier = Modifier.padding(it),
                            text = "text",
                            color = MaterialTheme.colorScheme.primary
                        )
                    }
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun TopBar() = TopAppBar(colors = TopAppBarDefaults.smallTopAppBarColors(
    containerColor = MaterialTheme.colorScheme.primaryContainer,
    titleContentColor = MaterialTheme.colorScheme.primary
), title = {
    Text(
        text = stringResource(R.string.home), maxLines = 1
    )
})

@Composable
private fun BottomNav() = BottomNavigation {
    BottomNavigationItem(
        icon = { Icon(Icons.Filled.CheckCircle, "Circle") },
        label = { Text(text = "Check")},
        selected = false,
        alwaysShowLabel = false,
        onClick = { /*TODO*/ }
    )
    BottomNavigationItem(
        icon = { Icon(Icons.Filled.CheckCircle, "Circle") },
        label = { Text(text = "Check")},
        selected = false,
        alwaysShowLabel = false,
        onClick = { /*TODO*/ }
    )
    BottomNavigationItem(
        icon = { Icon(Icons.Filled.CheckCircle, "Circle") },
        label = { Text(text = "Check")},
        selected = false,
        alwaysShowLabel = false,
        onClick = { /*TODO*/ }
    )
    BottomNavigationItem(
        icon = { Icon(Icons.Filled.CheckCircle, "Circle") },
        label = { Text(text = "Check")},
        selected = false,
        alwaysShowLabel = false,
        onClick = { /*TODO*/ }
    )
}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column {
        Text(
            text = "Hello $name!", modifier = modifier
        )

        Text(
            text = "Hello $name!", modifier = modifier
        )
        Text(
            text = "Hello $name!", modifier = modifier
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeTemplateTheme {
        Greeting("Android")
    }
}