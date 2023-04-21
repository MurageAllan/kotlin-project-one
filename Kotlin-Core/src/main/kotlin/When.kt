const val hobby = "hiking"


fun main() {
    var number = 6
    var numberProvided = when (number){
        1 -> "number is one"
        2 -> "number is two"
        3 -> "number is three"
        4 -> "number is four"
        5 -> "number is five"
        6 -> "number is six"
        else -> "no invalid number"
    }
    println("your provided number is $numberProvided")
    when (hobby) {
        null -> println("No hobby specified")
        else -> println(hobby)
    }
}
