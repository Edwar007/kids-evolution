package com.pargar.kidsevolution.domain.usecase

import android.util.Patterns
import com.pargar.kidsevolution.domain.repository.AuthRepository
import com.pargar.kidsevolution.util.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class FirebaseSignUpUseCase @Inject constructor(
    private val authRepository: AuthRepository
) {

    suspend operator fun invoke(email: String, password: String): Flow<Resource<Boolean>> = flow {
        emit(Resource.Loading)
        try {
            if (isValidEmail(email)) {
                if (isValidPassword(password)) {
                    val isSignUpSuccessfully = authRepository.signUp(email, password)
                    if (isSignUpSuccessfully) {
                        emit(Resource.Success(true))
                    } else {
                        emit(Resource.Error("Fallo en el registro. Por favor inténtelo mas tarde."))
                    }
                } else {
                    emit(Resource.Error("Formato de contraseña. La contraseña debe contener al menos 8 caracteres, 1 letra y un número."))
                }
            } else {
                emit(Resource.Error("Correo inválido"))
            }
        } catch (e: Exception) {
            emit(Resource.Error("Error al registrarse: ${e.message}"))
        }
    }

    private fun isValidEmail(email: String): Boolean {
        // Aquí puedes implementar la lógica para verificar si el formato del correo es válido
        return Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }

    private fun isValidPassword(password: String): Boolean {
        // Aquí puedes implementar la lógica para verificar si el formato de la contraseña es válido
        val passwordPattern = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$".toRegex()
        return passwordPattern.matches(password)
    }


}

