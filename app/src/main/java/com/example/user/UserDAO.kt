package com.example.user

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface UserDAO {

    @Query("SELECT * FROM User_table ORDER BY id ASC")
    fun getAllUser(): LiveData<List<User>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(user: User)

    @Delete
    suspend fun delete(user: User)


}