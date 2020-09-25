package org.koin.sample.androidx.compose.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import org.koin.androidx.compose.getKoin
import org.koin.androidx.compose.getViewModel
import org.koin.core.KoinExperimentalAPI
import org.koin.sample.androidx.compose.viewmodel.UserViewModel

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme { App() }
        }
    }

    @Composable
    @Preview
    fun Preview() {
        App()
    }
}

@Composable
fun App() {
    UsersView(getViewModel())
}

@Composable
fun UsersView(viewModel: UserViewModel) {
    Column(
        modifier = Modifier.padding(16.dp)
    ) {
        viewModel.getUsers().forEach { user ->
            Text(
                text = user.name,
                color = Color.Blue
            )
        }
    }
}