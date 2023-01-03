package com.hyd.kotlin

/**
 * Kotlin Nothing特点
 */
fun main() {
    getLever(-1)
}

fun getLever(score: Int) {
    when (score) {
        // 注意TODO()不是备注，相当于满足条件抛出异常，并终止程序运行
        -1 -> TODO("ERROR")
        in 0..59 -> println("及格")
        in 60..89 -> println("良好")
        in 90..100 -> println("优秀")
    }
}

