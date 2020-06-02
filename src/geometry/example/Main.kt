package geometry.example

// We don't need static keyword for importing method
import geometry.shapes.createRandomRectangle

fun main(args: Array<String>) {
    println(createRandomRectangle().isSquare)
}