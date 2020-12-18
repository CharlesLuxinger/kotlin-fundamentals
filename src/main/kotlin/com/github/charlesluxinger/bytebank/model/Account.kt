package com.github.charlesluxinger.bytebank.model

/**
 * @author Charles Luxinger
 * @version 1.0.0 17/12/20
 */
class Account(val ownerName: String, val number: Int, balance: Double = 0.0) {
    var balance = balance
        private set

    fun deposit(value: Double): Boolean {
        this.balance += value
        return true
    }

    fun withdraw(value: Double): Boolean {
        if (balance >= value) {
            this.balance -= value
            return true
        }
        return false
    }

    fun transfer(value: Double, target: Account): Boolean {
        if (withdraw(value)) {
            return target.deposit(value)
        }
        return false
    }
}