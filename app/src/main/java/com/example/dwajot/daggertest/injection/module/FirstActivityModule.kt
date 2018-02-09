package com.example.dwajot.daggertest.injection.module

import com.example.dwajot.daggertest.entity.FirstActivityTime
import com.example.dwajot.daggertest.injection.scope.PerFirstActivity
import dagger.Module
import dagger.Provides


@Module
open class FirstActivityModule {

    @Provides
    @PerFirstActivity
    fun firstActivityTime(): FirstActivityTime = FirstActivityTime
}