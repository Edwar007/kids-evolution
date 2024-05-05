package com.pargar.kidsevolution.data.remote

import android.util.Log
import com.pargar.kidsevolution.domain.repository.AuthRepository
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import kotlinx.coroutines.tasks.await
import javax.inject.Inject

class FirebaseAuthRepositoryImpl @Inject constructor(private val firebaseAuth: FirebaseAuth ): AuthRepository {


    override suspend fun login(email: String, password: String): Boolean {
        return try {
            var isSuccessful: Boolean = false

            firebaseAuth.signInWithEmailAndPassword(email, password)
                .addOnSuccessListener { isSuccessful = true }
                .addOnFailureListener { isSuccessful = false }
                .await()
            isSuccessful
        } catch (e: Exception) {
            Log.d("test", e.toString())
            false
        }
    }

    override suspend fun signUp(email: String, password: String): Boolean {
        return try {
            var isSuccessful: Boolean = false
            var mData: DatabaseReference
            mData = FirebaseDatabase.getInstance().getReference()

            firebaseAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener { isSuccessful = it.isSuccessful}
                .await()
            if (isSuccessful){
                val map = mutableMapOf<String, String>()
                map["Correo"] = email
                map["Contraseña"] = password
                var id = firebaseAuth.currentUser.uid
                mData.child("Users").child(id).setValue(map)
            }
            isSuccessful

        } catch (e: Exception) {
            false
        }
    }
}