package com.hyd.kotlin

/**
 * Kotlin函数类型和隐式返回
 */
fun main() {

    /**
     * 定义一个函数
     *
     *      函数名     输入参数     输出类型
     * val  func   :   ()     ->  String
     */
    // 1. 定义一个函数
    val func: () -> String

    /**
     * 不用写return，最后一行作为返回值（隐式返回）
     * 注意此时函数定义的是返回String类型
     */
    // 2. 实现函数
    func = {
        val str = "world"
        "hello $str"
    }

    // 3. 调用函数
    println(func())

}