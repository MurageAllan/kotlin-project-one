var list = listOf<String>("BMW", "Mercedes Benz", "Audi", "Subaru", "Porshe", "Volvo")
var map = mapOf<Int, String>(1 to "Nyamu", 2 to "Allan", 3 to "Ivy", 5 to "Stacy")
var itrList : (List<String>) -> Unit = {list ->
    for(element in list){
        println(element)
    }
}
fun itrMap(map : Map<Int, String>) {
    for((key, value) in map){
        println("$key : $value")
    }
}

fun itr(i : Int) {
    for(i in 1..9){
        println(i)
    }
}

fun itr2(i: Int){
    for(i in 1 until 9){
        println(i)
    }
}

fun itr3(i : Int){
    for(i in 9 downTo 1 step 2){
        println(i)
    }
}
fun main() {
    itrList(list)
    itrMap(map)
    itr(8)
    println("\n")
    itr2(8)
    println("\n")
    itr3(9)
}