package com.github.charlesluxinger.bytebank.model

/**
 * @author Charles Luxinger
 * @version 1.0.0 17/12/20
 */
class SavingAccount(consumer: Consumer, number: Int, balance: Double = 0.0) :
    Account(consumer, number, balance) {}