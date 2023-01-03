package com.hyd.kotlin

/**
 * Kotlin空合并操作符
 */
fun main() {

    var name: String? = "lisi"
    name = null

    /**
     * 如果name为null，则执行冒号后面的内容
     * 否则输出name的值
     */
    println(name ?: "null执行")

    /**
     * 如果name为null，则不执行let，而执行冒号后面的内容，即输出字符串："null执行"
     * 如果name不为null，则执行类let，输出it的值
     */
    println(name?.let { it } ?: "null执行")
}