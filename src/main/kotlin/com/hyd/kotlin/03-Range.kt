package com.hyd.kotlin

/**
 * Kotlin range表达式
 */
fun main() {
    var score = 70

    if (score in 0..60) {
        println("D")
    } else if (score in 61..89) {
        println("C")
    } else if (score in 90..100) {
        println("A")
    } else if (score !in 0..100) {
        println("ERROR")
    }
}