package com.example.restaurantdesigncompose.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.restaurantdesigncompose.R
import com.example.restaurantdesigncompose.ui.theme.RestaurantDesignComposeTheme

@Composable
fun ResetPasswordScreen(navController: NavController) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {

        Spacer(modifier = Modifier.height(40.dp))

        Image(
            painter = painterResource(id = R.drawable.downloading),
            contentDescription = "Reset Password Image",
            modifier = Modifier
                .width(300.dp)
                .height(250.dp)
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Reset",
            fontWeight = FontWeight.W500,
            style = MaterialTheme.typography.displayMedium,
            modifier = Modifier
                .align(Alignment.Start)
                .padding(start = 35.dp)
        )

        Text(
            text = "Password?",
            fontWeight = FontWeight.W500,
            style = MaterialTheme.typography.displayMedium,
            modifier = Modifier
                .align(Alignment.Start)
                .padding(start = 35.dp)
        )

        Spacer(modifier = Modifier.height(30.dp))

        val new_password = remember { mutableStateOf("") }
        val confirm_password = remember { mutableStateOf("") }
        TextField(
            value = new_password.value,
            onValueChange = {},
            label = { Text(text = "New Password", color = Color.Gray) },
            shape = RoundedCornerShape(16.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.Transparent,
                unfocusedContainerColor = Color.Transparent
            ),
            modifier = Modifier
                .width(330.dp)
                .height(50.dp),
            leadingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.work),
                    contentDescription = "Password image",
                    modifier = Modifier.size(25.dp),
                    tint = Color.Unspecified
                )
            }
        )

        Spacer(modifier = Modifier.height(20.dp))

        TextField(value = confirm_password.value,
            onValueChange = {},
            label = {Text(text="Confirm Password",color=Color.Gray)},
            shape = RoundedCornerShape(16.dp),
            modifier = Modifier.width(330.dp).height(50.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            colors=TextFieldDefaults.colors(
                focusedContainerColor = Color.Transparent,
                unfocusedContainerColor = Color.Transparent
            ),
            leadingIcon = {
                Icon(
                    painter = painterResource(id=R.drawable.password),
                    contentDescription = "Password image",
                    modifier = Modifier.size(25.dp),
                    tint = Color.Unspecified
                )
            }
        )

        Spacer(modifier = Modifier.height(120.dp))

        Button(
            onClick = {
                navController.navigate("HomeScreen")
            },
            modifier = Modifier
                .width(330.dp)
                .height(50.dp),
            shape = RoundedCornerShape(16.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF64FCD9),
                contentColor = Color.Black
            )
        ) {
            Text(
                text = "Submitting",
                fontSize = 18.sp,
                fontWeight = FontWeight.W500
            )
        }
    }

}


/*
@Preview(showBackground = true)
@Composable
fun ResetPasswordPreview() {
    RestaurantDesignComposeTheme {
        ResetPasswordScreen(navController = rememberNavController())
    }
}*/