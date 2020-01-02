package com.example.kodeintest

import com.github.salomonbrys.kodein.Kodein
import com.github.salomonbrys.kodein.bind
import com.github.salomonbrys.kodein.singleton

val diModule = Kodein.Module {
    bind<TasksRepository>() with singleton {
        FakeTasksRepository()
    }
}