package com.github.charlesluxinger.basic

/**
 * @author Charles Luxinger
 * @version 1.0.0 04/12/20
 */
fun main(args: Array<String>) {
    printSum(1, 1)

    println(sum(1, 2))
    println(sum(3))
}

fun printSum(a: Int, b: Int) {
    println(a + b)
}

fun sum(a: Int, b: Int = 1): Int {
    return a + b
}