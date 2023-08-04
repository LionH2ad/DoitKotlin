package chap03.section3.funcargs

fun main( ) {
    val res1 = chap03.section3.funcfunc.sum(3, 2) // 일반 인자
    val res2 = mul(chap03.section3.funcfunc.sum(3, 3),3) // 인자에 함수를 사용

    println("res1: $res1, res2: $res2")
}

fun sum(a: Int, b: Int) = a + b
fun mul(a: Int, b: Int) = a * b