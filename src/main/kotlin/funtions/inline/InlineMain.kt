package funtions.inline


fun main() {
    val addFunc = { x: Int, y: Int -> x + y }
    calculateTimAndRun(10, 20, addFunc)
    calculateTimAndRun(10, 20, addFunc)
    calculateTimAndRun(10, 20, addFunc)


}

 inline fun calculateTimAndRun(a: Int, b: Int, operation: (Int, Int) -> Int) {
    val start = System.currentTimeMillis()
    operation(a, b)
    val end = System.currentTimeMillis()
    println("${end-start}")
}