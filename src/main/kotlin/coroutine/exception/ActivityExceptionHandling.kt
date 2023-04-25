//package coroutine.exception
//
//import kotlinx.coroutines.*
//import kotlin.coroutines.CoroutineContext
//import kotlin.random.Random
//
//class ActivityExceptionHandling : CoroutineScope by CoroutineScope(SupervisorJob() + Dispatchers.Default) {
////    override val coroutineContext: CoroutineContext
////        get() = TODO("Not yet implemented")
//
//
//
//    fun onCreate() {
//        //all coroutines executing on supervisor scope
//        launch(coroutineContext) { task11() }
//        launch(coroutineContext) { task12()}
//        launch(coroutineContext) { task13()}
//        //CoroutineExceptionHandler exception use handle specific coroutine exception
//        launch(CoroutineExceptionHandler { coroutineContext, throwable ->  }) {
//            task11()
//        }
//    }
//
//    private fun task11() {}
//    private fun task12() {}
//    private fun task13() {}
//}