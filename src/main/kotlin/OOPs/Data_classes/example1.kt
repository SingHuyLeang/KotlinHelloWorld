package OOPs.Data_classes

data class Person(val name: String) {
    var Nname:String = this.name
    var age: Int = 0
}
fun main() {
    val person1 = Person("John")
    val person2 = Person("John")
    person1.age = 10
    person2.age = 20

    println("person1 == person2: ${person1 == person2}")
    // person1 == person2: true

    println("person1 with age ${person1.age}: ${person1.Nname}")
    // person1 with age 10: Person(name=John)

    println("person2 with age ${person2.age}: ${person2.Nname}")
    // person2 with age 20: Person(name=John)
}