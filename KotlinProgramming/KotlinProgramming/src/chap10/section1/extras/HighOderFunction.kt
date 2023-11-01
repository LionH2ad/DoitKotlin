package chap10.section1.extras

fun main(){
    fun inc(x:Int):Int{
        return  x+1
    }
    fun high(name: String, body:(Int)->Int): Int{
        println("name: $name")
        val x =0
        return body(x)
    }

    val result = high("Sean", { x -> inc( x + 3) }) // 함수를 이용한 람다식
    val result2 = high("Sean", { inc( it + 3) }) // 소괄호 바깥으로 빼내고 생략

    val result4 = high("Sean") { x -> x + 3 } // 람다식 자체를 넘겨준 형태
    val result5 = high("Sean") { it + 3 } // 매개변수가 1개인 경우 생략

    val result3 = high("Kim", ::inc) // 매개변수 없이 함수의 이름만 사용할 때

    println("result : $result")
    println("result2 : $result2")
    println("result4 : $result4")
    println("result5 : $result5")
    println("result3 : $result3")
}