package OOPs.Generics

class Box<T> (t: T){
    val value = t
}
fun main(){
    val box : Box<String> = Box<String> ("Wooden Box")
    val store = box.value
    println("Store $store")
}