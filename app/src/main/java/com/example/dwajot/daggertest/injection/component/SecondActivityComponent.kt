package com.example.dwajot.daggertest.injection.component

import com.example.dwajot.daggertest.SecondActivity
import com.example.dwajot.daggertest.injection.module.SecondActivityModule
import com.example.dwajot.daggertest.injection.scope.PerSecondActivity
import dagger.Component

@PerSecondActivity
@Component(modules = arrayOf(SecondActivityModule::class), dependencies = arrayOf(AppComponent::class))
interface SecondActivityComponent {
    fun injectSecondActivity (activity : SecondActivity)
}