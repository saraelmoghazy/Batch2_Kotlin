package com.example.kodeintest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlinexamples.R
import com.github.salomonbrys.kodein.KodeinInjector
import com.github.salomonbrys.kodein.android.AppCompatActivityInjector
import com.github.salomonbrys.kodein.instance

class MainActivity : AppCompatActivity(), AppCompatActivityInjector {
    override val injector: KodeinInjector = KodeinInjector()
    private val repository: TasksRepository by instance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializeInjector()
    }

    override fun onDestroy() {
        destroyInjector()
        super.onDestroy()
    }
}
