val lazyValue : String by lazy {
    println("Computing!")
    return@lazy "Hello"
}

lateinit var myData : String

fun main() {
    println(lazyValue)
    println(lazyValue)
}