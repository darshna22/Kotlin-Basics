package operators.iterator
class Animal(val name: String)

class Zoo(val animals: List<Animal>) {

    operator fun iterator(): Iterator<Animal> {             // 1
        return animals.iterator()                           // 2
    }
}

fun main(args: Array<String>) {
    val zoo = Zoo(listOf(Animal("zebra"), Animal("lion")))

    //way 1 to print animal list by iterator
    val animalIterator=zoo.iterator()
    while (animalIterator.hasNext()){
        val animal=animalIterator.next()
        println("Watch out, it's a ${animal.name}")
    }

    //way 2 to print animal list
    // in this case zoo class iterator function automatically call
    for (animal in zoo) {
        println("Watch out, it's a ${animal.name}")
    }

}