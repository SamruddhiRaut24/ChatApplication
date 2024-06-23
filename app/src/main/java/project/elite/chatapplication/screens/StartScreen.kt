package project.elite.chatapplication.screens

import android.inputmethodservice.Keyboard.Row
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import project.elite.chatapplication.R
import project.elite.chatapplication.navigation.Screens

@Composable
fun StartScreen(navController: NavController) {


    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Black),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {


            Image(
                painter = painterResource(id = R.drawable.background),
                contentDescription = "backgoundimage",
                modifier = Modifier
                    .clip(RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp))
                    .fillMaxWidth(),
                contentScale = ContentScale.Crop
            )

        Spacer(modifier = Modifier.height(30.dp))

        Text(text = "Stay connected with your friends and family", color = Color.White,
            fontWeight = FontWeight.Bold,
            fontSize = 50.sp,
            lineHeight = 50.sp

        )

        Spacer(modifier = Modifier.height(30.dp))

        Row {
            Icon(
                imageVector = Icons.Default.CheckCircle,
                contentDescription = "", tint = Color.White
            )


            Text(
                text = "Secure, private messaging",
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 15.sp,
                lineHeight = 40.sp

            )
        }

        Spacer(modifier = Modifier.height(30.dp))
        
        Button(onClick = { navController.navigate(Screens.SignInScreen.route) }) {
            
            Text(text = "Get Started")
        }

    }

}
