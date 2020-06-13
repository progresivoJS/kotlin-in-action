val map = mapOf(1 to "one", 7 to "seven", 53 to "fifty-three")

infix fun Any.to(other: Any) = Pair(this, other)
infix fun Any.colabo(other: Any) = Pair(this, other)

fun main() {
    val (number, name) = 1 to "Other"
    val (x, y) = 1 colabo "dd"
    println("$x $y")
}