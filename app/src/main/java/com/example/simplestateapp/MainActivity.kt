package com.example.simplestateapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SimpleStateApp()
        }
    }
}

@Composable
fun SimpleStateApp() {
    // Different data types with remember state
    var intValue by remember { mutableStateOf(0) }
    var doubleValue by remember { mutableStateOf(0.0) }
    var floatValue by remember { mutableStateOf(0f) }
    var booleanValue by remember { mutableStateOf(false) }
    var charValue by remember { mutableStateOf('A') }

    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Int Value: $intValue")
        Button(onClick = { intValue++ }) {
            Text("Increase Int")
        }

        Text("Double Value: $doubleValue")
        Button(onClick = { doubleValue += 0.5 }) {
            Text("Increase Double")
        }

        Text("Float Value: $floatValue")
        Button(onClick = { floatValue += 1.5f }) {
            Text("Increase Float")
        }

        Text("Boolean Value: $booleanValue")
        Button(onClick = { booleanValue = !booleanValue }) {
            Text("Toggle Boolean")
        }

        Text("Char Value: $charValue")
        Button(onClick = { charValue++ }) {
            Text("Next Char")
        }
    }
}
