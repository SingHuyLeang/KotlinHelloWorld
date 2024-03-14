package OOPs.Extansions
fun List<String>.getLongestString(): String? {
    if (isEmpty()) {
        return null
    }

    var longestString = this[0]

    for (str in this) {
        if (str.length > longestString.length) {
            longestString = str
        }
    }

    return longestString
}

fun main() {
    val stringList = listOf("apple", "banana", "kiwi", "strawberry", "blueberry")

    val longestString = stringList.getLongestString()

    if (longestString != null) {
        println("The longest string in the list is: $longestString")
    } else {
        println("The list is empty.")
    }
}
