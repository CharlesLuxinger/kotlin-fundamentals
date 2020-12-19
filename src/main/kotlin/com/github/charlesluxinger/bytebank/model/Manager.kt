package com.github.charlesluxinger.bytebank.model

/**
 * @author Charles Luxinger
 * @version 1.0.0 18/12/20
 */
class Manager (name: String, cpf: String, salary: Double, private val password: String) :
    Employee(name, cpf, salary), Authenticable {

    override val bonus: Double = 0.1 * salary

    override fun auth(password: String): Boolean {
        return this.password == password
    }

}