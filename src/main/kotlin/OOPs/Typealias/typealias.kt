package OOPs.Typealias

typealias IntPredicate = (i:Int)->Boolean

val isEven: IntPredicate = { it % 2 == 0 }

fun main() {
    println("Is 7 even? - ${isEven(7)}")
}