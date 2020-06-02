fun max(a: Int, b: Int): Int {
    // Kotlin에서는 if가 expression, 즉 값을 만들어 낸다.
    // Java에서는 statement이다. 값을 만들어 낼 수 없다.
    return if (a > b) a else b
}

fun simplifiedMax(a: Int, b: Int): Int = if (a > b) a else b

// Type Inference
// 본문이 expression인 경우
fun moreSimplifiedMax(a: Int, b: Int) = if (a > b) a else b

fun main(args: Array<String>) {
    println(max(1, 2))
    println(simplifiedMax(1, 2))
    println(moreSimplifiedMax(1, 2))
}