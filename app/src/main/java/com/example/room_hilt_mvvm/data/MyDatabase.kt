package com.example.room_hilt_mvvm.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.room_hilt_mvvm.data.dao.MyDao
import com.example.room_hilt_mvvm.data.model.StudentEntity

@Database(
    entities = [StudentEntity::class],
    version = 1
)
abstract class MyDatabase : RoomDatabase(){
    abstract val dao: MyDao
}