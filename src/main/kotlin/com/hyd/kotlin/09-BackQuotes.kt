package com.hyd.kotlin

/**
 * Kotlin反引号用法
 */
fun main() {
    `我是一个函数，用来测试登录方法`("lisi", "123")
    fun02()
}

// 第一种用法可以用来作为方法名称
private fun `我是一个函数，用来测试登录方法`(username: String, password: String) {
    println("$username $password")
}

// 这里调用了Java类JavaBackQuotes的in()和is()方法，必须用反引号括起来，因为in和is在Kotlin中是关键字
private fun fun02() {
    BackQuotes.`is`()
    BackQuotes.`in`()
}