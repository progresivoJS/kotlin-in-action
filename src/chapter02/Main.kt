package chapter02

// We don't need static keyword for importing method
import chapter02.geometry.shapes.createRandomRectangle

fun main(args: Array<String>) {
    println(createRandomRectangle().isSquare)
}