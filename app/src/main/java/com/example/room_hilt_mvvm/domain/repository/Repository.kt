package com.example.room_hilt_mvvm.domain.repository

import com.example.room_hilt_mvvm.data.model.StudentEntity
import kotlinx.coroutines.flow.Flow

interface Repository {
    suspend fun insert(studentEntity: StudentEntity)

    suspend fun delete(studentEntity: StudentEntity)

    suspend fun update(studentEntity: StudentEntity)

    suspend fun getAllStudents(): Flow<List<StudentEntity>>
}