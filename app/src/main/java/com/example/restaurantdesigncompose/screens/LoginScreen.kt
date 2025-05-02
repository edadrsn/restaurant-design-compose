package com.example.restaurantdesigncompose.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.platform.LocalGraphicsContext
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
fun LoginScreen() {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {

        Image(
            painter = painterResource(id = R.drawable.group1),
            contentDescription = "Login image",
            modifier = Modifier
                .width(300.dp)
                .height(300.dp)
                .padding(top = 20.dp)
        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Login",
            style = MaterialTheme.typography.displayLarge,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .align(Alignment.Start)
                .padding(start = 25.dp)
        )

        Spacer(modifier = Modifier.height(10.dp))

        val email = remember { mutableStateOf("") }
        val password = remember { mutableStateOf("") }
        TextField(
            value = email.value, onValueChange = {},
            label = { Text("Email or Mobile", color = Color.Gray) },
            shape = RoundedCornerShape(16.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            colors = TextFieldDefaults.colors(
                unfocusedLabelColor = Color.Transparent,
                focusedContainerColor = Color.Transparent
            ),
            leadingIcon = {
                Image(
                    painter = painterResource(id = R.drawable.work),
                    contentDescription = "Email image",
                    modifier = Modifier.size(25.dp)
                )
            },
            modifier = Modifier
                .width(330.dp)
                .height(50.dp),
        )

        Spacer(modifier = Modifier.height(15.dp))

        TextField(
            value = password.value,
            onValueChange = {},
            label = { Text("Password", color = Color.Gray) },
            shape = RoundedCornerShape(16.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            colors = TextFieldDefaults.colors(
                unfocusedLabelColor = Color.Transparent,
                focusedContainerColor = Color.Transparent
            ),
            leadingIcon = {
                Image(
                    painter = painterResource(id = R.drawable.password),
                    contentDescription = "Password icon",
                    modifier = Modifier.size(25.dp)
                )
            },
            modifier = Modifier
                .width(330.dp)
                .height(50.dp)
        )

        Spacer(modifier = Modifier.height(15.dp))

        Text(
            text = "Forgot Password?",
            fontSize = 17.sp,
            modifier = Modifier
                .align(Alignment.End)
                .padding(end = 30.dp)
        )

        Spacer(modifier = Modifier.height(15.dp))

        Button(
            onClick = {},
            modifier = Modifier
                .width(330.dp)
                .height(50.dp),
            shape = RoundedCornerShape(16.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF64FCD9),
                contentColor = Color.Black
            )
        ) {
            Text(text = "Continue", fontSize = 20.sp)
        }

        Spacer(modifier = Modifier.height(15.dp))

        Text(text = "OR", fontSize = 17.sp, color = Color.Black)

        Spacer(modifier = Modifier.height(15.dp))

        Button(
            onClick = {},
            modifier = Modifier
                .width(330.dp)
                .height(50.dp),
            shape = RoundedCornerShape(16.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFF3F2F2)
            )
        ) {

            //GOOGLE ICONU EKLEME
            Icon(
                painter = painterResource(id = R.drawable.google),
                contentDescription = "Google icon",
                modifier = Modifier.size(24.dp),
                tint = Color.Unspecified
            )
            Spacer(modifier = Modifier.padding(35.dp))
            Text(
                text = "Login With Google",
                fontSize = 20.sp,
                fontWeight = FontWeight.W400,
                color = Color.Black
            )
        }

        Spacer(modifier = Modifier.height(10.dp))

        Button(
            onClick = {},
            modifier = Modifier
                .width(330.dp)
                .height(50.dp),
            shape = RoundedCornerShape(16.dp),
            colors=ButtonDefaults.buttonColors(
                containerColor = Color(0xFFF3F2F2)
            )
        ) {
            Icon(
                painter = painterResource(id = R.drawable.facebook),
                contentDescription = "Facebook image",
                modifier = Modifier.size(24.dp),
                tint = Color.Unspecified
            )
            Spacer(modifier = Modifier.padding(30.dp))

            Text(
                text = "Login With Facebok",
                fontSize = 20.sp,
                fontWeight = FontWeight.W400,
                color = Color.Black
            )
        }

        Spacer(modifier = Modifier.height(20.dp))

        Row(verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center){
            Text(text="New to us?", fontSize = 17.sp)
            Text(text="Register", fontSize = 17.sp, fontWeight = FontWeight.Bold)
        }


    }
}


@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    RestaurantDesignComposeTheme {
        LoginScreen()
    }
}