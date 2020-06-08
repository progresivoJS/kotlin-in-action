package strings

fun joinToString() {

}

fun String.lastChar(): Char = this.get(this.length - 1)
fun String.lastCharWithoutThis(): Char = get(length - 1)

fun main() {
    println("Kotlin".lastChar())
    println("Kotlin".lastCharWithoutThis())
}