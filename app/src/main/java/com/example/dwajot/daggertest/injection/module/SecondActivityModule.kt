package com.example.dwajot.daggertest.injection.module

import com.example.dwajot.daggertest.entity.SecondActivityTime
import com.example.dwajot.daggertest.injection.scope.PerSecondActivity
import dagger.Module
import dagger.Provides

@Module
class SecondActivityModule {

    @Provides
    @PerSecondActivity
    fun secondActivityTime () : SecondActivityTime = SecondActivityTime
}