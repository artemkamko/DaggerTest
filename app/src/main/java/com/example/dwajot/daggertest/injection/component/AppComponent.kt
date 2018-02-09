package com.example.dwajot.daggertest.injection.component

import com.example.dwajot.daggertest.entity.AppTime
import com.example.dwajot.daggertest.injection.module.AppModule
import com.example.dwajot.daggertest.injection.scope.PerApp
import dagger.Component

@PerApp
@Component (modules = arrayOf(AppModule::class))
interface AppComponent {
    fun appTime () : AppTime
}