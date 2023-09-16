package com.example.myapp

import android.content.res.Configuration
import android.graphics.Paint.Style
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.magnifier
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.surfaceColorAtElevation
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapp.ui.theme.MyAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    myView()
                }
            }
        }
    }
}


@Composable
fun message(name1: String, name2: String) {

    Text(
        text = "$name1!",
        color = Color.Green,// MaterialTheme.colorScheme.primary ,
        style = MaterialTheme.typography.titleSmall
    )
    Text(
        text = "$name2!",
        style = MaterialTheme.typography.bodyMedium,
        color = MaterialTheme.colorScheme.primary
    )
}


@Preview(
    name = "Light Mode",
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_YES
)
@Preview(
    name = "Medium Mode",
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_NO
)

@Preview(
    name = "Dark Mode"

)

@Composable
fun previewMessage() {
    myView()
}

@Composable
fun myView() {
    messageCard()
}

@Composable
fun messageCard() {
    Row(modifier = Modifier.padding(all = 14.dp)) {
        Image(
            painter = painterResource(id = R.drawable.sample1),
            contentDescription = null,
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
                .border(1.5.dp, MaterialTheme.colorScheme.primary, CircleShape)
        )

        Spacer(modifier = Modifier.width(8.dp))
        Column {
            message(name1 = "John", name2 = "Hey,Take a look at Jetpack Compose, it's great!")
            Spacer(modifier = Modifier.height(4.dp))
        }

    }
}