package OOPs.interfaces

interface Phone{
    fun name():String
    fun price():Double {return 0.0}
}
class Apple : Phone {
    override fun name():String{
        return "IPhone 16 Pro Max"
    }

    override fun price(): Double {
        return 1500.0
    }
}

fun main() {
    val apple = Apple()
    println("Phone name  : ${apple.name()}")
    println("Phone Price : ${apple.price()}")
}