package com.hyd.kotlin

/**
 * Kotlin函数
 */
fun main() {
    fun01("zhangsan", "123")
    fun02("zhangsan", "123")
    fun02("zhangsan", "123", 18)
    // 传参时可以随意调换参数位置，但要写上参数名
    fun02(password = "123", age = 18, username = "zhangsan")
}

// Kotlin的方法默认为public
private fun fun01(username: String, password: String): String {
    println("用户名：$username，密码：$password")
    return "OK"
}

// 这里的age赋默认值20，那么在函数调用时可以写也可以不写
private fun fun02(username: String, password: String, age: Int = 20): String {
    println("用户名：$username，密码：$password，年龄：$age")
    return "OK"
}
