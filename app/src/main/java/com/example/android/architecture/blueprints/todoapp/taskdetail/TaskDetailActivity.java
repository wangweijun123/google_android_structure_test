package com.example.android.architecture.blueprints.todoapp.taskdetail;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;

import com.example.android.architecture.blueprints.todoapp.Injection;
import com.example.android.architecture.blueprints.todoapp.R;

/**
 * Created by wangweijun on 2017/11/18.
 */

public class TaskDetailActivity extends Activity{
    public static final String TAG = "TaskDetailActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.taskdetail_act);

        FragmentTransaction ft = getFragmentManager().beginTransaction();
        TaskDetailFragment taskDetailFragment = TaskDetailFragment.newInstance("222");
        ft.add(R.id.contentFrame, taskDetailFragment).commit();

        String taskId = "xxxxx";
        // Create the presenter
        Log.e(TAG, "new TaskDetailPresenter");
        new TaskDetailPresenter(
                taskId,
                Injection.provideTasksRepository(getApplicationContext()),
                taskDetailFragment);
    }
}
