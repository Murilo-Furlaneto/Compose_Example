package br.com.furlaneto.murilo.compose_example

import br.com.furlaneto.murilo.compose_example.validators.Validator
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun testLoginValidator(){
        val validator = Validator()
        validator.loginValidator("Murilo", "william.henry.harrison@example-pet-store.com", "123456")
    }
}