package com.example.android.architecture.blueprints.todoapp;

import org.junit.Test;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
//        assertEquals(4, 2 + 2);
        String app = "今日头条-xxx";
        String arr[] = app.split("-");
        System.out.print(arr.length);
        if (arr.length > 0) {
            System.out.print(arr[0]);
        }
    }
}