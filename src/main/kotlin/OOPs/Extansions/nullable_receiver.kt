package OOPs.Extansions

// Define the extension function
fun Any?.toString(): String {
    if (this == null) return "null"
    // After the null check, 'this' is auto cast to a non-nullable type, so the toString() below
    // resolves to the member function of the Any class
    return toString()
}

fun main() {
    // Example 1: Non-null value
    val nonNullString: String = "Hello, World!"
    val resultNonNull = nonNullString.toString()
    println("Result for non-null value: $resultNonNull")

    // Example 2: Null value
    val nullString: String? = null
    val resultNull = nullString.toString()
    println("Result for null value: $resultNull")

    // Example 3: Using the extension function directly
    val anotherNonNullString: String = "Kotlin is fun!"
    val resultAnotherNonNull = anotherNonNullString.toString()
    println("Result for another non-null value: $resultAnotherNonNull")

    // Example 4: Using the extension function with null value directly
    val anotherNullString: String? = null
    val resultAnotherNull = anotherNullString.toString()
    println("Result for another null value: $resultAnotherNull")
}
