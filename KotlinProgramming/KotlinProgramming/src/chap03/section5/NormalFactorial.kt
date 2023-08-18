package chap03.section5

fun main() {
    val number = 4
    val result: Long

    result = chap03.section5.tailrec.factorial(number)
    println("Factorial: $number -> $result")
}

fun factorial(n: Int): Long {
    return if (n == 1) n.toLong() else n * chap03.section5.tailrec.factorial(n - 1)
}