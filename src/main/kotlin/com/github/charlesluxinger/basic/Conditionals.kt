package com.github.charlesluxinger.basic

/**
 * @author Charles Luxinger
 * @version 1.0.0 04/12/20
 */
fun main(args: Array<String>) {
    val value = 6.3
    val value2 = 7.3
    val people = arrayListOf("Manuel", "Carla", "José")

    if (value >= 7.0) {
        println("Greater than equal seven.")
    } else {
        println("Less than equal seven.")
    }

    if (value >= 7.0) println("Greater than equal seven.") else println("Less than equal seven.")

    val maxValue = if (value > value2) value else value2

    if (value in 0.0..6.0) {
        println("Between 0 and 6.")
    } else if (value in 6.1..8.0){
        println("Between 6.1 and 8.")
    } else {
        println("Greater than eight.")
    }

    when (value) {
        in 0.0..6.0 -> {
            println("Between 0 and 6.")
        }
        in 6.1..8.0 -> {
            println("Between 6.1 and 8.")
        }
        else -> {
            println("Greater than eight.")
        }
    }

    while (value >= 7.0) {
        value.inc()
    }

    do {
        value.inc()
    } while (value >= 7.0)

    for (i in 1..10){
        println(i)
    }

    for (i in 10 downTo 1){
        println(i)
    }

    for (i in 1..10 step 5){
        println(i)
    }

    for ((index, person) in people.withIndex()) {
        println("${index}# - $person")
    }
}