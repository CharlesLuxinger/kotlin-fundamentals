package com.github.charlesluxinger.basic

/**
 * @author Charles Luxinger
 * @version 1.0.0 04/12/20
 */
fun main(args: Array<String>) {
    val opcional: String? = null
    val required: String = opcional ?: "something"

    println(required)
}