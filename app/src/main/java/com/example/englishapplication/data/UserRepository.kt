package com.example.room.data

import androidx.lifecycle.LiveData
import com.example.englishapplication.data.UserDao

class UserRepository(private val userDao: UserDao) {


    val readAllData: LiveData<List<User>> = userDao.readAllData()

    suspend fun addUser(user:User){
        userDao.addUser(user)
    }

    suspend fun deleteUser(user: User){
        userDao.deleteByUserId(user)
    }
}