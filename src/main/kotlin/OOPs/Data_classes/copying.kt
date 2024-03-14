package OOPs.Data_classes

data class User(val name:String,val age:Int)

fun main() {
    val user1 = User("Heng",20)
    println("user 1 = $user1")
//    Copying
    val user2 = user1.copy(name = "Songha")
    println("user 2 = $user2")

//    Data classes and destructuring declarations
    val jane = User("Jane",35)
    val (name,age) = jane
    println("$name $age year old")
}