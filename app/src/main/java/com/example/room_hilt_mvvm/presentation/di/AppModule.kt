package com.example.room_hilt_mvvm.presentation.di

import android.app.Application
import androidx.room.Room
import com.example.room_hilt_mvvm.data.MyDatabase
import com.example.room_hilt_mvvm.data.repository.RepositoryImpl
import com.example.room_hilt_mvvm.domain.repository.Repository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object AppModule {

    @Provides
    @Singleton
    fun provideMyDatabase(app: Application) : MyDatabase {
        return Room.databaseBuilder(
            app,
            MyDatabase::class.java,
            "MyDatabase"
        ).build()
    }

    @Provides
    @Singleton
    fun provideMyRepository(mydb:MyDatabase): Repository {
        return RepositoryImpl(mydb.dao)
    }
}