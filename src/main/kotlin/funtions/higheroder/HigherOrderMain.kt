package funtions.higheroder
/*a function which can accept a function as parameter or can return a function is called Higher-Order function.
 Instead of Integer, String or Array as a parameter to function,
 we will pass anonymous function or lambdas. */

fun add(a: Int, b: Int): Int {
    return a + b
}

fun div(a: Int, b: Int): Int {
    return a / b
}

/*Examples: Taking Functions as Parameters in function*/
//operation is a higher order function which require two parameter as int and return value as Int
fun calculation(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    return operation(x, y)
}

/*Examples: Returning Functions from functions*/
fun calculationReturn(): (Int, Int) -> Int {
    return ::add
}

fun main(args: Array<String>) {

    /*Examples: Taking Functions as Parameters in function*/

    //call calculation funtion with add
    val addResult = calculation(10, 20, ::add)

    //call calculation funtion with div
    val divResult = calculation(10, 2, ::div)

    //call calculation funtion for multi operation by pass anonymous function or lambdas
    val multiLamdaFun: (Int, Int) -> Int = { a, b -> a * b }
    val multiResult = calculation(10, 2, multiLamdaFun)

    println("add result ${addResult}")
    println("div result ${divResult}")
    println("multi result ${multiResult}")


    /*Examples: Returning Functions from function*/
    //here calculationReturn function returning a func which takes (Int,Int) as parameters and Int as return
    val func= calculationReturn()
    val result=func(5,5)
    println(result)



}