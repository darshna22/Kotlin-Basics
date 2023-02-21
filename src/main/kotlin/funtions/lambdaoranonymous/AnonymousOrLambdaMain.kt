package funtions.lambdaoranonymous

import java.math.BigInteger

/*
*
Kotlin | Lambdas Expressions and Anonymous Functions
* An anonymous function is very similar to regular function except for the name of the function
* which is omitted from the declaration.
* */
fun main() {
    //assign function to variable
    val func = ::add
    val func1:(BigInteger,BigInteger)->BigInteger = ::add
    //use function variable func
    println(func(BigInteger("1"),BigInteger("3")))

    val addResult: (Int, Int) -> Int = { a, b -> a + b }
    println(addResult(10, 10))
    val upperCase1: (String) -> String = { str: String -> str.uppercase() }
    val upperCase2: (String) -> String = { str -> str.uppercase() }
    val upperCase3 = { str: String -> str.uppercase() }
    val upperCase4: (String) -> String = { it.uppercase() }
    val upperCase5: (String) -> String = String::uppercase

    // val upperCase6 = { str -> str.uppercase() }
    println(upperCase1("darshna"))
    println(upperCase2("darshna"))
    println(upperCase3("darshna"))
    println(upperCase4("darshna"))
    println(upperCase5("darshna"))


    /*
    1. A lambda in all its glory, with explicit types everywhere. The lambda is the part in curly braces, which is assigned to a variable of type (String) -> String (a function type).
    2. Type inference inside lambda: the type of the lambda parameter is inferred from the type of the variable it's assigned to.
    3. Type inference outside lambda: the type of the variable is inferred from the type of the lambda parameter and return value.
    4. For lambdas with a single parameter, you don't have to explicitly name it. Instead, you can use the implicit it variable. This is especially useful when the type of it can be inferred (which is often the case).
    5. If your lambda consists of a single function call, you may use function pointers (::) .
    6. You cannot do both together, the compiler has no chance to infer the type that way.

   */

}

fun add(a: BigInteger, b: BigInteger): BigInteger {
    return a + b
}
