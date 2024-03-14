package OOPs.Constructor.secondary

class Person{
    //    Encapsulation
    private var id:Int
    private var name:String
    private var gender:String
    private var salary:Double
    //    Constructor
    constructor(id:Int,name:String,gender:String,salary:Double){
        this.id = id
        this.name = name
        this.gender = gender
        this.salary = salary
    }
    constructor(){
        id = 1
        name = "Huy Leang"
        gender = "Male"
        salary = 2500.0
    }
    fun output(){
        println("Id\t\tName\t\t\tGender\t\tSalary")
        println("$id\t\t$name\t\t$gender\t\t$salary")
    }
}

fun main(args: Array<String>) {
    println("------------------ [ Default ] ------------------")
    val person1 = Person()
    person1.output()
    println("-------------- [ Has Parameter ] -----------------")
    val person2 = Person(2,"Heng Somnang","Male",2500.0)
    person2.output()
}