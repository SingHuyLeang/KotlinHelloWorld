package collection_kt.set_kt

fun main() {
    val multiSet:MutableSet<String> = mutableSetOf()

    // add
    multiSet.add("first")
    multiSet.add("second")

    // addAll
    val set:Set<String> = setOf("third","four","five")
    multiSet.addAll(set)

    // indices : 0..-1 sizeof element
    println(multiSet.indices)

    // size
    println(multiSet.size)

    // etc ..

    // forEach
    multiSet.forEach { s -> println(s) }
}