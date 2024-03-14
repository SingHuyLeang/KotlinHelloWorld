package exceptions_kt

import kotlin.math.log

fun main(args: Array<String>) {
    print("Input : ");
    val number:Int = try {
        readln().toInt()
    }catch (e:NumberFormatException){0}
    println(number)

}