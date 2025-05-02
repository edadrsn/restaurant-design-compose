package com.example.restaurantdesigncompose

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat.startActivity
import androidx.lifecycle.compose.dropUnlessStarted
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.restaurantdesigncompose.screens.ForgotPasswordScreen
import com.example.restaurantdesigncompose.screens.HomeScreen
import com.example.restaurantdesigncompose.screens.LoginScreen
import com.example.restaurantdesigncompose.screens.ResetPasswordScreen
import com.example.restaurantdesigncompose.screens.SignUpScreen
import com.example.restaurantdesigncompose.screens.SignupConfirmScreen
import com.example.restaurantdesigncompose.screens.StartScreen
import com.example.restaurantdesigncompose.ui.theme.RestaurantDesignComposeTheme

class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            val navController = rememberNavController()

            RestaurantDesignComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Box(modifier = Modifier.padding(innerPadding)) {
                        //NAVIGASYON OLUŞTURMA
                        //NavHost:hangi ekranda ne gösterileceğini ve sayfalar arası geçişleri nasıl yöneteceğini belirler. Yani:
                        //Başlangıç ekranını (startDestination) belirler.
                        //Hangi ekrana hangi route (isimle) geçileceğini tanımlar.
                        //NavController ile birlikte çalışarak butona tıklanınca hangi ekran açılacak sorusunun cevabını verir

                        NavHost(navController = navController, startDestination = "StartScreen") {
                            composable("StartScreen") {
                                StartScreen(navController)
                            }
                            composable("SignUpScreen") {
                                SignUpScreen(navController)
                            }
                            composable("LoginScreen") {
                                LoginScreen(navController)
                            }
                            composable("ForgotPasswordScreen") {
                                ForgotPasswordScreen(navController)
                            }
                            composable("ResetPasswordScreen") {
                                ResetPasswordScreen(navController)
                            }
                            composable("HomeScreen") {
                                HomeScreen(navController)
                            }
                            composable("SignupConfirmScreen") {
                                SignupConfirmScreen(navController)
                            }
                        }
                    }
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    RestaurantDesignComposeTheme {

    }
}

