package funtions.tailrecu

import java.math.BigInteger


fun main() {
    val n = 10000
    val first = BigInteger("0")
    val second = BigInteger("1")
    //println(generateFibonacciSeries(n, first, second))
//    println(findFactorial(1000000))
}

tailrec fun generateFibonacciSeries(n: Int, a: BigInteger, b: BigInteger):BigInteger {
    return if (n==0) a
    else generateFibonacciSeries(n-1,b,a+b)
}

tailrec fun findFactorial(n: Int): Int {
    return if (n == 1) n
    else n * findFactorial(n - 1)
}