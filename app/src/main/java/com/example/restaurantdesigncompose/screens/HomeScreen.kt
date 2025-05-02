package com.example.restaurantdesigncompose.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.restaurantdesigncompose.R
import com.example.restaurantdesigncompose.ui.theme.RestaurantDesignComposeTheme

@Composable
fun HomeScreen(navController: NavController) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top,
            modifier = Modifier
                .background(Color(0xFF64FCD9))
                .height(210.dp)
                .fillMaxWidth()
        ) {

            Spacer(modifier = Modifier.height(30.dp))

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Image(
                    painter = painterResource(id = R.drawable.menu),
                    contentDescription = "menu",
                    modifier = Modifier.size(25.dp)
                )

                Spacer(modifier = Modifier.padding(horizontal = 115.dp))

                Image(
                    painter = painterResource(id = R.drawable.cart),
                    contentDescription = "cart",
                    modifier = Modifier.size(25.dp)
                )


            }

            Spacer(modifier = Modifier.height(70.dp))

            val searchItem = remember { mutableStateOf("") }
            TextField(
                value = searchItem.value,
                onValueChange = {},
                label = { Text(text = "Search for Shops and Restaurants ", color = Color.Gray) },
                shape = RoundedCornerShape(16.dp),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                colors = TextFieldDefaults.colors(
                    unfocusedTextColor = Color.Transparent,
                    focusedContainerColor = Color.White
                ),
                modifier = Modifier
                    .width(340.dp)
                    .height(50.dp),
                leadingIcon = {
                    Icon(
                        painter = painterResource(id = R.drawable.search),
                        contentDescription = "Search icon",
                        modifier = Modifier.size(25.dp),
                        tint = Color.Unspecified
                    )
                }
            )

        }

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .height(650.dp)
                .fillMaxWidth()
        ) {

            Spacer(modifier = Modifier.height(15.dp))

            Image(
                painter = painterResource(id = R.drawable.item),
                contentDescription = "item",
                modifier = Modifier
                    .width(360.dp)
                    .height(120.dp)
            )

            Spacer(modifier = Modifier.height(15.dp))

            Image(
                painter = painterResource(id = R.drawable.item),
                contentDescription = "item",
                modifier = Modifier
                    .width(360.dp)
                    .height(120.dp)
            )

            Spacer(modifier = Modifier.height(15.dp))

            Image(
                painter = painterResource(id = R.drawable.item),
                contentDescription = "item",
                modifier = Modifier
                    .width(360.dp)
                    .height(120.dp)
            )

            Spacer(modifier = Modifier.height(15.dp))

            Image(
                painter = painterResource(id = R.drawable.item),
                contentDescription = "item",
                modifier = Modifier
                    .width(360.dp)
                    .height(120.dp)
            )

            Spacer(modifier = Modifier.height(15.dp))
            Image(
                painter = painterResource(id = R.drawable.item),
                contentDescription = "item",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .width(360.dp)
                    .height(120.dp)
            )

        }

    }

}


/*
@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    RestaurantDesignComposeTheme {
        HomeScreen()
    }
}*/