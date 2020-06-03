package chapter02

class Rectangle(val height: Int, val width: Int) {
    val isSqaure: Boolean
        get() {
            return height == width
        }

    val isRectangle: Boolean
        get() = height != width
}

fun main() {
    val rectangle = Rectangle(5, 10)
    println(rectangle.isRectangle)
    println(rectangle.isSqaure)
}
