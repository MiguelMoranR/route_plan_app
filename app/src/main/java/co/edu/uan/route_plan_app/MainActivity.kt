package co.edu.uan.route_plan_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import co.edu.uan.route_plan_app.ui.theme.Route_plan_appTheme
import androidx.compose.foundation.Image
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource

class MainActivity : ComponentActivity() {
       override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Route_plan_appTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingImage(
                        message = "Bienvenido...",
                        ingreso = "Ingrese sus credenciales")
                }
            }
        }
    }
}

@Composable
fun GreetingImage(message: String, ingreso: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.fondo_app)

        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alpha = 0.5F
        )

    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ) {
        Text(
        text = message,
        fontSize = 40.sp,
        modifier = Modifier
            .padding(16.dp)
            .align(alignment = Alignment.CenterHorizontally)
    )
    Text(
        text = ingreso,
        fontSize = 30.sp,
        modifier = Modifier
            .padding(16.dp)
            .align(alignment = Alignment.CenterHorizontally)

        )

    }
}



@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
    Route_plan_appTheme {
        GreetingImage(message = "Bienvenido...", ingreso = "Ingrese sus credenciales")
    }
}