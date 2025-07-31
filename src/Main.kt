fun main() {
    // 문제 1
    val userId = "12345"
    val userName : String = "홍길동"
    var loginState : Boolean = true

    // 문제 2
    val profileImageUrl : String? = null
    val userEmail : String = "user@example.com"

    // 문제 3
    val MAX_RETRY_COUNT = 3
    var userToken : String? = null
    var isConnected : Boolean = false

    printUserInfo(userName, userEmail, 30)
}

fun findMax(a: Int, b: Int): Int {
    return if( a > b) {
        a
    } else {
        b
    }
}

fun describeNumber(num: Int): String {
    when (num) {
        0 -> return "Zero"
        // 양수인 경우
        in 1..Int.MAX_VALUE -> return "Positive"
        in Int.MIN_VALUE..0 -> return "Negative"
        else -> return "Unknown"
    }
}

fun printUserInfo(userName: String, userEmail: String, userAge : Int) {
    println("Name: $userName, Email: $userEmail, Age:$userAge")
}

