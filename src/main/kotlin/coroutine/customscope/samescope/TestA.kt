package coroutine.customscope.samescope

import kotlin.coroutines.CoroutineContext

class TestA(private val coroutineContext: CoroutineContext) {

    suspend fun callApi(){
        TestB(coroutineContext).callApi()
    }
}