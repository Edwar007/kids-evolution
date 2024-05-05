package com.pargar.kidsevolution.di

import com.pargar.kidsevolution.data.remote.FirebaseAuthRepositoryImpl
import com.pargar.kidsevolution.domain.repository.AuthRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract fun bindAuthRepository(authRepository: FirebaseAuthRepositoryImpl): AuthRepository
}