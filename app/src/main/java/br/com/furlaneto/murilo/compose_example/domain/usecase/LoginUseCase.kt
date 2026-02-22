package br.com.furlaneto.murilo.compose_example.domain.usecase

import br.com.furlaneto.murilo.compose_example.domain.model.Result
import br.com.furlaneto.murilo.compose_example.domain.model.ValidationResult

class LoginUseCase {

    fun execute(name: String, email: String, password: String): ValidationResult {
        return when {
            name.isEmpty() || email.isEmpty() || password.isEmpty() -> 
                Result.Error("Preencha todos os campos")
            
            name.length < 3 -> 
                Result.Error("O nome deve ter pelo menos 3 caracteres")
            
            !email.contains("@") -> 
                Result.Error("O email deve conter um @")
            
            password.length < 6 -> 
                Result.Error("A senha deve ter pelo menos 6 caracteres")
            
            else -> Result.Success(Unit)
        }
    }
}
