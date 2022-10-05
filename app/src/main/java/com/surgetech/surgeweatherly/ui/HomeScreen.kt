package com.surgetech.surgeweatherly.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.surgetech.surgeweatherly.R

@Composable
fun HomeScreen() {
    MapSearchRow()
}

@Composable
fun MapSearchRow() {
    var text by remember{
        mutableStateOf("")
    }
    Column(modifier = Modifier
        .fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.5f)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                var text by remember {
                    mutableStateOf("")
                }
                Image(
                    painter = painterResource(id = com.surgetech.surgeweatherly.R.drawable.map),
                    contentDescription = "Map",
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.FillBounds
                )
                Box(modifier = Modifier
                    .fillMaxSize()
                    .background(
                        brush = Brush.verticalGradient(
                            colors = listOf(Color.Transparent, Color.Black),
                            startY = 0f
                        )
                    )
                )
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    TextField(
                        value = text,
                        onValueChange = {
                            text = it
                        },
                        modifier = Modifier
                            .width(300.dp)
                            .background(Color.White),
                        label = {
                            Text(text = "Enter Location")
                        }
                    )
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier.width(300.dp),
                        colors = ButtonDefaults.buttonColors(backgroundColor = NavyBlue)
                    ) {
                        Text(
                            text = "Get Details",
                            color = Color.White,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }
        }
        Column(
            modifier = Modifier.padding(horizontal = 20.dp)
        ) {
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "Today's Overview",
                fontSize = 24.sp,
                fontWeight = FontWeight.SemiBold,
                color = NavyBlue
            )
            Spacer(modifier = Modifier.height(30.dp))
            
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(horizontalAlignment = Alignment.Start) {
                    Icon(
                        painter = painterResource(id = R.drawable.wind),
                        contentDescription = "Wind Speed",
                        tint = IconBlue,
                    )
                    Text(
                        text = "Wind Speed",
                        color = Color.Gray
                    )
                    Text(
                        text = "12km/h",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        color = NavyBlue
                    )
                }
                Column(horizontalAlignment = Alignment.Start) {
                    Icon(
                        painter = painterResource(id = R.drawable.sun),
                        contentDescription = "Temperature",
                        tint = IconBlue
                    )
                    Text(
                        text = "Temperature",
                        color = Color.Gray
                    )
                    Text(
                        text = "95c",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        color = NavyBlue
                    )
                }
            }
            Spacer(modifier = Modifier.height(20.dp))
            Divider()
            Spacer(modifier = Modifier.height(30.dp))
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(horizontalAlignment = Alignment.Start) {
                    Icon(
                        painter = painterResource(id = R.drawable.humidity),
                        contentDescription = "Humidity",
                        tint = IconBlue
                    )
                    Text(
                        text = "Humidity",
                        color = Color.Gray
                    )
                    Text(
                        text = "12g/m-3",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        color = NavyBlue
                    )
                }
                Column(
                    horizontalAlignment = Alignment.Start,
                    modifier = Modifier.padding(end = 19.dp)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.pressure),
                        contentDescription = "Pressure",
                        tint = IconBlue
                    )
                    Text(
                        text = "Pressure",
                        color = Color.Gray
                    )
                    Text(
                        text = "12kPa",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        color = NavyBlue
                    )
                }
            }
            Spacer(modifier = Modifier.height(20.dp))
            Divider()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MapSearchRow()
}