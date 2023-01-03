package com.hyd.kotlin

/**
 * Kotlin变量声明
 */
fun main() {

    /**
     * 变量修饰符    变量名   变量类型   变量值
     *    var       name1 : String = "zhangsan"
     */
    var name1: String = "zhangsan"

    // Kotlin可以自动判断数据类型，因此String可以省略
    var name2 = "lisi"

    /**
     * var修饰的变量可读可改
     * val修饰的变量只读，不可以修改
     */
    var age = 18
    age = 28
    println(age)
    val age1 = 18
    // val修饰的age1变量修改会报错
//    age1=20
}