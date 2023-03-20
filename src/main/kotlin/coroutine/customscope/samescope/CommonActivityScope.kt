package coroutine.customscope.samescope

import kotlinx.coroutines.*

//here we are creating scope for activity with default thread
class CommonActivityScope : CoroutineScope by CoroutineScope(Dispatchers.Default) {


    private fun callFunctions() {
        runBlocking {
            val job = launch {
                task11()
            }
            TestA(coroutineContext).callApi()
            //Suspends the coroutine until this job is complete.
            job.join()
        }

    }


    private suspend fun task11(): Int {
        return 1
    }

    fun onDestroy() {
        cancel() //canceling scope of coroutine
    }


}

