
fun printMonthsOfTheYear(monthNum:Int): String{
    var month  = ""
    when(monthNum){
        1 -> month = "January"
        2 -> month = "February"
        3 -> month = "March"
        4 -> month = "May"
        5 -> month = "April"
        6 -> month = "June"
        7 -> month = "July"
        8 -> month = "August"
        9 -> month = "September"
        10 -> month = "October"
        11 -> month = "November"
        12 -> month = "December"
        else -> {
            println("Not a valid number")
        }
    }
    return month
}

fun main() {
    println(printMonthsOfTheYear(5))
}