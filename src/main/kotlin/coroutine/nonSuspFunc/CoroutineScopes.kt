package coroutine.nonSuspFunc

import coroutine.nonSuspFunc.UploadOnThirdParty.Callback
import coroutine.nonSuspFunc.UploadOnThirdParty.upload
import kotlinx.coroutines.*
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine

fun main() {
    runBlocking {
        uploadFile()
        task1()
    }

}

suspend fun uploadFile() = suspendCoroutine<Unit> { continuation ->
    val callback = object : Callback {
        override fun onProgress(int: Int) {
            println("file uploading..")
        }

        override fun onComplete() {
            println("file upload successfully")
            //Resumes the execution of the corresponding coroutine
            // passing value as the return value of the last suspension point.
            continuation.resume(Unit)
        }
    }
    upload(callback)

}
suspend fun task1(){
    delay(2000)
    println("task1 complete")
}



