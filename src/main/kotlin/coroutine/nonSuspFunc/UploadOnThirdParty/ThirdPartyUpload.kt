package coroutine.nonSuspFunc.UploadOnThirdParty

//consider this method provided by 3rd party to upload code
fun upload(callback: Callback) {

    (1..10).forEach {
        callback.onProgress(it)
    }
    callback.onComplete()

}

interface Callback {
    fun onProgress(int: Int)
    fun onComplete()
}
