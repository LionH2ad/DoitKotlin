package chap04.section3

fun main() {
    println("-----")
    lableBreakBreak()
    println("-----")
    lableBreakFirst()
    println("-----")
    lableBreakContinue()
}

fun hello(name: String): Unit {
    println(name)
    return Unit
}

fun helloTwo(name: String): Unit {
    println(name)
    return
}

fun helloThree(name: String) {
    println(name)
}

fun lableBreakBreak() {
    println("labelBreak")
    for (i in 1..5) {
        second@ for (j in 1..5) {
            if (j == 3) break
            println("i:$i, j:$j")
        }
        println("after for j")
    }
    println("after for i")
}

fun lableBreakFirst() {
    println("labelBreak")
    first@ for (i in 1..5) {
        second@ for (j in 1..5) {
            if (j == 3) break@first
            println("i:$i, j:$j")
        }
        println("after for j")
    }
    println("after for i")
}

fun lableBreakContinue() {
    println("labelBreak")
    first@ for (i in 1..5) {
        second@ for (j in 1..5) {
            if (j == 3) continue@first
            println("i:$i, j:$j")
        }
        println("after for j")
    }
    println("after for i")
}