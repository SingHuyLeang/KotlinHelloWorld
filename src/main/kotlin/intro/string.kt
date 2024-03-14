package intro

fun main() {
    
    // single line String
    val s = "Hello, world!\n"
    println(s)

    // Multiline String
    val text = """
    for (c in "foo")
        print(c)
    """
    println(text)

    val txt = """
    |Tell me and I forget.
    |Teach me and I remember.
    |Involve me and I learn.
    |(Benjamin Franklin)
    """.trimMargin()
    println(txt)
}