package com.github.charlesluxinger.bytebank.model

/**
 * @author Charles Luxinger
 * @version 1.0.0 18/12/20
 */
interface Authenticable {

    fun auth(password: String): Boolean

}