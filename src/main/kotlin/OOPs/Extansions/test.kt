package OOPs.Extansions

fun <T>MutableList<T>.swap(index1: Int, index2: Int) {
    val tmp = this[index1] // 'this' corresponds to the list
    this[index1] = this[index2]
    this[index2] = tmp
}

fun main() {
    // Creating a mutable list of integers
    val numbers = mutableListOf("1","2","3","4","5")

    // Displaying the original list
    println("Original List: $numbers")

    // Swapping elements at indices 1 and 3
    numbers.swap(1, 3)

    // Displaying the list after swapping
    println("List after swapping elements at indices 1 and 3: $numbers")

    // Swapping elements at indices 0 and 4
    numbers.swap(0, 4)

    // Displaying the list after another swapping operation
    println("List after swapping elements at indices 0 and 4: $numbers")
}
