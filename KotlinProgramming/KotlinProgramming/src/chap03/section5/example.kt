package chap03.section5

fun main(){
    val mulResult = mul(2,3)
    println("mulResult: $mulResult")
}

fun anonymousFunction00(){
    //익명 함수
    fun(x: Int,y: Int): Int = x+y //함수 이름이 생략된 익명 함수
    val add:(Int, Int) -> Int = fun(x: Int,y: Int): Int = x+y // 익명 함수를 사용한 add 선언
    val result = add(10,2) // add의 사용
}

fun anonymousFunction01(){
    val add = fun(x: Int,y: Int): Int = x+y //선언부의 자료형은 생략이 가능
}

fun anonymousFunction02(){
    val add = {x: Int, y: Int -> x + y} //람다식 표현법과 유사
}

fun mul(a: Int,b: Int): Int = a*b