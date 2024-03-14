package OOPs.Extansions

class MyClass{
    companion object { }
}
fun MyClass.Companion.printCompanion(){
    println("Hello World")
}
fun main() {
    MyClass.printCompanion()
}