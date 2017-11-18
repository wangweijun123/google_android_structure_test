package com.example.android.architecture.blueprints.todoapp.taskdetail;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;

import com.example.android.architecture.blueprints.todoapp.R;

/**
 * Created by wangweijun on 2017/11/18.
 */

public class TaskDetailActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.taskdetail_act);

        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.add(R.id.contentFrame, TaskDetailFragment.newInstance("222")).commit();
    }
}
