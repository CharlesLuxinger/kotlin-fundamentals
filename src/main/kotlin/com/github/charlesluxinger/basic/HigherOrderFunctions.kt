package com.github.charlesluxinger.basic

/**
 * @author Charles Luxinger
 * @version 1.0.0 27/12/20
 */

fun main() {
    val b1 = Book("Grande Sertão: Veredas", "João Guimarães Rosa",1956)
    val bookToUpperCase1 = " - ${b1.title} of ${b1.author}".toUpperCase()

    val bookToUpperCase2 = Book("Grande Sertão: Veredas", "João Guimarães Rosa", 1956)
        .let { book -> " - ${book.title} of ${book.author}".toUpperCase() }

    calculator(1, 2) { println(it) }
}

fun calculator(a: Int, b: Int, result: (Int) -> Unit) {
    result(a + b)
}