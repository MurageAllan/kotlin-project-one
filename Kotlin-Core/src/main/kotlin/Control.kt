import java.lang.Exception

fun monthOfTheYear(month: String = "March"): Unit {
    if (month == "Jan") {
        println("The month is January")
    } else if (month == "Feb") {
        println("The month is February")
    } else if (month == "March") {
        println("The month is March")
    } else if (month == "Apr") {
        println("The month is April")
    } else if (month == "May") {
        println("The month is May")
    } else if (month == "Jun") {
        println("The month is June")
    } else if (month == "Jul") {
        println("The month is July")
    } else {
        println("The rest of the months of the year")
    }
}
enum class Color {
    RED, GREEN, YELLOW;

    fun printColor(color: Color) : String = when (color) {
            RED -> "Red"
            GREEN -> "Green"
            YELLOW -> "Yellow"
        }


}
fun mix(c1 : Color, c2 : Color){
    when(setOf(c1 , c2)){
        setOf(Color.RED, Color.YELLOW) -> "ORANGE"
        setOf(Color.GREEN, Color.RED) -> "INDIGO"
        setOf(Color.YELLOW, Color.GREEN) -> "PURPLE"
        else -> throw Exception("Dirty colour")
    }
}
fun respondToInput(input : String) = when(input){
    "Y" , "Yes" -> println("I am glad you agreed")
    "N","No" -> println("Sorry to hear that")
    else -> println("I don't understand you.")
}


fun main() {
    var num1 = 56
    var num2 = 67
    var result = if(num1 > num2) "$num1 is greater than $num2" else "$num1 is less than $num2"
    monthOfTheYear("Dec")
    println(result)
    respondToInput("Yes")
    println(mix(Color.RED, Color.YELLOW))

}