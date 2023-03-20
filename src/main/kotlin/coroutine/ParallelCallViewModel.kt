package coroutine

import kotlinx.coroutines.*

fun main() {

//    callSerialAPIS()
//    callParallelAPIS1()
    runBlocking {
        val startTime = System.currentTimeMillis()
//        withContext(Dispatchers.IO) {
//            val call1 = async { callApi1() }
//            val call2 = async { callApi2() }
//            awaitAll(call1, call2)
//        }
        withContext(Dispatchers.IO) {
            launch {
                callApi1()
            }
            launch {
                callApi2()
            }
        }

        val endTime = System.currentTimeMillis()
        println("time =${endTime - startTime}")
    }
}

fun callSerialAPIS() {
    runBlocking {
        val startTime = System.currentTimeMillis()
        callApi11()
        callApi12()
        val endTime = System.currentTimeMillis()
        println("time =${endTime - startTime}")
    }
}

fun callParallelAPIS1() {
    runBlocking {
        val startTime = System.currentTimeMillis()
        val n1 = launch { callApi1() }
        val n2 = launch { callApi2() }
        //println("data ${(n1 + n2)}")
        val endTime = System.currentTimeMillis()
        println("time =${endTime - startTime}")
    }
}



suspend fun callApi1(): Int {
    delay(5)
    println("call1")
    return 30
}

suspend fun callApi2(): Int {
    delay(5)
    println("call2")
    return 60
}
