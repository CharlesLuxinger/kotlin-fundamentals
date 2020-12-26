package com.github.charlesluxinger.basic

/**
 * @author Charles Luxinger
 * @version 1.0.0 25/12/20
 */

fun main() {
    val ages = intArrayOf(10, 11, 12, 13)
    var maxAge = Int.MIN_VALUE;
    ages.forEach { age -> maxAge = if (age > maxAge) age else maxAge }

    ages.maxOrNull()
    ages.minOrNull()
    ages.average()

    val all: Boolean = ages.all { it >= 12 }
    val any: Boolean = ages.any { it >= 12 }
    val filtered: List<Int> = ages.filter { it >= 12 }
    val found: Int? = ages.find { it >= 12 }
    val total: Int = ages.sum()
    val totalReduce: Int = ages.reduce {acc, value -> acc + value }
    val totalFold: Int = ages.fold(total) {acc, value -> acc + value * 6 }

    val average = ages.sortedDescending().take(3).average()


    val salaries = doubleArrayOf(10.0, 11.0, 12.0, 13.0)

    val bonus = 1.1

    for ((i, salary) in salaries.withIndex()) {
        salaries[i] = salary * bonus
    }
    salaries.forEachIndexed { i, salary ->
        salaries[i] = salary * bonus
    }

}
