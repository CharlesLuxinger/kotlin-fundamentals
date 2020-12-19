package com.github.charlesluxinger.bytebank.model

/**
 * @author Charles Luxinger
 * @version 1.0.0 17/12/20
 */
class CurrentAccount(ownerName: String, number: Int, balance: Double = 0.0) :
    Account(ownerName, number, balance) {

    override fun withdraw(value: Double): Boolean {
        return super.withdraw(value + 0.1)
    }
}