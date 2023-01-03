package com.hyd.kotlin

/**
 * Kotlin匿名函数
 */
fun main() {

    // count() 输出字符个数
    val count = "hayden".count()
    println(count)

    // 使用匿名函数，将字符串"hayden"拆分成单个字符，并赋值给it，返回it等于a的个数
    val count2 = "hayden".count {
        it == 'a'
    }
    println(count2)
}