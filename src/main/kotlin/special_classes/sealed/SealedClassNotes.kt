package special_classes.sealed

/*
* Sealed Classes and Interface
*
* 1. Sealed classes let you restrict the use of inheritance.
* 2. Sealed classes and interfaces represent restricted class hierarchies that provide more control over inheritance.
* 3. All direct subclasses of a sealed class are known at compile time.
*    No other subclasses may appear outside a module within which the sealed class is defined.
* 4. third-party clients can't extend your sealed class in their code
* 5. The same works for sealed interfaces and their implementations: once a module with a sealed interface is compiled, no new implementations can appear.
* 6. In some sense, sealed classes are similar to enum classes: the set of values for an enum type is also restricted,
* but each enum constant exists only as a single instance, whereas a subclass of a sealed class can have multiple instances, each with its own state.
* 7. To declare a sealed class or interface, put the sealed modifier before its name
* 8. A sealed class is abstract by itself, it cannot be instantiated directly and can have abstract members.
* 9. Constructors of sealed classes can have one of two visibilities: protected (by default) or private.

 sealed class IOError {
    constructor() { /*...*/ } // protected by default
    private constructor(description: String): this() { /*...*/ } // private is OK
    // public constructor(code: Int): this() {} // Error: public and internal are not allowed
}
* 10. Direct subclasses of sealed classes and interfaces must be declared in the same package.
They may be top-level or nested inside any number of other named classes, named interfaces, or named objects.
* 11. Subclasses can have any visibility as long as they are compatible with normal inheritance rules in Kotlin.
* 12. Subclasses of sealed classes must have a proper qualified name. They can't be local nor anonymous objects.
* 13. enum classes can't extend a sealed class (as well as any other class), but they can implement sealed interfaces.
* 14. The key benefit of using sealed classes comes into play when you use them in a when expression.
      If it's possible to verify that the statement covers all cases, you don't need to add an else clause to the statement.
* 15. However, this works only if you use when as an expression (using the result) and not as a statement:
fun log(e: Error) = when(e) {
    is FileReadError -> { println("Error while reading file ${e.file}") }
    is DatabaseError -> { println("Error while reading from database ${e.source}") }
    is RuntimeError ->  { println("Runtime error") }
    // the `else` clause is not required because all the cases are covered
}

 **/



