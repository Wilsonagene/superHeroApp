package com.example.superheroapp

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.superheroapp.ui.theme.SuperHeroAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SuperHeroAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    HeroCard(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun HeroItem(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
    ) {
        HeroCard()
        HeroIcon()
    }
}


@Composable
fun HeroCard(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text(
            text = stringResource(R.string.hero1),
            style = MaterialTheme.typography.displaySmall,
            modifier = modifier
        )

        Text(
            text = stringResource(R.string.description1),
            style = MaterialTheme.typography.bodyLarge,
            modifier = modifier
        )
    }
}

@Composable
fun HeroIcon(modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(R.drawable.android_superhero1),
        contentDescription = null,
        modifier = modifier
            .size(72.dp)
            .clip(MaterialTheme.shapes.small)
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SuperHeroAppTheme {
        HeroItem()
    }
}