// A function that returns null
fun getGreet() : String? {
    return null
}

fun getGreeting(): String {
    return "Hello world"
}

// re-factor the above function
fun getGreetings(): String = "Hello kotlin"

// re-factor the above function even further.
fun getGreeted() = "Hello world"

fun sayHello(): Unit {
    println(getGreeting())
}

// re-factor the above function since Unit is now reduntant
fun sayHellos() {
    println(getGreeted())
}

fun main() {
    println(getGreeting())
    println(getGreetings())
    println(getGreeted())
    sayHello()
    sayHellos()
    getGreet()
}