package OOPs.Constructor.primary


class Person(name:String,age:Int){
    init {
        println("Person name's $name")
        println("His/Her age's $age")
    }
}

fun main() {
    Person("Heng Pitu",36)
}