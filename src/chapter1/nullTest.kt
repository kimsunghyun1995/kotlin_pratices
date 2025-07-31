package chapter1

fun main() {

    println(safeLength("Hello World")) // 11
    println(safeLength(null)) // 0

    println(sumNonNull(listOf(1, 2, null, 4, null, 5))) // 12

    println("Madam".isPurePalin())          // true
    println("Never Odd Or Even".isPurePalin()) // true
    println((null as String?).isPurePalin())   // false
}


fun safeLength(s: String?): Int = s?.length ?: 0


fun sumNonNull(nums: List<Int?>) : Int =
    nums.filterNotNull().sum()

fun String?.isPurePalin(): Boolean {
    if(this == null) return false
    val pure = this.replace(" ", "")
    return pure.equals(pure.reversed(), ignoreCase = true)
}