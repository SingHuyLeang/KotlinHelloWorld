package intro

fun main(args: Array<String>) {
    val myTrue:Boolean = true
    val myFalse:Boolean = false
    val boolNull: Boolean? = null

    println(myTrue || myFalse)
    println(myTrue && myFalse)

    println("${!myFalse}")
}