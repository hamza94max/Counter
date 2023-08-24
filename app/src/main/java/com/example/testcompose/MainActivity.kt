package com.example.testcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            ColumnWithClick()


        }
    }

}


@Composable
fun ColumnWithClick() {
    var counter by remember { mutableStateOf(0) }
    Column(
        modifier = Modifier
            .background(Color.White)
            .padding(7.dp)
            .clickable(
                onClick = { counter++ }
            )
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center


    ) {
        Text(
            text = counter.toString(),
            fontSize = 32.sp,
            textAlign = TextAlign.Center,
            color = Color.Black
        )
    }
}


@Preview(showBackground = true) // for only preview
@Composable
fun DefaultPreview() {

    var counter by remember {
        mutableStateOf(0)
    }
    Column(
        modifier = Modifier
            .background(Color.White)
            .padding(7.dp)
            .clickable(onClick = { counter++ })
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,


        ) {
        Text(
            text = "60",
            fontSize = 32.sp,
            textAlign = TextAlign.Center
        )
    }

}