package chap03.section3.funcfunc

import java.util.concurrent.locks.ReentrantLock

var sharable = 1 // 보호가 필요한 공유 자원

fun main(){
    val reLock = ReentrantLock()
    // 아래 3개는 모두 표현식이 같음
    lock(reLock,{ criticalFunc() })
    lock(reLock){ criticalFunc() }
    lock(reLock, ::criticalFunc)

    println(sharable)
}

fun criticalFunc(){
    //공유 자원 접근 코드 사용
    sharable += 1
    println("criticalFunc(), sharable : $sharable")
}

fun<T>lock(reLock: ReentrantLock, body: ()->T):T{
    reLock.lock()
    try {
        return body()
    }finally {
        reLock.unlock()
    }
}