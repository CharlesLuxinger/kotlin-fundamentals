package com.github.charlesluxinger.basic

/**
 * Class comments go here...
 *
 * @author Charles Luxinger
 * @version 1.0.0 28/12/20
 */
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