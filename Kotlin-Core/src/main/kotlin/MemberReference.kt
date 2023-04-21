// In Jvm you can store a lambda to a variable but to store function to a variable you have to use member reference using the possible ways showed below.
fun isOdd(i : Int): Boolean = i % 2 != 0 // a function that checks whether an int is even
val predicate1 = ::isOdd // The syntax to store a function into a variable mostly for later use
val predicate2 : (Int) -> Boolean = {i -> i % 2 != 0} // This is syntax is similar to the one directly above

class Persons(val name : String, val age : Int){
    fun isOlder(ageLimit : Int) : Boolean  = age > ageLimit
    // this is member object to which the function is bound to
    fun getAgePredicate() = this::isOlder
}



fun main() {
    val person1 = Persons("Alice", 32)
    val person2 = Persons("Ivy", 27)
    val person3 = Persons("Don", 45)
    println(person1.isOlder(40))

    // Bound reference since the function is bounded to the object
    val agePredicate1 : (Int) -> Boolean = person1::isOlder // store the isOlder() for later use
    println(agePredicate1(50))

    // Unbounded reference since the function is bounded to the class
    val agePredicate2 : (Persons, Int) -> Boolean = Persons::isOlder
    println(agePredicate2(person2, 45))

    // Bound reference
    val agePredicate3 = person3.getAgePredicate()
    println(agePredicate3(56))

    println(predicate2(6))
    println(predicate1(7))
}
