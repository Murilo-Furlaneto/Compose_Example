package br.com.furlaneto.murilo.compose_example.domain.usecase

import br.com.furlaneto.murilo.compose_example.domain.model.Result
import br.com.furlaneto.murilo.compose_example.domain.model.ValidationResult

class SignUpUseCase {

    fun execute(name: String, email: String, password: String): ValidationResult {
        val nameResult = validateName(name)
        val emailResult = validateEmail(email)
        val passwordResult = validatePassword(password)

        return when {
            nameResult is Result.Error -> nameResult
            emailResult is Result.Error -> emailResult
            passwordResult is Result.Error -> passwordResult
            else -> Result.Success(Unit)
        }
    }

    private fun validateName(name: String): ValidationResult {
        return when {
            name.isEmpty() -> Result.Error("O nome não pode estar vazio")
            name.length < 3 -> Result.Error("O nome deve ter pelo menos 3 caracteres")
            else -> Result.Success(Unit)
        }
    }

    private fun validateEmail(email: String): ValidationResult {
        return when {
            email.isEmpty() -> Result.Error("O email não pode estar vazio")
            !email.contains("@") -> Result.Error("O email deve conter um @")
            else -> Result.Success(Unit)
        }
    }

    private fun validatePassword(password: String): ValidationResult {
        return when {
            password.isEmpty() -> Result.Error("A senha não pode estar vazia")
            password.length < 6 -> Result.Error("A senha deve ter pelo menos 6 caracteres")
            else -> Result.Success(Unit)
        }
    }
}
