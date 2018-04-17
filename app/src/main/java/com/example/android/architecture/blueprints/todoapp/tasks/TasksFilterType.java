package com.example.android.architecture.blueprints.todoapp.tasks;

/**
 * Created by wangweijun on 2018/4/17.
 */

public enum TasksFilterType {
    /**
     * Do not filter tasks.
     */
    ALL_TASKS,

    /**
     * Filters only the active (not completed yet) tasks.
     */
    ACTIVE_TASKS,

    /**
     * Filters only the completed tasks.
     */
    COMPLETED_TASKS
}
