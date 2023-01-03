package com.hyd.kotlin

/**
 * Kotlin函数类型自动推断
 */
fun main() {

    /**
     * 形参列表可以写在里面，但要带上形参类型
     * 不用指定返回值类型，Kotlin会自动推断
     */
    // 返回String类型
    val func01 = { n1: Double, n2: Float, n3: Int ->
        "$n1 $n2 $n3"
    }
    println(func01(1.1, 22.2F, 3333))

    val func02 = { m1: Int ->
        m1
    }
    println(func02(2))

    /**
     * 不写返回值，默认为Unit
     */
    val func03 = {
        21231F
    }
    println(func03())
}