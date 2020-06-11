fun main() {
    val set = hashSetOf(1, 7, 53)
    val list = arrayListOf(1, 7, 53)
    var map = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty-three")

    println(set.javaClass)
    println(list.javaClass)
    println(map.javaClass)

    val strings = listOf("first", "second", "third")
    println(strings.last())

    val numbers = setOf(1, 14, 2)
    println(numbers.max())

    // Collection API Extension
    val stringList: List<String> = listOf("first", "second", "fourteenth")
    println(stringList.last())

    val numberSet: Collection<Int> = setOf(1, 14, 2)
    println(numberSet.max())
}