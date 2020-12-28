package com.github.charlesluxinger.basic

/**
 * @author Charles Luxinger
 * @version 1.0.0 27/12/20
 */

fun main() {
    val myFunc: (Int, Int) -> Int = ::calc
    val calcReturn = myFunc(1, 2)

    val myClassFunc: (Int, Int) -> Int = Calc()
    val classFuncReturn = myClassFunc(1, 2)

    val myLambdaFunc: (Int, Int) -> Int = { a, b -> a + b }
    val lambdaFuncReturn = myLambdaFunc(1, 2)

    val myLambdaFuncMultiReturns: (Int, Int) -> Int = calc@{ a, b ->
        if (a > 10) {
            return@calc a - b
        }
        return@calc a + b
    }
    val lambdaFuncMultiReturns = myLambdaFuncMultiReturns(1, 2)

    val myAnonymousFunc: (Int, Int) -> Int = fun (a, b): Int { return a + b }
    val anonymousFuncReturn = myAnonymousFunc(1, 2)

}

fun calc(a: Int, b: Int): Int = a + b

class Calc : (Int, Int) -> Int {
    override fun invoke(a: Int, b: Int): Int = a + b
}