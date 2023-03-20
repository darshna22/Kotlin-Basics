package coroutine.nonSuspFunc

import coroutine.nonSuspFunc.UploadOnThirdParty.Callback
import coroutine.nonSuspFunc.UploadOnThirdParty.upload
import kotlinx.coroutines.*
import kotlin.coroutines.resume

fun main() {
    runBlocking {
        uploadFile1()
        task11()
    }

}

suspend fun uploadFile1() = suspendCancellableCoroutine<Unit> { continuation ->
    val callback = object : Callback {
        override fun onProgress(int: Int) {
            println("file uploading..")
        }

        override fun onComplete() {
            println("file upload successfully")
            //Resumes the execution of the corresponding coroutine
            // passing value as the return value of the last suspension point.
            continuation.resume(Unit)
//            continuation.resumeWithException(cause)
        }
    }
    upload(callback)

}
suspend fun task11(){
    delay(2000)
    println("task1 complete")
}




