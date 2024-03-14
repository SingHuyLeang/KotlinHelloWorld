package control_statement

fun main(args: Array<String>) {
    print("Choose one day of [1->7] : ")
    val day:Int = readln().toInt()
    when (day){
        1-> {
            println("Hello Monday")
        }
        2 ->{
            println("Hello Tuesday")
        }
        3 ->{
            println("Hello Wednesday")
        }
        4 ->{
            println("Hello Thursday")
        }
        5 ->{
            println("Hello Friday")
        }
        6 ->{
            println("Hello Saturday")
        }
        7 ->{
            println("Hello Sunday")
        }
        else ->{
            println("Error !")
        }
    }
}