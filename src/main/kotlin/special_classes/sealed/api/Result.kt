package special_classes.sealed.api

import java.lang.RuntimeException

sealed class Result<T>
object Loading : Result<Nothing>()
data class Success<T>(val data: T) : Result<T>()
data class Error(val exception: Throwable) : Result<Nothing>()
