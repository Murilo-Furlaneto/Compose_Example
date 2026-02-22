package br.com.furlaneto.murilo.compose_example

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import br.com.furlaneto.murilo.compose_example.routes.AppNavigation
import br.com.furlaneto.murilo.compose_example.ui.theme.Compose_exampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Compose_exampleTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    // O AppNavigation agora gerencia todas as telas e o padding
                    AppNavigation()
                }
            }
        }
    }
}
