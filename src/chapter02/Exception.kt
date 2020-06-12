package chapter02

import java.io.BufferedReader
import java.io.StringReader

fun readNumber(reader: BufferedReader): Int? {
    try {
        val line = reader.readLine()
        return Integer.parseInt(line)
    } catch (e: NumberFormatException) {
        return null
    } finally {
        reader.close()
    }
}

fun readNumberWithoutFinally(reader: BufferedReader) {
    val number = try {
        Integer.parseInt(reader.readLine())
    } catch (e: NumberFormatException) {
        return
    }

    // print nothing if NumberFormatException occurs.
    println(number)
}

fun readNumberWithoutFinally2(reader: BufferedReader) {
    val number = try{
        Integer.parseInt(reader.readLine())
    } catch (e: NumberFormatException) {
        null
    }
    println(number)
}

fun main() {
    val number = 0
    val percentage =
            if (number in 0..100)
                number
            else
            // throw is an expression
                throw IllegalArgumentException("A percentage value must be between 0 and 100: $number")

    readNumberWithoutFinally(BufferedReader(StringReader("not a number")))
    readNumberWithoutFinally2(BufferedReader(StringReader("not a number")))
}