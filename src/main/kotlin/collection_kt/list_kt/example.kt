package collection_kt.list_kt

import java.util.Scanner
import kotlin.system.exitProcess

/*
 * This is primary [contractor]
 * class Student(id: Int, name: String, gender: String, score: Double, average: Double, grade: String) {
 *     val id:Int = 0
 *     val name:String = ""
 *     val gender:String = ""
 *     val score:Double = 0.0
 *     val average:Double = 0.0
 *     val grade:String = ""
 *
 * }
 */

class Student{
    private var id:Int
    private var name:String
    private var gender:String
    private var score:Double
    private var grade:String
    private var scan = Scanner(System.`in`)

    constructor(id:Int,name:String,gender:String,score:Double,grade:String){
        this.id = id
        this.name = name
        this.gender = gender
        this.score = score
        this.grade = grade
    }
     constructor(){
        this.id = 0
        this.name = "Empty"
        this.gender = "Empty"
        this.score = 0.0
        this.grade = "F"
    }

    fun getId():Int{
        return id
    }
    fun getScore():Double{
        return score
    }

    fun input(){
        print("Enter id        -> "); id = scan.nextInt(); scan.nextLine()
        print("Enter name      -> "); name = scan.nextLine()
        print("Enter gender    -> "); gender = scan.next()
        print("Enter score     -> "); score = scan.nextDouble()
        findGrade()
    }
    private fun findGrade(){
        grade = when {
            score >= 90 -> "A"
            score >= 80 -> "B"
            score >= 70 -> "C"
            score >= 60 -> "D"
            else -> "F"
        }
    }
    fun header(){
        println("Id\tName\tGender\tScore\tGrade")
    }
    fun output(){
        println("$id\t$name\t$gender\t$score\t$grade")
    }
}

fun main() {
    val list:MutableList<Student> = mutableListOf()
    val scan = Scanner(System.`in`)
    var n = 0
    var op:Int
    do {
        println(
            """
            1. Input    2. Output   3. Search   4. Update   5. Remove
            6. Insert   7. Sort     8. Add      9. Clear    10. Exit
            """.trimIndent())
        print("Please choose option : "); op = scan.nextInt()
        when(op){
            1 -> {
                print("Please enter number of student to add : "); n = scan.nextInt()
                for (i in 0..<n){
                    val student = Student()
                    student.input()
                    list.add(i,student)
                }
            }
            2 -> {
                if (list.isNotEmpty()) {
                    Student().header()
                    list.forEach { stu -> stu.output() }
                }else{
                    System.err.println("Don't Have Data in Collection")
                }
            }
            3 -> {
                if (list.isNotEmpty()) {
                    print("Enter student id for search -> "); val id = scan.nextInt()
                    Student().header()
                    var check = false
                    list.forEach { stu ->
                        if (stu.getId() == id){
                            stu.output()
                            check = true
                        }
                    }
                    if (!check) System.err.println("Search not found")
                }else{
                    System.err.println("Don't Have Data in Collection")
                }
            }
            4 -> {
                if (list.isNotEmpty()) {
                    print("Enter student id for update -> "); val id = scan.nextInt()
                    var check = false
                    for (i in 0..<list.size){
                        if (list[i].getId() == id){
                            val student = Student()
                            student.input()
                            list[i] = student
                            check = true
                        }
                    }
                    if (check) println("\u001B[32mStudent Updated Successfully\u001B[0m")
                    else System.err.println("Search not found")
                }else{
                    System.err.println("Don't Have Data in Collection")
                }
            }
            5 -> {
                if (list.isNotEmpty()) {
                    print("Enter student id for remove -> "); val id = scan.nextInt()
                    val check = list.removeIf{stu-> stu.getId() == id}
                    if (check) println("\u001B[32mStudent Remove Successfully\u001B[0m")
                    else System.err.println("Search not found")
                }else{
                    System.err.println("Don't Have Data in Collection")
                }
            }
            6 -> {
                if (list.isNotEmpty()) {
                    print("Enter student id for insert -> "); val id = scan.nextInt()
                    var check = false
                    for (i in 0..<list.size){
                        if (id == list[i].getId()){
                            val student = Student()
                            student.input()
                            list.add(i,student)
                            check = true
                        }
                    }
                    if (check) println("\u001B[32mStudent Remove Successfully\u001B[0m")
                    else System.err.println("Search not found")
                }else{
                    System.err.println("Don't Have Data in Collection")
                }
            }
            7 -> {
                if (list.isNotEmpty()) {
                    list.sortedByDescending { it.getScore() }
                }else{
                    System.err.println("Don't Have Data in Collection")
                }
            }
            8 -> {
                print("Please enter number of student to add : "); val add = scan.nextInt()
                for (i in n..<n+add){
                    val student = Student()
                    student.input()
                    list.add(student)
                }
            }
            9 -> {
                if (list.isNotEmpty()) {
                    list.clear()
                }else{
                    System.err.println("Don't Have Data in Collection")
                }
            }
            else -> println("Don't have this option!")
        }
    }while (op!=10)
}