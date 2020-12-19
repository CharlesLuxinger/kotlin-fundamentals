package com.github.charlesluxinger.bytebank.model

/**
 * @author Charles Luxinger
 * @version 1.0.0 18/12/20
 */
abstract class Employee(val name: String, val cpf: String, val salary: Double = 0.0) {

    abstract val bonus: Double

}