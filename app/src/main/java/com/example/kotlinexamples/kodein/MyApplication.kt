package com.example.kodeintest

import android.app.Application
import com.github.salomonbrys.kodein.Kodein
import com.github.salomonbrys.kodein.KodeinAware
import com.github.salomonbrys.kodein.bind
import com.github.salomonbrys.kodein.singleton

val appDiModule = Kodein.Module {
    import(diModule)
}

class MyApplication : Application(), KodeinAware {
    override val kodein: Kodein = Kodein{
        import(appDiModule)
    }
}
