package funtions.extenstion.order

/*
* Extension Functions and Properties
Kotlin lets you add new members to any class with the extensions mechanism.
* Namely, there are two types of extensions: extension functions and extension properties.
* They look a lot like normal wzsws 1q2wfunctions and properties but with one important difference: you need to specify the type that you extend.
* */
data class Item(val name: String, val price: Float)
data class Order(val items: Iterable<Item>)

//create extension functions to get max price item
fun Order.maxPricedItemValue(): Float {
    val maxPrice = this.items.maxByOrNull { it.price }?.price ?: 0F
    return maxPrice
}

//create extension functions to get name of max price item
fun Order.maxPricedItemName(): String {
    val maxPrice = this.items.maxByOrNull { it.price }?.name ?: "No Products"
    return maxPrice
}

//create extension functions to get all items name separated by , delimit
fun Order.commaDelimitedItemNames(): String {
    val names = this.items.map { it.name }.joinToString()
    return names
}

//data class Order(val items:Collection<Item>)
fun main() {
    val items = listOf(Item("Wine", 100f), Item("Beer", 80f), Item("Whisky", 100f), Item("Vodka", 120f))
    val order = Order(items = items)
    println("Max priced item name: ${order.maxPricedItemName()}")                           // 4
    println("Max priced item value: ${order.maxPricedItemValue()}")
    println("Items: ${order.commaDelimitedItemNames()}")
}

