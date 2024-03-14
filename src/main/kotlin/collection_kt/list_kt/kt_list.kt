package collection_kt.list_kt

fun main(){
    var number:List<Int> = listOf(10,20,30,40,50)
    var str:List<String> = listOf("apple","banana","coconut")

    number.forEach { data -> print("$data ") }
    println()
    str.forEach { data -> print("$data ") }
}