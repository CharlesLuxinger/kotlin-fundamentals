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

class Movie1 {
    val name: String
    val year: Int
    val genre: String

    constructor(name: String, year: Int, genre: String) {
        this.name = name;
        this.year = year;
        this.genre = genre;
    }

}

class Movie2(val name: String, val year: Int, val genre: String) {}

class Movie3(name: String, year: Int, genre: String) {
    val name: String
    val year: Int
    val genre: String

    init {
        this.name = name;
        this.year = year;
        this.genre = genre;
    }

}

class Person {

    var name: String
        get() = "My name is $field"
        set(value) {
            field = value.takeIf { value.isEmpty() } ?: "Anonymous"
        }

    constructor(name: String) {
        this.name = name;
    }

}

class Product(val name: String, val price: Double, val discount: Double, val enabled: Boolean) {

    val disable: Boolean get() = !enabled
    val priceWithDiscount: Double get() = price * (1 - discount)
}

enum class Week1 {
    SUNDAY, MONDAY, THURSDAY, WEDNESDAY, TUESDAY, FRIDAY, SATURDAY
}

enum class Week2(val id: Int, val dayName: String, val workday: Boolean) {
    SUNDAY(1, "Sunday", false),
    MONDAY(2, "Monday", true),
    THURSDAY(3, "Thursday", true),
    WEDNESDAY(4, "Wednesday", true),
    TUESDAY(5, "Tuesday", true),
    FRIDAY(6, "Friday", true),
    SATURDAY(7, "Saturday", false)
}