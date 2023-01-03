package com.hyd.kotlin

/**
 * Kotlin函数引用
 */
fun main() {
    /**
     * ::response17 为引用调用函数response17
     */
    login17("zhangsan", "123", ::response17)
}

const val USERNAME17 = "zhangsan"
const val PASSWORD17 = "123"
fun login17(username: String, password: String, response: (Int, String) -> Unit) {

    if (username == USERNAME17 && password == PASSWORD17) {
        response(200, "登录成功！")
    } else {
        response(500, "登录失败！")
    }
}

fun response17(code: Int, msg: String) {
    println("【登录结果】code:$code mas:$msg")
}