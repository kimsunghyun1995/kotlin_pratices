package chapter1

fun main() {

    val animal = Animal()
    val cat = Cat()
    animal.sayHello()
    cat.sayHello()

    val inheritanceStudent = InheritanceStudent("1", 2)
    inheritanceStudent.introduce()

    val manager = Manager("poker")

    val inheritanceRectangle = InheritanceRectangle(1.0, 2.0)
    val circle = Circle(2.4)
    inheritanceRectangle.area()
    circle.area();

}

/**
 * 문제 1:
 * Animal이라는 기본 클래스를 만들고, 이를 상속받은 Cat 클래스를 만들어서 sayHello 메서드를 재정의하세요. Cat 클래스는 "야옹!"을 출력하고, Animal 클래스는 "동물 소리!"를 출력하도록 하세요.
 *
 * 문제 요구사항:
 *
 * Animal 클래스는 open으로 선언하고, sayHello 메서드도 open으로 선언하세요.
 *
 * Cat 클래스에서 sayHello를 override하여 "야옹!"을 출력하도록 하세요.
 */

open class Animal {
    open fun sayHello() = println("동물 소리!")
}

class Cat : Animal() {
    override fun sayHello() = println("야옹!")
}


/**
 *개념 설명:
 * 상속받을 때, 상위 클래스에 생성자가 있다면 하위 클래스에서 그 생성자를 호출해야 합니다. 코틀린에서는 상위 클래스의 생성자를 호출하는 방법을 super 키워드를 사용하여 전달합니다.
 *
 * 문제 2:
 * Person 클래스를 만들고, 이름(name)과 나이(age)를 파라미터로 받는 생성자를 정의하세요. Student 클래스를 Person 클래스로부터 상속받고, Student 클래스에서 이름과 나이를 전달하여 Person 클래스의 생성자를 호출하도록 하세요.
 *
 * 문제 요구사항:
 *
 * Person 클래스는 이름과 나이를 파라미터로 받는 생성자를 작성하고, 해당 정보를 출력하는 메서드 introduce를 작성하세요.
 *
 * Student 클래스는 Person 클래스를 상속받고, 부모 생성자를 호출하도록 하세요.
 *
 */

open class InheritancePerson (val name : String, val age : Int) {
    fun introduce() {
        println(this.name + " " + this.age)
    }
}

class InheritanceStudent(name: String, age: Int) : InheritancePerson(name, age) {
}

/**
 * 3. 상위 클래스의 메서드 오버라이딩 (Overriding Methods)
 * 개념 설명:
 * 상속받은 클래스에서 상위 클래스의 메서드를 재정의(override)하여 사용할 수 있습니다. 코틀린에서 override 키워드를 사용해 메서드를 오버라이드합니다.
 *
 * 문제 3:
 * Vehicle 클래스에서 start라는 메서드를 정의하고, 이를 상속받은 Car와 Bike 클래스를 만듭니다. 각각의 클래스에서 start 메서드를 오버라이드하여 "자동차 시동 시작!"과 "자전거 페달 시작!"을 출력하세요.
 *
 * 문제 요구사항:
 *
 * Vehicle 클래스는 open으로 정의하고, start 메서드도 open으로 정의하세요.
 *
 * Car와 Bike 클래스에서 start 메서드를 각각 오버라이드하세요.
 */

open class Vehicle() {
    open fun start() = println("자동차 시동 시작!")
}

class Bike : Vehicle() {
    override fun start() {
        println("자전거 페달 시작!")
    }
}

/**
 *
 * 4. 상위 클래스의 생성자 호출 (Calling Superclass Constructor)
 * 개념 설명:
 * 상속받은 클래스에서 상위 클래스의 생성자를 호출할 때는 super 키워드를 사용하여 상위 클래스 생성자를 호출할 수 있습니다. 파라미터를 전달하여 상위 클래스 생성자를 초기화해야 합니다.
 *
 * 문제 4:
 * Employee라는 클래스를 만들고, 이름과 부서 이름을 파라미터로 받는 생성자를 정의합니다. Manager 클래스에서 Employee 클래스를 상속받고, Manager는 부서 이름을 "관리팀"으로 고정하고 이름만 다르게 설정합니다.
 *
 * 문제 요구사항:
 *
 * Employee 클래스는 이름과 부서를 받는 생성자를 정의하고, Manager 클래스는 Employee 클래스를 상속받아 이름만 전달하도록 하세요.
 *
 * Manager 클래스는 부서 이름을 고정값으로 설정합니다.
 */

open class Employee(val name: String, val teamName: String)

}

class Manager(name : String) : Employee(name, "관리팀") {
}

/**
 * 개념 설명:
 * 다형성은 객체가 여러 형태를 가질 수 있는 특성입니다. 코틀린에서는 상속을 통해 다형성을 구현할 수 있으며, 같은 인터페이스를 구현한 여러 클래스들이 서로 다른 방식으로 동작할 수 있게 됩니다.
 *
 * 문제 5:
 * Shape라는 인터페이스를 만들고, 이를 구현한 Circle 클래스와 Rectangle 클래스를 작성하세요. Shape 인터페이스는 area()라는 메서드를 정의하고, 각 클래스에서는 해당 도형의 면적을 계산하여 출력하도록 하세요.
 *
 * 문제 요구사항:
 *
 * Shape 인터페이스는 area() 메서드를 선언하고, 이를 구현하는 Circle과 Rectangle 클래스를 작성하세요.
 *
 * main 함수에서 각 도형 객체를 생성하고, area()를 호출하여 면적을 출력하세요.
 */

interface Shape {
    fun area() : Double
}

class Circle(val radius : Double) : Shape {

    override fun area(): Double {
        return this.radius * 3.14
    }

}

class InheritanceRectangle(val height : Double, val width : Double) : Shape {

    override fun area(): Double {
        return height * width
    }
}