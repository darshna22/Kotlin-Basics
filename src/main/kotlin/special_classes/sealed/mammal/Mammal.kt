package special_classes.sealed.mammal

sealed class Mammal(val name: String)
class Human(private val humanName: String, val job: String) : Mammal(humanName)