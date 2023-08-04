package chap03.section3

fun main( ) {
    var result: Int
    val multi = {x: Int, y: Int -> x * y} // 일반 변수에 람다식 할당
    result = multi(10, 20) // 람다식이 할당된 변수응 함수처럼 사용 가능
    println(result)

    /**
     * 추가 내용에 대한 기입
     * */
    val multi2: (Int, Int) -> Int = {x: Int, y: Int ->
        println("x * y")
        x * y// 마지막 표현식이 반환
    }
    //val multi: (Int, Int) -> Int = {x: Int, y: Int -> x * y} //생략되지 않은 전체표현
    //val multi = {x: Int, y: Int -> x * y} // 선언 자료형 생략
    //val multi: (Int, Int) -> Int = {x, y -> x * y} //람다식 내개변수 자료형의 생략
    //val multi = {x, y -> x * y} //오류! 추론이 가능하지 않음

    //val greet: ( ) -> Unit = {println("Hello World!")}
    //val greet = {println("Hello World!")} // 추론 가능
    //val square: (Int) -> Int = {x -> x * x}
    //val square = {x: Int -> x * x} //square의 자료형을 생략하려면 x의 자료형을 명시해야 함
    //val nestedLambda: ( ) -> ( ) -> Unit = {{println("nested")}}
    //val nestedLambda = {{println("nested")}} //추론 가능
}