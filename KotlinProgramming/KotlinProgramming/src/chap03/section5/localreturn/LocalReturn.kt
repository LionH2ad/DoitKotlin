package chap03.section5.localreturn

fun main(){
    shortFunc(3){
        println("First call: $it")
        return // return이 있어서 (2) 까지 가지 않고 여기 까지만
    }
}

inline fun shortFunc(a: Int, out: (Int) -> Unit) {
    println("Before calling out( )")
    out(a)
    println("After calling out( )") // (2)
}