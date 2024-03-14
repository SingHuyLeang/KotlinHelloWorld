package OOPs.Constructor.secondary

class Human(val pets: MutableList<Pet> = mutableListOf())

class Pet (owner: Human) {
    init {
        owner.pets.add(this)
    }
}
fun main(){
    val person = Human()
    val cat = Pet(person)
    val dog = Pet(person)
    println(person.pets)
}
