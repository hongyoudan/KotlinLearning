package com.hyd.kotlin

/**
 * Kotlin函数参数
 */
fun main() {

    /**
     * func 函数名
     * (Int, Int) 有两参数（形参），类型都为Int
     * -> String 返回值类型为String
     * num1, num2 参数名
     */
    // 定义一个函数，返回值类型为String
    val func: (Int, Int) -> String = { num1, num2 ->
        "$num1+$num2"
    }

    // 调用该函数
    println(func(1, 2))
}