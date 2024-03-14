package OOPs.Property

/**
 * In <b>Kotlin</b> need you initialize value for data member
 * But if you have a constructor it don't need
 */
class Person{
//    Encapsulation
    private var id:Int = 10
    private var name:String = "Heng Somnang"
    private var gender:String = "Male"
    private var salary:Double = 1000.0
//    Property get and set
    var personId:Int
        get() = id
        set(value) {
            id = value
        }
    var personName:String
        get() = name
        set(value) {
            name = value
        }
}

fun main() {
    val person = Person()
    person.personId = 1001
    println(person.personId)
    person.personName = "Heng Songha"
    println(person.personName)
}
