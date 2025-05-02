package com.example.restaurantdesigncompose.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.key
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.restaurantdesigncompose.R
import com.example.restaurantdesigncompose.ui.theme.RestaurantDesignComposeTheme
import androidx.compose.material3.Text as Text


@Composable
fun SignUpScreen() {
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {

        Image(
            bitmap = ImageBitmap.imageResource(id = R.drawable.illustration1),
            contentDescription = "illustration image",
            modifier = Modifier
                .width(300.dp)
                .height(300.dp)
        )

        Spacer(modifier = Modifier.padding(10.dp))

        Text(
            text = "Sign Up",
            style = MaterialTheme.typography.displayMedium,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .align(Alignment.Start)
                .padding(start = 10.dp)
        )

        Spacer(modifier = Modifier.padding(10.dp))


        val mobile = remember { mutableStateOf("") }
        val fullname = remember { mutableStateOf("") }
        val email = remember { mutableStateOf("") }
        val password = remember { mutableStateOf("") }

        TextField(
            value = mobile.value, onValueChange = {},
            modifier = Modifier
                .width(330.dp)
                .height(30.dp),
            shape = RoundedCornerShape(16.dp),
            label = { Text(text = "Mobile", color = Color.Gray) },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
            colors = TextFieldDefaults.colors(
                unfocusedLabelColor = Color.Transparent,
                focusedContainerColor = Color.Transparent,
            ),
            leadingIcon = {
                Image(
                    painter = painterResource(id = R.drawable.calling),
                    contentDescription = "Phone Icon",
                    modifier = Modifier.size(20.dp)
                )
            }
        )

        Spacer(modifier = Modifier.padding(bottom = 30.dp))

        TextField(
            value = fullname.value, onValueChange = {},
            modifier = Modifier
                .width(330.dp)
                .height(30.dp),
            shape = RoundedCornerShape(16.dp),
            label = { Text(text = "Fullname", color = Color.Gray) },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            colors = TextFieldDefaults.colors(
                unfocusedLabelColor = Color.Transparent,
                focusedContainerColor = Color.Transparent
            ),
            leadingIcon = {
                Image(
                    painter = painterResource(id = R.drawable.profile),
                    contentDescription = "Phone Icon",
                    modifier = Modifier.size(20.dp)
                )
            }
        )


        Spacer(modifier = Modifier.padding(bottom = 30.dp))

        TextField(
            value = email.value, onValueChange = {},
            modifier = Modifier
                .width(330.dp)
                .height(30.dp),
            shape = RoundedCornerShape(16.dp),
            label = { Text(text = "Email", color = Color.Gray) },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            colors = TextFieldDefaults.colors(
                unfocusedLabelColor = Color.Transparent,
                focusedContainerColor = Color.Transparent
            ),
            leadingIcon = {
                Image(
                    painter = painterResource(id = R.drawable.work),
                    contentDescription = "Phone Icon",
                    modifier = Modifier.size(20.dp)
                )
            }
        )

        Spacer(modifier = Modifier.padding(bottom = 30.dp))

        TextField(
            value = password.value, onValueChange = {},
            modifier = Modifier
                .width(330.dp)
                .height(30.dp),
            shape = RoundedCornerShape(16.dp),
            label = { Text(text = "Password", color = Color.Gray) },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            colors = TextFieldDefaults.colors(
                unfocusedLabelColor = Color.Transparent,
                focusedContainerColor = Color.Transparent
            ),
            leadingIcon = {
                Image(
                    painter = painterResource(id = R.drawable.password),
                    contentDescription = "Phone Icon",
                    modifier = Modifier.size(20.dp)
                )
            }
        )

        Spacer(modifier = Modifier.padding(15.dp))

        Text(
            text = "By Signing up, you’re agree to our  Term & Conditions and Privacy Policy",
            fontSize = 17.sp,
            modifier = Modifier
                .width(350.dp)
                .padding(start = 5.dp)
        )

        Spacer(modifier = Modifier.padding(15.dp))

        Button(
            onClick = {},
            modifier = Modifier
                .width(330.dp)
                .height(50.dp),
            shape = RoundedCornerShape(16.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF64FCD9),
                contentColor = Color(0xFF000000)
            )
        ) {
            Text(text = "Continue", fontSize = 17.sp)
        }

        Spacer(modifier = Modifier.padding(10.dp))

        Row(horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()){
            Text(text = "Joined before? ", fontSize = 17.sp)
            Text(
                text = "Login",
                fontWeight = FontWeight.Bold,
                fontSize = 17.sp
            )
        }

    }

}


@Preview(showBackground = true)
@Composable
fun SignUpScreenPreview() {
    RestaurantDesignComposeTheme {
        SignUpScreen()
    }
}