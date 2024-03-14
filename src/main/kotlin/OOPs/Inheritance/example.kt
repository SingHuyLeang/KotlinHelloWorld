package OOPs.Inheritance

open class Phone(name:String)
class Apple(name: String) : Phone(name) {

}

fun main() {
    println(Apple("Iphone 15 Pro Max"))
}