// kotlin에서는 java와 달리 디렉토리 구조와 패키지 구조가 일치할 필요가 없다.
// 그러나 자바와의 호환성을 위해서는 일치시키는 것이 좋다.
// 또한 class의 name과 file명이 일치할 필요도 없다.
// 여러 class가 하나의 파일 안에 들어갈 수 있다.
package chapter02.geometry.shapes

import kotlin.random.Random

class Rectangle(val width: Int, val height: Int) {
    val isSquare: Boolean
        get() = width == height
    val isRectangle: Boolean
        get() = width != height
}

fun createRandomRectangle(): Rectangle {
    return Rectangle(Random.nextInt(), Random.nextInt())
}