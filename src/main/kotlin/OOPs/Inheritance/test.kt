package OOPs.Inheritance

import java.util.Scanner

/**
 *  open is a keyword use for make a class can be another are inherit
 */
open class Information{
    private var id:Int
    private var name:String
    private var gender:String
    private var department:String

    protected val scan = Scanner(System.`in`)

    constructor(id:Int,name:String,gender:String,department:String){
        this.id = id
        this.name = name
        this.gender = gender
        this.department = department
    }
    constructor(){
        id = 0
        name = "unknown"
        gender = "unknown"
        department = "unknown"
    }
    var infoId:Int
        get() = id
        set(value){
            this.id = value
        }
    open fun addInfo(){
        print("Enter Id         : "); id = scan.nextInt(); scan.nextLine()
        print("Enter Name       : "); name = scan.nextLine()
        print("Enter Gender     : "); gender = scan.next()
        print("Enter Department : "); department = scan.next();scan.nextLine()
    }
    open fun showAllInfo() = print("\t$id\t$name\t$gender\t$department")
    open fun headerInfo() = print("\tId\tName\tGender\tDepartment")

}
class ITE : Information {
    private var subject: String
    private var score: Double
    private var grade: String

    constructor(id:Int,name:String,gender:String,department:String,subject: String,score: Double):super(id,name,gender,department){
        this.subject = subject
        this.score   = score
        this.grade   = grade()
    }
    constructor():super(){
        subject = "unknown"
        score   = 0.0
        grade   = grade()
    }
    private fun grade():String {
        return if (score < 50.0) "F"
        else if (score >= 50.0 && score < 60.0) "E"
        else if (score >= 60.0 && score < 70.0) "D"
        else if (score >= 70.0 && score < 80.0) "C"
        else if (score >= 50.0 && score < 90.0) "B"
        else "A"
    }

    override fun addInfo() {
        super.addInfo()
        print("Enter Subject    : "); subject = scan.nextLine()
        print("Enter Score      : "); score = scan.nextDouble()
    }

    override fun showAllInfo() {
        super.showAllInfo()
        println("\t\t\t$subject\t$score\t$grade")
    }

    override fun headerInfo() {
        super.headerInfo()
        println("\tSubject\t\t\t\t\tScore\tGrade")
    }
}

fun main() {
    val ite = ITE(1,"Heng","Male","ITE","Information Security",90.0)
//    ite.addInfo()
    ite.infoId = 2
    ite.headerInfo()
    ite.showAllInfo()


}