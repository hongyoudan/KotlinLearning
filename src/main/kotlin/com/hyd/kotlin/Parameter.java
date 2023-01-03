package com.hyd.kotlin;

import java.util.Objects;

/**
 * 对应 16-Parameter.kt
 */
public class Parameter {

    public void main() {
        login("zhangsan", "123", new Response() {
            @Override
            public void result(int code, String msg) {
                System.out.printf("【登录结果】code:%d msg:%s%n", code, msg);

            }
        });
    }

    public static final String USERNAME = "zhangsan";
    public static final String PASSWORD = "123";

    private static boolean server(String username, String password) {

        // do something...

        return Objects.equals(username, USERNAME) && Objects.equals(password, PASSWORD);
    }

    public static void login(String username, String password, Response response) {

        if (username == null || password == null) {
            System.out.println("请输入用户名或密码");
        }

        // do something...

        if (server(username, password)) {
            // do something...
            response.result(200, "登录成功！");
        } else {
            response.result(500, "登录失败！");
        }
    }
}

interface Response {
    void result(int code, String msg);
}
