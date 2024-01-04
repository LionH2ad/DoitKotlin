package chap11.section2

import kotlinx.coroutines.*

suspend fun doWork1(): String {
    delay(1000)
    return "Work1"
}

suspend fun doWork2(): String {
    delay(3000)
    return "Work2"
}

private fun worksInSerial() {
    // 순차적 실행
    GlobalScope.launch {
        val one = doWork1()
        val two = doWork2() // doWork1() 이 끝나야 진행이 가능
        println("Kotlin One : $one")
        println("Kotlin Two : $two")
    }
}

private fun worksInParallel() {
    // Deferred<T> 를 통해 결과값을 반환
    val one = GlobalScope.async {
        doWork1()
    } // DeferredCoroutine 으로 감싸서 바로 반환하며 await() 함수로 값에 접근이 가능
    val two = GlobalScope.async {
        doWork2()
    }

    GlobalScope.launch {
        val combined = one.await() + "_" + two.await() // 동시에 진행이 가능해짐
        println("Kotlin Combined : $combined")
    }
}

fun main() {
    worksInSerial()
    worksInParallel()
    readLine() //main() 이 먼저 종료되는 것을 방지하기 위해
}