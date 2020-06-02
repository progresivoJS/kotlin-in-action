import kotlin.random.Random

fun main() {
    val question = "삶, 우주, 그리고 모든 것에 대한 궁극적인 질문"
    val answer = 42
    val explicitAnswer: Int = 42
    val yearsToCompute = 7.5e6


    // 값을 지정하지 않고 선언만 할 때 Type을 명시하지 않으면 추론이 불가능하다.
    val x: Int
    x = 42

    // val & var
    // 기본적으로 val을 사용
    val immutableVariable = 42
    var mutableVariable = 42
}

// val은 오직 한번만 initialize 가능
fun initializeImmutableVariable() {
    val message: String
    if (Random(0).nextBoolean()) {
        message = "True"
    } else {
        message = "False"
    }
}

// 참조가 불변이라는 것이지, 참조가 가르키는 객체의 내부까지 불변이라는 것은 아니다.
fun immutableVariableWithDataStructure() {
    val languages = arrayListOf("Java")
    languages.add("Kotlin")
}

// var일지라도 type을 바꾸는 방식은 불가능.
fun typeChangeInMutableVariable() {
    var answer = 42
//    answer = "No Answer"
}

