package function

// simple
fun double(x:Int):Int{
    return 2 * x
}

/*
Non-Return function
*/
/**
 * Non-Return non-parameter
 */
fun hello(){
    println("Hello Crush")
}
/**
 * Non-Return has-parameter
 */
fun sum(x:Int,y:Int){
    println("Sum = ${x + y}")
}
fun main() {
//     simple
    println(double(4))

    hello()
    sum(5,5)
}