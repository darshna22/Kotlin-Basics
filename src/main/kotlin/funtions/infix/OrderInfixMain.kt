package funtions.infix


infix fun String.add(string: String):String{
    return this.plus(string)
}
//data class Order(val items:Collection<Item>)
fun main() {
    val newStr="abc" add "def"
    println("Items: $newStr")
}

