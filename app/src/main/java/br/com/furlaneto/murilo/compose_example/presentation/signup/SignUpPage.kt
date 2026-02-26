package br.com.furlaneto.murilo.compose_example.presentation.signup

import br.com.furlaneto.murilo.compose_example.domain.model.Result
import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun SignUpPage(
    onLoginSucess: () -> Unit,
    viewModel: SignUpViewModel = viewModel()
) {
    val context = LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Bem-vindo",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary
        )

        Spacer(modifier = Modifier.height(32.dp))

        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = viewModel.name,
            onValueChange = { viewModel.name = it },
            label = { Text("Nome") },
            leadingIcon = { Icon(Icons.Default.Person, contentDescription = null) },
            shape = RoundedCornerShape(12.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = viewModel.email,
            onValueChange = { viewModel.email = it },
            label = { Text("Email") },
            leadingIcon = { Icon(Icons.Default.Email, contentDescription = null) },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            shape = RoundedCornerShape(12.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = viewModel.password,
            onValueChange = { viewModel.password = it },
            label = { Text("Senha") },
            leadingIcon = { Icon(Icons.Default.Lock, contentDescription = null) },
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            shape = RoundedCornerShape(12.dp)
        )

        Spacer(modifier = Modifier.height(32.dp))

        Button(
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp),
            enabled = viewModel.name.isNotBlank() && viewModel.email.isNotBlank() && viewModel.password.isNotBlank(),
            onClick = {
                when (val validation = viewModel.signUp()) {
                    is Result.Success -> {
                        Toast.makeText(context, "Login realizado com sucesso!", Toast.LENGTH_SHORT).show()
                        onLoginSucess()
                    }
                    is Result.Error -> {
                        Toast.makeText(context, validation.message, Toast.LENGTH_SHORT).show()
                    }
                }
            },
            shape = RoundedCornerShape(12.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.primary
            )
        ) {
            Text(
                text = "ENTRAR",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}
