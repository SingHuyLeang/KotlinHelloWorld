package collection_kt.map_kt

fun main() {
    val map:MutableMap<String,Int> = mutableMapOf()
    // add data
    map["(❁´◡`❁)"] = 5 // or use .put(key,value)
    map["(☆*: .｡. o(≧▽≦)o .｡.:*☆)"] = 10
    map["(┬┬﹏┬┬)"] = 15
    // forEach
    map.forEach{(key,value)-> println("$key       $value") }
}