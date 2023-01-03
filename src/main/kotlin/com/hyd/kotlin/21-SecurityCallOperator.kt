package com.hyd.kotlin

/**
 * Kotlin安全调用操作符
 */
fun main() {

    var name: String? = "lisi"
    name = null

    /**
     * 加上问号表示：
     * 如果name为空，则不调用capitalize()方法
     * 如果name不为空，则调用capitalize()方法
     */
    // capitalize()方法的作用是将字符串的首个字母转换为大写
    println(name?.capitalize())
}