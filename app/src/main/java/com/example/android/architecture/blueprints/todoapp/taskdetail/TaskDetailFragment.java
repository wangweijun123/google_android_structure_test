package com.example.android.architecture.blueprints.todoapp.taskdetail;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.architecture.blueprints.todoapp.R;
import com.example.android.architecture.blueprints.todoapp.data.User;

/**
 * Created by wangweijun on 2017/11/18.
 */

public class TaskDetailFragment extends Fragment implements TaskDetailContract.View {

    private TaskDetailContract.Presenter mPresenter;

    private static final String ARGUMENT_TASK_ID = "TASK_ID";

    private TextView mDetailTitle;

    public static TaskDetailFragment newInstance(@Nullable String taskId) {
        Bundle arguments = new Bundle();
        arguments.putString(ARGUMENT_TASK_ID, taskId);
        TaskDetailFragment fragment = new TaskDetailFragment();
        fragment.setArguments(arguments);
        return fragment;
    }


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.taskdetail_frag, container, false);

        mDetailTitle = (TextView)root.findViewById(R.id.task_detail_title);


        root.findViewById(R.id.task_detail_complete).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPresenter.login("1");
            }
        });

        // Create the presenter
        new TaskDetailPresenter(this);

        return root;
    }



    @Override
    public void setPresenter(TaskDetailContract.Presenter presenter) {
        mPresenter = presenter;
    }

    @Override
    public void setLoadingIndicator(boolean active) {

    }

    @Override
    public void showMissingTask() {

    }

    @Override
    public void hideTitle() {

    }

    @Override
    public void showTitle(String title) {

    }

    @Override
    public void hideDescription() {

    }

    @Override
    public void showDescription(String description) {

    }

    @Override
    public void showCompletionStatus(boolean complete) {

    }

    @Override
    public void showEditTask(String taskId) {
        Toast.makeText(getActivity(), taskId, Toast.LENGTH_LONG).show();
    }

    @Override
    public void showTaskDeleted() {

    }

    @Override
    public void showTaskMarkedComplete() {

    }

    @Override
    public void showTaskMarkedActive() {

    }

    @Override
    public void loginSuccess(User u) {
        mDetailTitle.setText("欢迎"+u.nickName+"回来");
    }

    @Override
    public void loginFailed(Throwable throwable) {
        mDetailTitle.setText("登陆失败");
    }

    @Override
    public void loging() {
        mDetailTitle.setText("正在登陆...");
    }

    @Override
    public boolean isActive() {
        return false;
    }
}
