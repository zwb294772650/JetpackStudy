package com.big.lifecycle

import android.os.Bundle
import android.os.SystemClock
import android.util.Log
import android.widget.Chronometer
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.big.lifecycle.ui.theme.JetpackStudyTheme

class MainActivity : ComponentActivity() {
     val chronometer:MyChronometer by lazy {
         findViewById(R.id.chronometer)

     }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lifecycle.addObserver(chronometer)
        Log.v("zwb","1111")
        Log.v("zwb","2222")

    }

    override fun onResume() {
        super.onResume()

    }

    override fun onPause() {
        super.onPause()

    }
}





@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackStudyTheme {
        Greeting("Android")
    }
}