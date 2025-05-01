package com.example.restaurantdesigncompose.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.restaurantdesigncompose.ui.theme.RestaurantDesignComposeTheme

@Composable
fun StartScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.Start
    ) {
        // Başlık yazısı
        Text(
            text = "You are a",
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(start = 30.dp)
        )

        Spacer(modifier = Modifier.padding(10.dp)) // Boşluk

        // Restaurant butonu
        Button(
            onClick = {

            },
            modifier = Modifier
                .padding(start = 30.dp)
                .width(350.dp)
                .height(50.dp),
            shape = RoundedCornerShape(16.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF64FCD9),
                contentColor = Color.Black
            )
        ) {
            Text(text = "Restaurant", fontSize = 18.sp)
        }

        Spacer(modifier = Modifier.padding(10.dp)) // Boşluk

        // Customer butonu
        Button(
            onClick = {
            },
            modifier = Modifier
                .padding(start = 30.dp)
                .width(350.dp)
                .height(50.dp),
            shape = RoundedCornerShape(16.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF64FCD9),
                contentColor = Color.Black
            )
        ) {
            Text(text = "Customer", fontSize = 18.sp)
        }
    }
}


@Preview(showBackground = true)
@Composable
fun StartScreenPreview() {
    RestaurantDesignComposeTheme {
        StartScreen()
    }
}