package com.hyd.kotlin

/**
 * Kotlin的String模板
 */
fun main() {

    val garden = "黄石公园"
    val time = 6
    println("今天去${garden}，玩了${time}小时")
    // 如果变量后面没有中文（标点符号不算），则可以省略大括号
    println("今天去$garden")
    println("今天去$garden，玩了${time}小时")

    // 在kotlin中，if是表达式，在Java中if是语句
    // 注意空格
    val isLogin = true
    println("${if (isLogin) "已登录" else "未登录"}")
    // 可以转换成：
    println(if (isLogin) "已登录" else "未登录")
}