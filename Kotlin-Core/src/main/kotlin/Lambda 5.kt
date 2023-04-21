fun containZero(list : List<Int>): Boolean{
    list.forEach{if(it == 0) return true}
    return false
}

fun duplicateNonZero(list : List<Int>) : List<Int>{
    return list.flatMap { it -> if(it == 0)  return@flatMap listOf<Int>() else{
        listOf(it , it) }}
}
fun main() {
    println(containZero(listOf(8,7,0)))
}