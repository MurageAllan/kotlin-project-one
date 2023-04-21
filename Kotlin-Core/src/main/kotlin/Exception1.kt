import java.lang.ArithmeticException

fun divideNum(num: Int): Int {


    return try {
        num / 0
    } catch (e: ArithmeticException) {
        0
    } finally {
        println("Running...")
    }
}


fun main() {
    println(divideNum(7))
}