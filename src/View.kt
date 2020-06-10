open class View {
    open fun click() = println("View Clicked")
}

class Button: View() {
    override fun click() = println("Button Clicked")
}

fun View.showOff() = println("I'm a view!")
fun Button.showOff() = println("I'm a button!")

fun main() {
    val view: View = Button()
    view.click()

    // 확장함수는 오버라이드가 되지 않는다. 클래스 외부에서 선언되기 때문이다.
    view.showOff()
}