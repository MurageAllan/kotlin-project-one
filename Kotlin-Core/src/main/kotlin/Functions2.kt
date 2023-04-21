fun calculateAge(yearBorn: Int, curentYear: Int): Int {
    return curentYear - yearBorn
}

// re-factor the above code
fun calculateAges(yearBorn: Int, currentYear: Int): Int = currentYear - yearBorn


fun sayGreet(greet: String){
    var message = "I am greeting people in my indigenous language"
    println("$message $greet")
}
// re-factor the above code
fun sayGreets(greet: String) = println("I am greeting people in my indigenous language $greet")


fun main() {
    println("My current age is ${calculateAge(2000, 2022)}")
    println("My parent's age is ${calculateAges(1979, 2022)}")
    sayGreet("Wacha")
    sayGreets("Niatea")
}