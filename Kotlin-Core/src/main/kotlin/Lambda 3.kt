import kotlin.math.pow

var sum = { x : Int, y : Int -> x+y}
var sum2 : (Int, Int) -> Int = {x , y -> x+ y}
var string = {s1 : String, s2 : String -> s1.uppercase() + s2.lowercase()}
val isEven : (Int) -> Boolean = {i -> i % 2 == 0}
fun isEven(i : Int): Boolean = i % 2 == 0
val f : (() -> Int)? = null

var num1 = listOf(1, 2, 3, 4, 5, 6, 7, 8)


fun main() {
    var bool : Boolean = num1.any(isEven) // true
    println( num1.filter(isEven)) // [even numbers]
    println(num1.filter(::isEven))
    println(bool)
    println(sum(7, 9))
    println(sum2(8, 7))
    println(string("Nyamu", "Murage"))
    run { println("My name is Murage Nyamu I live in Nairobi Kenya and I like it very much here") }
    run { println(3.0.pow(3.0)) }

    // calling a nullable function type
    if (f != null) {
        f.invoke()
    }

    // another way to call anullable function type
    f?.invoke()
}