package com.hyd.kotlin

/**
 * Kotlin函数中的参数为函数
 */
fun main() {

    /**
     * 在调用带有函数的参数的方法时要获取返回值，否则报错
     */
    login("zhangsan", "123") { code: Int, msg: String ->
        println("【登录结果】code:$code msg:$msg")
    }
}


/**
 * 这里模拟登录场景
 * 此方法为服务器端
 * 当传入username和password符合条件（定义的常量值）即返回成功，否则失败
 */
const val USERNAME = "zhangsan"
const val PASSWORD = "123"
private fun server(username: String, password: String): Boolean {

    // do something...

    // 也可以写成 return if(username == USERNAME && password == PASSWORD) true else false
    return username == USERNAME && password == PASSWORD
}

/**
 * 此方法为模拟前端
 * 作调用此方法时传过来的参数username和password的简单校验
 *
 * 这里的 response: (Int, String) -> Unit 为函数式的参数，意为响应信息
 */
fun login(username: String, password: String, response: (Int, String) -> Unit) {

    if (username == null || password == null) {
        TODO("请输入用户名或密码")
    }

    // do something...

    if (server(username, password)) {
        // do something...
        response(200, "登录成功！")
    } else {
        response(500, "登录失败！")
    }
}