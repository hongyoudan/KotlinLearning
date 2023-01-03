package com.hyd.kotlin

/**
 * Kotlin异常处理
 */
fun main() {

    try {
        var info: String? = null
        // 自定义异常校验方法
        checkException(info)
        println(info!!.length)
    } catch (e: Exception) {
        println("Exception：$e")
    }
}

/**
 * 如果info为null，则执行冒号后面的代码，即抛出自定义异常类
 * 否则返回info
 */
fun checkException(info: String?) {
    info ?: throw MyException()
}

/**
 * 自定义异常类
 */
class MyException : IllegalArgumentException("抛出异常")