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
import com.example.restaurantdesigncompose.ui.theme.RestaurantDesignComposeTheme

class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            val navController = rememberNavController() // Sayfa geçişlerini yönetmek için navController tanımı

            RestaurantDesignComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Box(modifier = Modifier.padding(innerPadding)) {
                        }
                    }
                }
            }
        }
    }


//NavController (sayfa geçişlerini yönetir)
//NavHost (hangi sayfa nerede belli eder)
//navigate("sayfa_ismi") (butona tıklayınca geçişi sağlar)




@Composable
fun SignUpScreen() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 40.dp)
        ) {
            // Üstteki görsel
            Image(
                bitmap = ImageBitmap.imageResource(R.drawable.illustration1),
                contentDescription = "image",
                modifier = Modifier.size(300.dp, 300.dp)
            )

            // Başlık
            Text(
                text = "Sign Up",
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(end = 200.dp)
            )

            Spacer(modifier = Modifier.padding(15.dp))

            // Telefon numarası girişi alanı (şimdilik sabit)
            Row {
                Image(
                    bitmap = ImageBitmap.imageResource(R.drawable.calling),
                    contentDescription = "call image",
                    modifier = Modifier.size(30.dp, 30.dp)
                )
                TextField(
                    value = "Phone",
                    onValueChange = {}, // Buraya kullanıcıdan giriş alacak şekilde ayarlama yapılabilir
                    modifier = Modifier
                        .width(200.dp)
                        .height(50.dp)
                )
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

