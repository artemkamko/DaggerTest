package com.example.dwajot.daggertest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.dwajot.daggertest.entity.AppTime
import com.example.dwajot.daggertest.entity.SecondActivityTime
import com.example.dwajot.daggertest.injection.component.DaggerSecondActivityComponent
import com.example.dwajot.daggertest.injection.component.SecondActivityComponent
import kotlinx.android.synthetic.main.activity_second.*
import javax.inject.Inject

class SecondActivity : AppCompatActivity() {
    @Inject lateinit var appTime : AppTime
    @Inject lateinit var secondActivityTime : SecondActivityTime


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        component.injectSecondActivity(this)
        tvAppTime.text = appTime.time
        tvSecondActivityTime.text = secondActivityTime.time
    }

    val component: SecondActivityComponent by lazy {
        DaggerSecondActivityComponent
                .builder()
                .appComponent(App.get(this).component)
                .build()
    }
}
