package loop

/**
 * Do while loop with array
 */
fun doWhileLoopWithArray(){
    val array = arrayOf(1,2,3,4,5,6,7,8,9,10)
    var i = 0
    do {
        print("${array[i]} ")
        i++
    } while ( i < array.size )
    println()
}

/**
 * Do while loop with list
 */
fun doWhileLoopWithList(){
    val list = listOf<Int>(1,2,3,4,5,6,7,8,9,10)
    var i = 0
    do {
        print("${list[i]} ")
        i++
    } while ( i < list.size )
    println()
}
fun main() {
    println("-----------------------")
    doWhileLoopWithArray()
    println("-----------------------")
    doWhileLoopWithList()
    println("-----------------------")
}