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
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.restaurantdesigncompose.R
import com.example.restaurantdesigncompose.ui.theme.RestaurantDesignComposeTheme

@Composable
fun ForgotPasswordScreen() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {

        Spacer(modifier = Modifier.height(40.dp))

        Image(
            painter = painterResource(id = R.drawable.group2),
            contentDescription = "Forgot Password Image",
            modifier = Modifier
                .width(300.dp)
                .height(260.dp)
        )

        Spacer(modifier = Modifier.height(30.dp))

        Text(
            text = "Forgot",
            fontWeight = FontWeight.W500,
            style = MaterialTheme.typography.displayLarge,
            modifier = Modifier
                .align(Alignment.Start)
                .padding(start = 35.dp)
        )

        Text(
            text = "Password?",
            fontWeight = FontWeight.W500,
            style = MaterialTheme.typography.displayLarge,
            modifier = Modifier
                .align(Alignment.Start)
                .padding(start = 35.dp)
        )

        Spacer(modifier = Modifier.height(30.dp))

        Text(
            text = "Don’t Worry it happens. Please Enter an email  or Mobile associated with your account",
            fontSize = 17.sp,
            modifier = Modifier
                .width(390.dp)
                .padding(start = 30.dp)
        )

        Spacer(modifier = Modifier.height(30.dp))

        val email = remember { mutableStateOf("") }
        TextField(
            value = email.value,
            onValueChange = {},
            shape = RoundedCornerShape(16.dp),
            label = {Text(text = "Email",color=Color.Gray)},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            colors=TextFieldDefaults.colors(
                unfocusedTextColor = Color.Transparent,
                focusedContainerColor = Color.Transparent
            ),
            modifier = Modifier
                .width(330.dp)
                .height(50.dp),
            leadingIcon = {
                Image(
                    painter = painterResource(id=R.drawable.work),
                    contentDescription = "Email image",
                    modifier = Modifier.size(25.dp))
            }
        )

        Spacer(modifier = Modifier.height(60.dp))

        Button(onClick = {},
            modifier = Modifier.width(330.dp).height(50.dp),
            shape = RoundedCornerShape(16.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor =Color(0xFF64FCD9),
                contentColor = Color.Black
            )) {
            Text(text="Submit",
                fontSize = 20.sp,
                fontWeight = FontWeight.W400)
        }


    }
}


@Preview(showBackground = true)
@Composable
fun ForgotPasswordPreview() {
    RestaurantDesignComposeTheme {
        ForgotPasswordScreen()
    }
}