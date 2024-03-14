package loop

/**
 * While loop with array
 */
fun whileLoopWithArray(){
    val cars = arrayOf("BMW","NISSAN","TOYOTA","MAZDA")
    var i = 0 ;
    while ( i < cars.size ){
        println(cars[i])
        i++
    }
}

/**
 * While loop with list
 */
fun whileLoopWithList(){
    val number = listOf<Int>(1,2,3,4,5,6,7,8,9,10)
    var index = 0
    while (index < number.size){
        print("${number[index]} ")
        index++
    }
}

/**
 * Main function is run your codes
 */
fun main() {
    whileLoopWithArray()
    whileLoopWithList()
}