package special_classes.data

data class UserData(val name:String,val age:Int)

fun main(){
    val user1=UserData("darshna",28)
    val user2=UserData("darshna",21)
    val user3=user2.copy(name = "darshna", age = 28)

    println("user1 is ${user1.hashCode()} , user2 is ${user2.hashCode()} and user3 is ${user3.hashCode()}")
}