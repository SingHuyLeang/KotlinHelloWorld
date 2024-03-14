package OOPs.Basic_Syntax

// Simple class with primary constructor
class Test(x:Int,y:Int){
//    .also are mean while you compile the class it auto has action
    val firstProperty  = "x = $x".also(::println)
    val secondProperty = "y = $y".also(::println)
//    init is a function/method that initialize like setState() method in flutter
    init {
        println("First Property initialize block that print : $x and $y")
    }
}

fun main() {

    Test(10,20)
}