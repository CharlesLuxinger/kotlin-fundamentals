package com.github.charlesluxinger.basic

/**
 * @author Charles Luxinger
 * @version 1.0.0 04/12/20
 */
fun main(args: Array<String>) {
    val approved = listOf("Manuel", "Ana", "Maria")
    println("The first name is: ${approved[0]}.")

    val blocked = true;
    println("Did the user do something wrong? ${if (blocked) "bad user" else "good guy"}.")
}