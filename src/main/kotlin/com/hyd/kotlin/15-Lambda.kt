package com.hyd.kotlin

/**
 * Kotlin Lambda表达式
 */
fun main() {

    /**
     * 大括号内相当于匿名函数
     */
    val func01 = { num1: Int, num2: Int ->
        "相加结果为：${num1 + num2}"
    }
    println(func01(1, 2))

    /**
     * 该函数返回值类型有String和Int
     * 那么Kotlin会将返回值类型统一为Any
     * 相当于Java的Object
     */
    val func02 = { value: Int ->
        when (value) {
            1 -> "周一"
            2 -> "周二"
            else -> -1
        }
    }
    println(func02(3))
}