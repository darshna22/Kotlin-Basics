package special_classes.enums
/*
* Enum classes are used to model types that represent a finite set of distinct values,
*  such as directions, states, modes, and so forth.
*
* Enums may contain properties and methods like other classes,
* separated from the list of enum constants by a semicolon.
* */

//1. Enum with states
enum class State {
    IDLE, RUNNING, FINISHED
}


//2. Enum with properties and method
enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00);


    fun containsRed() = (this.rgb and 0xFF0000 != 0)
}

//3 Enum with properties
enum class Cards(val color: String) {
    Diamond("black"),
    Heart("red");
}

fun main() {
    val state = State.RUNNING
    val message = when (state) {
        State.IDLE -> "It's idle"
        State.RUNNING -> "It's running"
        State.FINISHED -> "It's finished"
    }
    println(message)


    val red = Color.RED
    println(red.rgb)
    println(red.containsRed())

    val color = Cards.Diamond.color
    println(color)

    for (state in Color.values())
        println(state)
}


