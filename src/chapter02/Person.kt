package chapter02

class Person(
        // private field, public getter
        val name: String,

        // private field, public getter/setter
        // getter: isMarried
        // setter: setMarried (예외 - is*)
        var isMarried: Boolean
)

fun main() {
    val js = Person("progresivojs", false)

    // this statement actually calls getter
    // js.getName()
    println(js.name)

    // this statement actually calls setter
    // js.setMarried(true)
    js.isMarried = true
}