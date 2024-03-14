package loop

fun main() {
    // for loop (only for in loop)
    for ( i in 1..10 ){
        print("$i ")
    }

    println("\n-----------------------------------------------")

    val array = arrayOf("A","B","C","D","E","F","G","H","I","J")
    for (index in array.indices){
        print("${array[index]} ")
    }
    println("\n-----------------------------------------------")

    val text = arrayOf("A","B","C","D","E","F","G","H","I","J")
    for ((index,value) in text.withIndex()){
        println("$index : $value")
    }

}