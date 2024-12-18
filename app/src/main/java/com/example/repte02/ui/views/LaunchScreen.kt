package com.example.repte02.ui.views
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.repte02.R


@Composable
fun MenuScreen(navigateToGame: (String) -> Unit) {
    Column (modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            painter = painterResource(id = R.drawable.dragonball_daima_logo),
            contentDescription = stringResource(id = R.string.app_name),
            modifier = Modifier.size(250.dp)
        )
        Spacer(modifier = Modifier.weight(1f))
        Button(onClick = { navigateToGame("hello") }) {
            Text(text = "Start Game")
        }
        Spacer(modifier = Modifier.weight(1f))
    }
}