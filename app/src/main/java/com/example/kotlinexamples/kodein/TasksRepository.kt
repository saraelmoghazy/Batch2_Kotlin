package com.example.kodeintest

interface TasksRepository {
    fun createNewTask(message: String) : Task
    fun getTasks(): List<Task>
}