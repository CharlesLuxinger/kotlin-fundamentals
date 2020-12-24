package com.github.charlesluxinger.basic

import java.lang.NumberFormatException
import java.lang.RuntimeException

/**
 * @author Charles Luxinger
 * @version 1.0.0 24/12/20
 */

val value: Double? = try {"0.0".toDouble()} catch (ex: NumberFormatException) {null}

class CustomException(message: String) : RuntimeException(message)