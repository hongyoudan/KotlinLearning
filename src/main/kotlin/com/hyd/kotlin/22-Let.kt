package com.hyd.kotlin

/**
 * Kotlin使用let安全调用
 */
fun main() {

    var str: String? = "hello"
    str = null
    str = ""

    /**
     * 如果str为空，则不会执行let，即返回null
     * 如果str不为空，则判断it是否为空字符串""，如果是，则返回字符"BLANK"，否则返回it
     */
    val res = str?.let {
        // 此时即代表 it == name
        it.ifBlank {
            "BLANK"
        }
    }
    println(res)
}