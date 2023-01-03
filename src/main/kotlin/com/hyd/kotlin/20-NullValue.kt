package com.hyd.kotlin

/**
 * Kotlin可以为空值
 */
fun main() {

    /**
     * 定义一个变量name并赋初始值
     * 如果将name赋值为null，则会报错
     */
    var name = "hello"
    // name=null

    /**
     * 值可空变量的定义方式：
     * 变量在定义时加入问号? 可赋值为null
     * 加上问号时变量要指定类型
     */
    var str: String? = "lisi"
    str = "world"
    str = null
}