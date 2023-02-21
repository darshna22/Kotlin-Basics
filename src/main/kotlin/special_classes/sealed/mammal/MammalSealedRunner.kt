package special_classes.sealed.mammal
/*
* sealed classes conform to restricted or bounded class hierarchies.
* A sealed class defines a set of subclasses within it.
* It is used when it is known in advance that a type will conform to one of the subclass types.
* Sealed classes ensure type safety by restricting the types to be matched at compile-time rather than at runtime.
* */
fun main() {
    println(greetMammal(Cat("meow")))
    println(greetMammal(Human("darshna","development")))

}

fun greetMammal(mammal: Mammal): String {
    val msg = when (mammal) {
        is Cat -> "Hello ${mammal.name}"
        is Human -> "Hello ${mammal.name} you are doing  ${mammal.job}"
    }
    return msg
}