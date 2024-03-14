package collection_kt.list_kt

fun main() {
    val list:MutableList<Int> = mutableListOf()

    for (i in 0 ..< 5){
        print("Input number = "); val number:Int = readln().toInt()
        list.add(number)
    }
    // Filter
    println("Filter     : "+list.filter { it % 2 == 0 }) // it is catch data from list
    // Mapping
    println("Mapping    : "+list.map { it * 2 })
    // Sorting
    println("Sorting    : "+list.sortedDescending())
    // Contain
    println("Contain    : (3) is "+list.contains(3))
    // Size of List
    println("Size       : "+list.size)
    // Remove At (index)
    println("Remove At  : index 2 is "+list.removeAt(2))
    // for each
    list.forEach { data-> print("$data ") }
}