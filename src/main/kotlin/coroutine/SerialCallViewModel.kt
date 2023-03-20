package coroutine

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    callSerialApis()
}

fun callSerialApis() {
    runBlocking {
        val startTime = System.currentTimeMillis()
        callApi11()
        callApi12()
        val endTime = System.currentTimeMillis()
        println("time =${endTime - startTime}")
    }
}

fun callSerialApis1() {
    runBlocking {
        val startTime = System.currentTimeMillis()
        val n1 = async { callApi11() }.await()
        val n2 = async { callApi12() }.await()
        println("data ${(n1 + n2)}")
        val endTime = System.currentTimeMillis()
        println("time =${endTime - startTime}")
    }
}

suspend fun callApi11(): Int {
    delay(5)
    println("call1")
    return 30
}

suspend fun callApi12(): Int {
    delay(5)
    println("call2")
    return 60
}
