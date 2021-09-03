package com.example.user

import androidx.lifecycle.LiveData

class userRepository(private val userDao: UserDAO) {

     val allUsers: LiveData<List<User>> = userDao.getAllUser()

    suspend fun insert(user: User) {
        userDao.insert(user)
    }
    suspend fun delete(user: User){
        userDao.delete(user)
    }
}
