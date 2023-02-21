package special_classes.enums
/*
* Enum classes are used to model types that represent a finite set of distinct values,
*  such as directions, states, modes, and so forth.
*
* Enums may contain properties and methods like other classes,
* separated from the list of enum constants by a semicolon.
* */

//1.
//Enum without properties and method
enum class State {
    IDLE, RUNNING, FINISHED                           // 1
}


//2.
//Enum with properties and method
enum class Color(val rgb: Int) {                      // 1
    RED(0xFF0000),                                    // 2
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00);

    fun containsRed() = (this.rgb and 0xFF0000 != 0)  // 3
}

//3
enum class Cards(val color: String) {
    Diamond("black"),
    Heart("red");
}

fun main() {
    val state = State.RUNNING                         // 2
    val message = when (state) {                      // 3
        State.IDLE -> "It's idle"
        State.RUNNING -> "It's running"
        State.FINISHED -> "It's finished"
    }
    println(message)


    val red = Color.RED
    println(red.rgb)                                      // 4
    println(red.containsRed())

    val color = Cards.Diamond.color
    println(color)
}


