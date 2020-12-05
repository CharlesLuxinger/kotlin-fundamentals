package com.github.charlesluxinger.basic

import java.util.*

/**
 * @author Charles Luxinger
 * @version 1.0.0 04/12/20
 */
fun main(args: Array<String>) {
    printSum(1, 1)

    println(sum(1, 2))
    println(sum(3))
    println(sum(1, 2, 3, 4, 5))

    println(max(1, 2))
    println(max(b = 1, a = 2))

    val (H, M, S) = now()
    println("$H:$M:$S")

    val names = listOf("Manuel", "Ana", "José")
    println(names.secondElement())

    val p1 = Product("Ipad", 123.0)
    val p2 = Product("Kindle", 100.0)
    println(p1 isExpensiveThan p2)

    println(calc(1, 2, Operations()::sum))
    println(calc(1, 2, ::sum))

    transaction {
        println("Querying SQL 1")
        println("Querying SQL 2")
        println("Querying SQL 3")
    }
}

fun printSum(a: Int, b: Int) {
    println(a + b)
}

fun sum(a: Int, b: Int = 1): Int {
    return a + b
}

fun sum(vararg numbers: Int): Int {
    var sum = 0

    for (num in numbers) {
      sum +=  num
    }

    return sum
}

fun max(a: Int, b: Int = 1): Int = if (a > b) a else b

fun now(): Hour {
    val now = Calendar.getInstance()

    with(now) {
       return Hour(get(Calendar.HOUR), get(Calendar.MINUTE), get(Calendar.SECOND))
    }
}

fun <E> List<E>.secondElement(): E? = if(this.size >= 2) this.get(1) else null

data class Hour(val hour: Int, val min: Int, val seg: Int)

infix fun Product.isExpensiveThan(product: Product): Boolean = this.price > product.price

class Product (val name: String, val price: Double)

class Operations {
    fun sum(a: Int, b: Int): Int {
        return a + b
    }
}

fun calc(a: Int, b: Int, func: (Int, Int) -> Int) : Int {
    return func(a, b)
}

inline fun transaction(func: () -> Unit) {
    println("Open Connection")
    try {
        func()
    } finally {
        println("Close Connection")
    }
}