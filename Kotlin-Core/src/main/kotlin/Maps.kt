// By default kotlin collections are immutable, you cannot add or remove things from the collections
val languages : Map<Int, String> = mapOf(1 to "Java", 2 to "C++", 3 to "C#", 4 to "Kotlin", 5 to "Python")
var computers = mapOf<Int, String>()


// To achieve mutability of the collections like map use
val lang = mutableMapOf(1 to "English", 2 to "Swahili", 3 to "German", 4 to "French", 5 to "Arabic")
fun main() {
    languages.forEach{ (key, value) -> println("The key is $key : value is $value") }

    println("\n")
    lang[8] = "Shona"
    lang.forEach{ (key, value) -> println("key is $key : value is $value")}
    println("\n")
    lang.minus(3)
    for(itr in lang.iterator()){
        println("key is ${itr.key} and value is ${itr.value}")
    }
}