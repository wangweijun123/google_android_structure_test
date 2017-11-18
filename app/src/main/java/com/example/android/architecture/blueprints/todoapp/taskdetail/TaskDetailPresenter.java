package com.example.android.architecture.blueprints.todoapp.taskdetail;

import com.example.android.architecture.blueprints.todoapp.data.User;

/**
 * Created by wangweijun on 2017/11/18.
 */

public class TaskDetailPresenter implements TaskDetailContract.Presenter{
    private final TaskDetailContract.View mTaskDetailView;

    private TaskDetailModel mTaskDetailModel;
    public TaskDetailPresenter(TaskDetailContract.View taskDetailView) {
        mTaskDetailView = taskDetailView;
        mTaskDetailView.setPresenter(this);

        mTaskDetailModel = new TaskDetailModel();
    }


    @Override
    public void start() {

    }

    @Override
    public void login(String id) {
        mTaskDetailView.loging();
        mTaskDetailModel.login(id, new TaskDetailModel.LoginCallBack() {
            @Override
            public void loginSuccess(User u) {
                mTaskDetailView.loginSuccess(u);
            }

            @Override
            public void loginFailed(Throwable throwable) {
                mTaskDetailView.loginFailed(throwable);
            }
        });
    }

    @Override
    public void editTask() {
        mTaskDetailView.showEditTask("1111");

       mTaskDetailModel.editTask();


    }

    @Override
    public void deleteTask() {

    }

    @Override
    public void completeTask() {

    }

    @Override
    public void activateTask() {

    }
}
