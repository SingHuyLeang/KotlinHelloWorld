package control_statement

fun main(args: Array<String>) {
    val age = 18
//   if statement
    if (age == 18){
        println("You can join... ")
    }

//    if else statement
    if (age >= 18) {
        println("You join this party")
    } else {
        println("Wait you age not correct")
    }

//    if else if else statement

    var name:String = "Dara"
    if ( name.equals("Sok")){
        println("Sok use MacBook")
    } else if ( name.equals("Dara") ){
        println("Dara use MSI ")
    } else {
        println("Normal user use mobile phone")
    }
//  in kotlin don't have ternary operator like another programming language

}