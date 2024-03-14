package OOPs.interfaces

fun interface IntPredicate{
    fun accept(i: Int): Boolean
}

fun main() {
    val isEven = IntPredicate { it % 2 == 0 }
    println("Is 8 even? - ${isEven.accept(8)}")
}