package com.tvr.myapplication.features.home

import android.graphics.fonts.FontStyle
import android.os.Bundle
import android.widget.Toolbar
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.magnifier
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
                        Box(
                            modifier = Modifier.padding(it),
                        ) {
                            Greeting(name = "Test")
                        }

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
        label = { Text(text = "Check") },
        selected = false,
        alwaysShowLabel = false,
        onClick = { /*TODO*/ }
    )
    BottomNavigationItem(
        icon = { Icon(Icons.Filled.CheckCircle, "Circle") },
        label = { Text(text = "Check") },
        selected = false,
        alwaysShowLabel = false,
        onClick = { /*TODO*/ }
    )
    BottomNavigationItem(
        icon = { Icon(Icons.Filled.CheckCircle, "Circle") },
        label = { Text(text = "Check") },
        selected = false,
        alwaysShowLabel = false,
        onClick = { /*TODO*/ }
    )
    BottomNavigationItem(
        icon = { Icon(Icons.Filled.CheckCircle, "Circle") },
        label = { Text(text = "Check") },
        selected = false,
        alwaysShowLabel = false,
        onClick = { /*TODO*/ }
    )
}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    LazyColumn(
        contentPadding = PaddingValues(10.dp),
    ) {
        items(20, itemContent = {
            listItem()
        })
    }
}

@Composable
fun listItem() = Box(
    modifier = Modifier
        .padding(10.dp)
        .border(.5.dp, color = Color.Gray, shape = RoundedCornerShape(10.dp))
        .padding(10.dp),
) {
    Column {
        Text(text = "Java", fontSize = 20.sp)
        Box(modifier = Modifier.height(5.dp))
        Text(
            text = "Java is a high-level, class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible.",
            fontSize = 16.sp,
            color = Color.Gray
        )
        Box(modifier = Modifier.height(15.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeTemplateTheme {
        Greeting("Android")
    }
}