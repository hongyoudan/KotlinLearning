package com.hyd.kotlin

/**
 * Kotlin断言
 */
fun main() {

    var str: String? = null

    /**
     * 加上 !! 即表示不管str是否为空，都会执行capitalize()方法
     * 此时会抛出空指针异常
     */
    val res = str!!.capitalize()
}