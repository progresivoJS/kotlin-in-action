package chapter02

import java.util.*

val binaryReps = TreeMap<Char, String>()

fun main() {
    for (c in 'A'..'F') {
        val binary = Integer.toBinaryString(c.toInt())
        // don't need put method
        binaryReps[c] = binary
    }

    for ((letter, binary) in binaryReps) {
        println("$letter = $binary")
    }

    val list = arrayListOf("10", "11", "1001")
    for ((index, element) in list.withIndex()) {
        println("$index: $element")
    }
}