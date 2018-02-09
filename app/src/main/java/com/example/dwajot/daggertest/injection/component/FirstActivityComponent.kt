package com.example.dwajot.daggertest.injection.component

import com.example.dwajot.daggertest.FirstActivity
import com.example.dwajot.daggertest.injection.module.FirstActivityModule
import com.example.dwajot.daggertest.injection.scope.PerFirstActivity
import dagger.Component

@PerFirstActivity
@Component(modules = arrayOf(FirstActivityModule::class), dependencies = arrayOf(AppComponent::class))
interface FirstActivityComponent {
    fun injectFirstActivity(firstActivity: FirstActivity)
}