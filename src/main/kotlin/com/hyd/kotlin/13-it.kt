package com.hyd.kotlin

/**
 * Kotlin it关键字的特点
 */
fun main() {

    val func01: (Int, Int, Int) -> String = { i1, i2, i3 ->
        "$i1+$i2+$i3"
    }
    println(func01(1, 2, 3))
    // 调用方式等价于 invoke()
    println(func01.invoke(1, 2, 3))

    /**
     * 当方法形参为一个时，默认携带参数名为it的参数
     * 多个形参则不携带it
     */
    val func02: (Double) -> String = {
        "$it"
    }
    println(func02(2022.222))
}