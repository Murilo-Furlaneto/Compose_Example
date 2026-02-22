package br.com.furlaneto.murilo.compose_example.validators

import br.com.furlaneto.murilo.compose_example.model.Result
import br.com.furlaneto.murilo.compose_example.model.ValidationResult

class Validator {
    fun loginValidator(name: String, email: String, password: String): ValidationResult {
        return when {
            name.isBlank() -> Result.Error("O nome não pode estar vazio")
            name.trim().length < 3 -> Result.Error("O nome deve ter pelo menos 3 caracteres")
            email.isBlank() -> Result.Error("O email não pode estar vazio")
            !email.contains("@") || !email.contains(".") -> Result.Error("Email parece inválido")
            password.isBlank() -> Result.Error("A senha não pode estar vazia")
            password.length < 6 -> Result.Error("A senha deve ter pelo menos 6 caracteres")
            else -> Result.Success(Unit)
        }
    }
}
