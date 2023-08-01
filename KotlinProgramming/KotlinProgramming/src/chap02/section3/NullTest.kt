package chap02.section3

fun main (){
    /*var str1 : String = "Hello Kotlin"
    str1 = null*/ //오류! null을 허용하지 않음
    var str1 : String? = "Hello Kotlin"
    str1 = null
    println("str1 : $str1 length : ${str1?.length}") //str1을 세이프 콜로 안전하게 호출
    //println("str1 : $str1 length : ${str1!!.length}") // NPE 강제 발생
}