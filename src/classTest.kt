class Student(val id: Int, var grade: String)

class Rectangle(val width: Double, val height: Double) {
    fun area(): Double = width * height
}

class BankAccount(var initialBalance: Double) {
    var balance: Double = initialBalance
        private set
    // balance의 setter를 private으로 설정하여 외부에서 직접 수정할 수 없도록 함
    fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
        }
    }

    fun withdraw(amount: Double) {
        if (amount > 0 && amount <= balance) {
            balance -= amount
        }
    }
}

fun main() {
    val student = Student(1, "A")
    student.grade = "A+"
    println(student.grade) // A+

    val rectangle = Rectangle(3.5, 2.0)
    println(rectangle.area()) // 7.0


}


