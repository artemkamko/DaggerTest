package com.example.dwajot.daggertest.injection.module

import com.example.dwajot.daggertest.entity.AppTime
import com.example.dwajot.daggertest.injection.scope.PerApp
import dagger.Module
import dagger.Provides

@Module
open class AppModule {

    @Provides
    @PerApp
    fun appTime(): AppTime = AppTime
}