package collection_kt.set_kt

import java.util.Scanner
import kotlin.time.Duration

class Product(){
//    Data member as default constructor
    private var id:Int = 0
    private var name:String = "empty"
    private var qty:Int = 0
    private var price:Double = 0.0
//    optional
    private val scan = Scanner(System.`in`)
//    property
    fun getId():Int{
        return id
    }
    fun getPrice():Double{
        return price
    }
//    Method
    fun add(){
        print("Enter id         -> ");id = scan.nextInt()
        print("Enter name       -> ");name = scan.next()
        print("Enter qty        -> ");qty = scan.nextInt()
        print("Enter price      -> ");price = scan.nextDouble()
    }
    fun header(){
        println("Id\tName\tQty\tPrice")
    }
    fun show(){
        println("$id\t$name\t$qty\t$price")
    }
}

fun main() {
    val mutableSet: MutableSet<Product> = mutableSetOf()
    var n:Int
    var op:Int
    val scan = Scanner(System.`in`)

    do {
        println(
            """
            1. Add      2. Output       3. Search   4. Update   5. Remove
            6. Sort     7. cash money   8. Clear    9. Exit
            """.trimIndent())
        print("Please choose option : "); op = scan.nextInt()
        when(op){
            1 -> {
                print("Enter number of product to add -> "); n = scan.nextInt()
                for (i in 0..<n){
                    val product = Product()
                    product.add()
                    mutableSet.add(product)
                }
            }
            2 -> {
                if (mutableSet.isNotEmpty()){
                    Product().header()
                    mutableSet.forEach { product ->  product.show()}
                }else{
                    System.err.println("Don't Have Data in Collection")
                }
            }
            3 -> {
                if (mutableSet.isNotEmpty()){
                    print("Enter product id for search : "); val id = scan.nextInt()
                    var check = false
                    mutableSet.forEach { product ->
                            if (id == product.getId()) {
                                if (!check) product.header()
                                product.show()
                                check = true
                            }
                    }
                    if (check) println("\u001B[32mProduct Search Found\u001B[0m")
                    else System.err.println("Search not found")
                }else{
                    System.err.println("Don't Have Data in Collection")
                }
            }
            4 -> {
                if (mutableSet.isNotEmpty()){
                    print("Enter product id for update : "); val id = scan.nextInt()
                    var check = false
                    mutableSet.forEach { product ->
                        if (id == product.getId()) {
                            product.add()
                            check = true
                        }
                    }
                    if (check) println("\u001B[32mProduct Updated Successfully\u001B[0m")
                    else System.err.println("Search not found")
                }else{
                    System.err.println("Don't Have Data in Collection")
                }
            }
            5 -> {
                if (mutableSet.isNotEmpty()){
                    print("Enter product id for remove : "); val id = scan.nextInt()
                    val check = mutableSet.removeIf{product-> product.getId() == id}
                    if (check) println("\u001B[32mProduct Removed Successfully\u001B[0m")
                    else System.err.println("Search not found")
                }else{
                    System.err.println("Don't Have Data in Collection")
                }
            }
            // Inside the sorting option (case 6)
            6 -> {
                print("Sort Order (1 for Ascending, 2 for Descending): ")
                val sortOrder = scan.nextInt()

                val sortedSet = when (sortOrder) {
                    1 -> mutableSet.sortedWith(compareBy { it.getPrice() }).toMutableSet() // Ascending order
                    2 -> mutableSet.sortedWith(compareByDescending { it.getPrice() }).toMutableSet() // Descending order
                    else -> {
                        System.err.println("Invalid Sort Order")
                        mutableSet
                    }
                }

                // Print the sorted set
                Product().header()
                sortedSet.forEach { product -> product.show() }
            }
            7->{
                // total
                var amount:Double = 0.0
                var cashReceive:Double = 0.0
                var cashReturn:Double = 0.0
                mutableSet.forEach { amount+=it.getPrice() }
                println("""
                    1. Dollar  = $ $amount
                    1. រៀល    = ៛ ${amount*4100}
                """.trimIndent())
                // Chose pay by
                print("Pay by (1. Dollar , 2. រៀល) -> "); val payBy = scan.nextInt()

                    // input
                    if (payBy == 1){
                        while (true){
                            print("Enter your cash receive : "); cashReceive = scan.nextDouble()
                            if (cashReceive < amount) {
                                System.err.println("Your balance is low !")
                            } else {
                                cashReturn = cashReceive - amount
                                if (cashReturn > 0) {
                                    print("Your Cash Return = $ $cashReturn")
                                }
                                break
                            }
                        }
                    }else if (payBy == 2){
                        while (true){
                            print("សូមបញ្ចូលទឹកប្រាក់ : "); cashReceive = scan.nextDouble()
                            if (cashReceive < amount * 4100) {
                                System.err.println("ទឹកប្រាក់របស់អ្នកមិនគ្រប់គ្រាន់ !")
                            } else {
                                cashReturn = cashReceive - amount * 4100
                                if (cashReturn > 0) {
                                    print("ទឹកប្រាក់នៅសល់របស់អ្នក = ៛ $cashReturn")
                                }
                                break
                            }
                        }
                    }else{
                        println("Invalid Cash Order")
                    }
            }
            8 -> mutableSet.clear()
        }
    }while (op!=9)
}