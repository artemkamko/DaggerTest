package com.example.dwajot.daggertest

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.example.dwajot.daggertest.entity.AppTime
import com.example.dwajot.daggertest.entity.FirstActivityTime
import com.example.dwajot.daggertest.injection.component.DaggerFirstActivityComponent
import com.example.dwajot.daggertest.injection.component.FirstActivityComponent
import kotlinx.android.synthetic.main.activity_first.*
import javax.inject.Inject

class FirstActivity : AppCompatActivity() {
    @Inject
    lateinit var appTime: AppTime
    @Inject
    lateinit var firstActivityTime: FirstActivityTime

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        component.injectFirstActivity(this)
        tvAppTime.text = appTime.time
        tvFirstActivityTime.text = firstActivityTime.time

        btnNextActivity.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                val intent = Intent(baseContext, SecondActivity::class.java)
                startActivity(intent)
            }

        })
    }

    val component: FirstActivityComponent by lazy {
        DaggerFirstActivityComponent
                .builder()
                .appComponent(App.get(this).component)
                .build()
    }
}
