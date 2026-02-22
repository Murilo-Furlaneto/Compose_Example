package br.com.furlaneto.murilo.compose_example.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import br.com.furlaneto.murilo.compose_example.validators.Validator
import br.com.furlaneto.murilo.compose_example.model.Result
import br.com.furlaneto.murilo.compose_example.model.ValidationResult

class LoginViewModel : ViewModel(){
    var name by mutableStateOf("")
    var email by mutableStateOf("")
    var password by mutableStateOf("")
    var errorMessage by mutableStateOf<String?>(null)

    fun login() : ValidationResult {
        val result = Validator().loginValidator(name.trim(), email.trim(), password)
        return result
    }
}