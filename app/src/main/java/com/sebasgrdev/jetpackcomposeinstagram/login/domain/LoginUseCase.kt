package com.sebasgrdev.jetpackcomposeinstagram.login.domain

import com.sebasgrdev.jetpackcomposeinstagram.login.data.LoginRepository

class LoginUseCase {
    private val repository = LoginRepository()

    suspend operator fun invoke(user:String, password:String) : Boolean {
        return repository.doLogin(user, password)
    }
}