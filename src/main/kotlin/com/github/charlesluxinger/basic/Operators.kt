package com.github.charlesluxinger.basic

/**
 * @author Charles Luxinger
 * @version 1.0.0 05/12/20
 */

fun main(args: Array<String>) {
    var a = 2
    var b = 100
    var c = 10

    b += a
    b -= a
    b *= a
    b /= a
    b %= a

    val (model, year) = Car("Gol", 1999)
    println(model)
    println(year)

    val (man, woman) = listOf("José", "Maria", "Carlos")
    println(man)
    println(woman)

    val (_, _, sun) = listOf("José", "Maria", "Carlos")
    println(sun)

    println("Fruit" === "Fruit")
    println("Fruit" == "Fruit")

    if (a == 2 xor c.compareTo(0)) {
        println("some number is different")
    }
}

data class Car(val model: String, val year: Int)