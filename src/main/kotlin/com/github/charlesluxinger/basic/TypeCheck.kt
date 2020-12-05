package com.github.charlesluxinger.basic

/**
 * @author Charles Luxinger
 * @version 1.0.0 04/12/20
 */
fun main(args: Array<String>) {
    val value = "Abc"

    if (value is String) {
        println("Is a string")
    } else if (value !is String) {
        println("Is not a string")
    }

    beSmart("abc")
    beSmart(1)
    beSmart(1F)

    result(8)
    result("9".toInt())
}

fun beSmart(x: Any) {
    when (x) {
        is String -> println(x.toUpperCase())
        is Int -> println(x.inc())
        else -> println("Is nothing")
    }
}

fun result(x: Any) {
    when (x as Int) {
        10, 9 -> println("A")
        8, 7 -> println("B")
        6, 5 -> println("C")
        in 4 downTo 0 -> println("D")
        else -> println("Invalid value")
    }
}