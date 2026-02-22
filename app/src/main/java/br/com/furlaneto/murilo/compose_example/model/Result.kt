package br.com.furlaneto.murilo.compose_example.model

sealed class Result<out T> {
    data class Success<T>(val data: T) : Result<T>()
    data class Error(val message: String) : Result<Nothing>()
}

typealias ValidationResult = Result<Unit>
