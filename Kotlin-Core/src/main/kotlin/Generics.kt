class Machines <T> constructor(var name : T){
    override fun toString(): kotlin.String {
        return super.toString()
    }
}

class CustomTriple<A : Any,B : Any, C : Any> constructor(var first : A, var second : B, var third : C){
    fun printType(){
        println("The type of first is ${first::class}")
        println("The type of second is ${second::class}")
        println("The type of third is ${third::class}")
    }
}

fun main() {
    val machine : Machines<String> = Machines("Desktop")
    val machine2 :Machines<Int> = Machines(6)
    var customTriple = CustomTriple<Int, String, Boolean>(3, "hello", false)
    customTriple.printType()
    println(machine.name)
}