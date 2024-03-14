package array

fun main() {
    val array = IntArray(50)
    var size = 0
    var op:Int

    fun input(index:Int){
        print("Enter element of array [$index] = "); array[index] = readln().toInt()
    }

    fun output(index:Int){
        println("Element of array[$index] = ${array[index]}")
    }

    do {
        println("1. Input\t2. Output\t3. Search\t4. Update\t5. Remove")
        println("6. Insert\t7. Sort\t\t8. Add\t\t9. Clear\t10. Exit")
        print("Please choose option : "); op = readln().toInt()
        when(op){
            1 -> {
                print("Enter size of array : "); size = readln().toInt()
                for ( i in 0..<size){
                    input(i)
                }
            }
            2 -> {
                // array.indices mean catch size of array
                for (i in 0..<size){
                    output(i)
                }
            }
            3 -> {
                print("Enter element of array to search : "); val data:Int = readln().toInt()
                for (i in 0..<size){
                    if (array[i] == data){
                        output(i)
                    }
                }
            }
            4 -> {
                print("Enter element of array to update : "); val data:Int = readln().toInt()
                for (i in 0..<size){
                    if (array[i] == data){
                        input(i)
                    }
                }
            }
            5 -> {
                print("Enter element of array to remove : "); val data:Int = readln().toInt()
                for (i in 0..<size){
                    if (array[i] == data){
                        for (j in i..<size){
                            array[j] = array[j+1]
                        }
                        size--
                    }
                }
            }
            6 -> {
                print("Enter element of array to insert : "); val data:Int = readln().toInt()
                for (i in 0..<size){
                    if (array[i] == data){
                        for (j in size downTo i){
                            array[j] = array[j-1]
                        }
                        size++
                        input(i)
                        break
                    }
                }
            }
            7 -> {
                array.sortDescending() // big to small as descending
                array.sort() // small to big as ascending
                for (i in 0..<size){
                    output(i)
                }
            }
            8 ->{
                print("Enter new size of array to add : "); val newSize:Int = readln().toInt()
                for (i in size..<size+newSize){
                    input(i)
                }
                size+=newSize
            }
        }
    }while (op != 10)
}