package br.com.furlaneto.murilo.compose_example.presentation.signup

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import br.com.furlaneto.murilo.compose_example.domain.model.ValidationResult
import br.com.furlaneto.murilo.compose_example.domain.usecase.SignUpUseCase

class SignUpViewModel : ViewModel(){
    var name by mutableStateOf("")
    var email by mutableStateOf("")
    var password by mutableStateOf("")
    private val signUpUseCase = SignUpUseCase()

    fun signUp(): ValidationResult {
        return signUpUseCase.execute(name, email, password)
    }

}