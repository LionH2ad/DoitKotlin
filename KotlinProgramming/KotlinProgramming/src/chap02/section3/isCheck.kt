package chap02.section3

fun main( ) {
    val num = 256

    if(num is Int){ // 1) num이 Int형일 때
        println(num)
    } else if (num !is Int) { // 2) num이 Int형이 아닐 때, !(num is Int)와 동일
        println("Not a Int")
    }
}