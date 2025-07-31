package chapter1

// 실습 1
fun greet (name: String, greeting: String = "Hello") = "$greeting, $name!"

// 실습 2
class Person(val name: String) {
    val likes = mutableListOf<Person>()
    infix fun likes(other: Person) = likes.add(other)

    fun printLikes() {
        likes.forEach { println(it) }
    }
}

fun main() {
    val john = Person("John")
    val mary = Person("Mary")

    john likes mary  // John은 Mary를 좋아함
    john.printLikes()  // John이 좋아하는 사람들 출력

    // 실습 3
    fun sumNumbers(vararg numbers: Int) = numbers.forEach { println(it) }
}


