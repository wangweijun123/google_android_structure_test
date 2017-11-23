package com.example.android.architecture.blueprints.todoapp.taskdetail;

import android.os.Handler;
import android.text.TextUtils;

import com.example.android.architecture.blueprints.todoapp.data.Task;
import com.example.android.architecture.blueprints.todoapp.data.User;

/**
 * Created by wangweijun on 2017/11/18.
 */

public class TaskDetailModel {

    interface LoginCallBack {
        void loginSuccess(User u);

        void loginFailed(Throwable throwable);
    }

    public Task editTask() {
//        return new Task();
        return null;
    }

    public void login(final String id, final LoginCallBack callBack) {
        new Handler().postDelayed(new Runnable() {
            @Override public void run() {
                boolean error = false;
                if (TextUtils.isEmpty(id)){
                    callBack.loginFailed(new Throwable("id is null"));
                    return;
                }

                User user = new User();
                user.nickName = "王卫军";
                callBack.loginSuccess(user);//model层里面回调listener
            }
        }, 2000);
    }
}
