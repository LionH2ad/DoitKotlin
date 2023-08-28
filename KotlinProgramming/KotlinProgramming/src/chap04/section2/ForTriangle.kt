package chap04.section2

fun main() {
    print("Enter the lines: ")
    val n = readLine()!!.toInt() // 콘솔로부터 입력반음

    for (line in 1..n) {
        for (space in 1..(n - line)) print(" ")
        for (star in 1..(2 * line - 1)) print("*")
        println()
    }
}