package loop

/**
 * Row Colum
 */
fun twoDimention(){
    val row = 5
    val colum = 10
    for (r in 1..row){
        print("\t\t\tRow$r\nColum ")
        for (c in 1..colum){
            print("$c ")
        }
        println()
    }
}

/**
 * Example meme
 */
fun example(){
    var a = 10
    var b = 1
    for (i in a downTo 1){
        for ( j in b .. a){
            print("* ")
        }
        a--
        println()
    }
}
fun main() {
//    twoDimention()
    example()
}