package br.com.furlaneto.murilo.compose_example.presentation.login

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import br.com.furlaneto.murilo.compose_example.domain.model.Result
import br.com.furlaneto.murilo.compose_example.domain.model.ValidationResult
import br.com.furlaneto.murilo.compose_example.domain.usecase.LoginUseCase

class LoginViewModel : ViewModel() {

    var email by mutableStateOf("")
    var password by mutableStateOf("")
    
    private val loginUseCase = LoginUseCase()

    fun login(): ValidationResult {
        return loginUseCase.execute(email, password)
    }
}
