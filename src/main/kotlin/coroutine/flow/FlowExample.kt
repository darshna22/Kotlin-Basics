package coroutine.flow

import coroutine.nonSuspFunc.UploadOnThirdParty.Callback
import kotlinx.coroutines.flow.callbackFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.runBlocking
import java.awt.Button

fun main() {
    runBlocking {
        val flow = flow<Int> {
            (1..15).forEach {
                emit(it)
            }
        }
        flow.collect {
            print(it)
        }


        //2
        val callbackFlow = callbackFlow<Int> {
            val callback = object : Callback {
                override fun onProgress(int: Int) {
                    // trySend(int)
                }

                override fun onComplete() {
                    TODO("Not yet implemented")
                }
            }
        }
        callbackFlow.collect {
            print(it)
        }

    }

}
//use flow on get button action and control more click
//fun Button.clickStream()=flow<Unit>{
//    this.setOnClickListener{
//        emit(Unit)
//    }
//}
