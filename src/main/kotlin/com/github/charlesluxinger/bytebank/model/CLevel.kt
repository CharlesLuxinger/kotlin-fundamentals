package com.github.charlesluxinger.bytebank.model

/**
 * @author Charles Luxinger
 * @version 1.0.0 18/12/20
 */
class CLevel(name: String, cpf: String, salary: Double, private val password: String, extra: Double) :
    Employee(name, cpf, salary), Authenticable {

    override val bonus: Double = (0.1 * salary) + extra

    override fun auth(password: String): Boolean {
        return this.password == password
    }

}