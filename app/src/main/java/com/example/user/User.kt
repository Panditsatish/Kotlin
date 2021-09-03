package com.example.user

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "User_Table")
class User(@ColumnInfo(name="fName")val text:String,
           @ColumnInfo(name="lName")val text1: String) {
    @PrimaryKey(autoGenerate =true) var id=0

}