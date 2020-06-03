package chapter02

fun main(args: Array<String>) {
    val name = if (args.size > 0) args[0] else "Kotlin"
    println("Hello, $name!")

    val age = 42
    println("I'm ${age - 15} years old.")

    println("Hello, ${if (args.size > 0) args[0] else "someone"}!")
}