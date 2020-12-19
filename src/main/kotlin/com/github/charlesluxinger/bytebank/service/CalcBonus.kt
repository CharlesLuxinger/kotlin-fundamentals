package com.github.charlesluxinger.bytebank.service

import com.github.charlesluxinger.bytebank.model.Employee

/**
 * @author Charles Luxinger
 * @version 1.0.0 18/12/20
 */
class CalcBonus {

    var bonusAmount: Double = 0.0
        private set

    fun registry(employee: Employee) {
        this.bonusAmount += employee.bonus
    }
}