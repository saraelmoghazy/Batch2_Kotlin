package com.example.kodeintest

class FakeTasksRepository : TasksRepository {
    private var tasksList = mutableListOf<Task>()
    override fun createNewTask(message: String): Task {
        val task = Task(message)
        tasksList.add(task)
        return task
    }

    override fun getTasks(): List<Task> {
        return tasksList
    }
}