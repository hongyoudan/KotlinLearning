package com.hyd.kotlin

/**
 * Kotlin函数中返回匿名函数
 */
fun main() {

    /**
     * 调用func01得到返回值anonymousFunc
     */
    val anonymousFunc = func01("hello")

    /**
     * 调用匿名函数anonymousFunc
     */
    println(anonymousFunc("lisi", 18))
}

/**
 * func01返回一个匿名函数
 *
 * 匿名函数的形参     匿名函数的返回值类型
 * (String, Int) -> String {
 */
fun func01(info: String): (String, Int) -> String {
    println("【info】$info")

    // 返回一个匿名函数
    return { name: String, age: Int ->
        "这是匿名函数【name】$name【age】$age"
    }
}