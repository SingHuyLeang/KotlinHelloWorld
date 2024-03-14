package intro

import java.util.*;

fun main() {
    var scan = Scanner(System.`in`)

    println("-------------- [ Input Data ] ----------------")
    print("Input your name : ");
    var name:String = scan.nextLine();
    print("Input your age  : ");
    var age:Int = scan.nextInt();

    println("-------------- [ Output Data ] ----------------")
    println("\tName\tAge")
    println("\t"+name+"\t"+age)

}