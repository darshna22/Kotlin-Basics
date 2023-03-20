package special_classes.normal

//Normal class
open class NormalUser( open val name:String,  open val age:Int)
//Abstract class
abstract class Demo(open val test:String)
//Interface
interface UserInterface{
    fun testMe()
}

//extend normal class and implement interface
data class User(override val name:String, override val age:Int):NormalUser(name = name,age=age),UserInterface {
    override fun testMe() {
        println("Not yet implemented")
    }
}

fun main(){
    val user1=User("darshna",28)
    val user2=User("darshna",28)

    println("user1 is ${user1.hashCode()} and user2 is ${user2.hashCode()}")
}