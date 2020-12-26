package com.github.charlesluxinger.basic

/**
 * @author Charles Luxinger
 * @version 1.0.0 25/12/20
 */

fun main() {
    val b1 = Book("Grande Sertão: Veredas", "João Guimarães Rosa",1956)
    val b2 = Book("Minha vida de menina","Helena Morley", 1942, "Editora A")
    val b3 = Book("Memórias Póstumas de Brás Cubas","Machado de Assis",1881)
    val b4 = Book("Iracema","José de Alencar", 1865, "Editora B")

    val books = listOf(b1, b2, b3, b4)

    books.sortedBy { it.title }
    books.sorted()

    books.filter { it.publisherYear > 1950 }

    books.groupBy { it.publisher ?: "Undefined publisher" }
         .forEach { (p, b) -> println("$p: ${join(b)}") }

}

private fun join(books: List<Book>) {
    books.joinToString("\n") { " - ${it.title} of ${it.author}" }
}

data class Book (
    val title: String,
    val author: String,
    val publisherYear: Long,
    val publisher: String? = null
): Comparable<Book> {
    override fun compareTo(other: Book): Int {
        return this.publisherYear.compareTo(other.publisherYear)
    }
}