package special_classes.sealed.error

import java.io.File

/*
* sealed classes conform to restricted or bounded class hierarchies.
* A sealed class defines a set of subclasses within it.
* It is used when it is known in advance that a type will conform to one of the subclass types.
* Sealed classes ensure type safety by restricting the types to be matched at compile-time rather than at runtime.
* */
fun main() {
    getLogs(FileReadError(File("kjkj")))
}

fun getLogs(e: Error) {
    when (e) {
        is FileReadError ->{ println("Error while reading file ${e.file}") }
        is DatabaseError -> { println("Error while reading from db ${e.source.loginTimeout}") }
        is RuntimeError -> { println("Runtime error") }
    }
}