package com.example.restaurantdesigncompose.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.restaurantdesigncompose.R
import com.example.restaurantdesigncompose.ui.theme.RestaurantDesignComposeTheme

@Composable
fun SignupConfirmScreen() {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        Spacer(modifier = Modifier.height(50.dp))

        Image(painter = painterResource(id= R.drawable.illustration1),
            contentDescription = "Signup Confirm Image",
            modifier = Modifier.width(320.dp).height(280.dp))

        Spacer(modifier = Modifier.height(30.dp))

        Image(painter = painterResource(id=R.drawable.msgplane),
            contentDescription = "message plane",
            modifier = Modifier.size(160.dp))

        Spacer(modifier = Modifier.height(10.dp))

        Text(text="Signedup Successfully",
            fontSize = 20.sp,
            fontWeight = FontWeight.W400)

        Spacer(modifier = Modifier.height(170.dp))

        Button(onClick = {},
            modifier = Modifier.width(340.dp).height(50.dp),
            shape = RoundedCornerShape(16.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF64FCD9),
                contentColor = Color.Black
            )) {
            Text(text = "Login", fontSize = 20.sp)
        }

    }
}


@Preview(showBackground = true)
@Composable
fun SignupConfirmPreview() {
    RestaurantDesignComposeTheme {
        SignupConfirmScreen()
    }

}