fun main() {

    val box = Box("Hello")
    val box1 = Box(1L)

    box.setValue("World")
    box1.setValue(2L)

}

/**
 * 문제 1: 제네릭 클래스 정의하기
 * 설명: Box라는 제네릭 클래스를 작성하여, 내부에 값을 저장할 수 있도록 만드세요. 이때 Box는 어떤 타입이든 저장할 수 있습니다.
 */

class Box<T>(private var value: T) {
    fun getValue(): T = value
    fun setValue(value: T) {
        this.value = value
        println(value)
    }
}

/**
 * 문제 2: 제네릭 함수 작성하기
 * 설명: 특정 타입에 관계없이 두 값을 비교하는 compare 함수를 작성하세요. 이 함수는 두 값이 같은지 비교할 수 있어야 합니다.
 */
fun <T : Comparable<T>> compare(a: T, b : T): Boolean {
    return a == b
}

/**
 * 문제 3: 제네릭과 타입 추론 사용하기
 * 설명: 제네릭 함수에서 타입을 명시적으로 지정하지 않고, 컴파일러가 자동으로 타입을 추론하도록 해보세요. mutableStackOf라는 유틸리티 함수를 사용하여 Double 타입의 스택을 만들어보세요.
 */

fun <E> mutableStackOf(vararg elements: E) = MutableStack(*elements)

/**
 * 문제 4: 제네릭 클래스 확장하기
 * 설명: MutableStack 클래스를 확장하여 peek 함수가 비어있는 스택을 호출했을 때 NoSuchElementException을 던지도록 만들어보세요.
 */
class MutableStack<E>(vararg items: E) {
    private val elements = items.toMutableList()

    fun push(element: E) = elements.add(element)
    fun pop(): E = elements.removeAt(elements.size - 1)
    fun peek(): E {
        if (elements.isEmpty()) throw NoSuchElementException("Stack is empty")
        return elements.last()
    }
    fun isEmpty() = elements.isEmpty()
}

/**
 * 문제 5: 제네릭 타입 제한하기
 * 설명: 제네릭 타입 파라미터에 Comparable 인터페이스를 제한을 두어, compareTo 함수를 사용할 수 있도록 만들고, 두 값을 비교하는 코드를 작성해보세요.
 */

fun <T : Comparable<T>> findMax(a : T , b : T) : T{
    return if (a > b) a else b
}