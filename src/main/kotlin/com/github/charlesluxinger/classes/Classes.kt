package com.github.charlesluxinger.classes

import java.time.Month

/**
 * @author Charles Luxinger
 * @version 1.0.0 07/12/20
 */
class Consumer(var name: String)

class Seller (val name: String)

class Store (name: String) {
    val name = name;
}

class Date(var year: Int, var month: Month, var day: Int) {
    fun format(): String {
        return "$day/$month/$year"
    }
}

class Calculator {
    private var result: Int = 0;

    fun sum(vararg values: Int): Calculator {
        values.forEach { result += it }
        return this
    }

    fun multiply(vararg values: Int): Calculator {
        values.forEach { result *= it }
        return this
    }

    fun clean(): Calculator {
        result = 0
        return this
    }

    fun print(): Calculator {
        println(result)
        return this
    }

    fun getResult(): Int {
        return result
    }

}

var objectConstant = "Text"

fun topLevel() {
    val local = "Local 1 text"
    println("$objectConstant $local")
}
class Something {
    var instanceVariable = "Some text!"

    companion object {
        @JvmStatic val constantClass = "Another text!"
    }

    fun doSomething() {
        val local = "Local 2 text"
        println("$constantClass $objectConstant $local $instanceVariable")
    }
}