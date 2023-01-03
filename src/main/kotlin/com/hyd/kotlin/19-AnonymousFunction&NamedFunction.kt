package com.hyd.kotlin

/**
 * Kotlin匿名函数与具名函数
 */
fun main() {

    /**
     * 大括号内即为匿名函数体
     */
    showInfo("lisi", "男", 18) {
        println(it)
    }

    /**
     * 具名函数写法
     */
    showInfo("lisi", "男", 18, ::namedFunc)
}

fun namedFunc(res: String) {
    println(res)
}

inline fun showInfo(name: String, gender: String, age: Int, result: (String) -> Unit) {
    val str = "name:$name gender:$gender age:$age"
    result(str)
}