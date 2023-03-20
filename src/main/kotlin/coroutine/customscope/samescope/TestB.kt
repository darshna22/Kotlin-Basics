package coroutine.customscope.samescope

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.coroutines.CoroutineContext

class TestB(override val coroutineContext: CoroutineContext) : CoroutineScope by CoroutineScope(coroutineContext) {

    fun callApi() {
        //this will coroutine execute api in same scope coming in constructor and scope of coroutine
        // finish once parent(coroutineContext) provider finish
        launch {
            fetchUserData()
        }

        //Here we are creating own scope with thread which scope finish once fetchUserData finish
        CoroutineScope(coroutineContext).launch(Dispatchers.IO) {
            fetchUserData()
        }

    }

    suspend fun fetchUserData(): Int {
        delay(2000)
        return 11
    }
}