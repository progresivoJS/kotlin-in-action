package chapter02

import kotlin.IllegalArgumentException

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun eval(e: Expr): Int {
    if (e is Num) {
        // as Num은 불필요
        val n = e as Num
        return n.value
    }

    // Smart Cast
    // is에서 check하면서 cast까지 완료한다.
    if (e is Sum) {
        return eval(e.right) + eval(e.left)
    }
    throw IllegalArgumentException("Unknown expression")
}

fun evalWithIf(e: Expr): Int =
        if (e is Num)
            e.value
        else if (e is Sum)
            evalWithIf(e.right) + evalWithIf(e.left)
        else throw IllegalArgumentException("Unknown expression")


fun evalWithWhen(e: Expr): Int =
        when (e) {
            is Num -> e.value
            is Sum -> evalWithWhen(e.left) + evalWithWhen(e.right)
            else -> throw IllegalArgumentException("Unknown expression")
        }

fun evalWithLogging(e: Expr): Int =
        when (e) {
            is Num -> {
                println("num: ${e.value}")
                e.value
            }
            is Sum -> {
                val left = evalWithLogging(e.left)
                val right = evalWithLogging(e.right)
                println("sum: $left + $right")
                left + right
            }
            else -> throw IllegalArgumentException("Unknown expression")
        }



fun main() {
    val expr = Sum(Sum(Num(1), Num(2)), Num(4))
    println(eval(expr))
    println(evalWithIf(expr))
    println(evalWithWhen(expr))
    println(evalWithLogging(expr))
}