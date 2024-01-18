package chap11.section2

// 피보나치 수열 생성
val fibonacciSeq = sequence {
    var a = 0
    var b = 1
    yield(1) // (1) 지연 함수가 사용됨

    while (true) {
        yield(a + b) // (2)
        val tmp = a + b
        a = b
        b = tmp
    }
}

// generateSequence()의 사용
val seq = sequence {
    val start = 0
    yield(start)// 단일 값 산출
    yieldAll(1..5 step 2) // 반복 값 산출
    yieldAll(generateSequence(8) { it * 3 }) // 무한한 시퀀스에서 산출
}

fun main() {
    println(fibonacciSeq.take(8).toList()) // (3) 8개의 값을 획득
    println(seq.take(7).toList()) // [0, 1, 3, 5, 8, 24, 72]

    // 다음 요소에 대한 지정
    val saved = fibonacciSeq.iterator()
    println("${saved.next()}, ${saved.next()}, ${saved.next()}")
}