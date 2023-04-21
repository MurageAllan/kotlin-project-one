enum class Days {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}

fun printDays(day: Days): String {
    lateinit var days: String


    when (day) {
        Days.MONDAY -> days = "Monday"
        Days.TUESDAY -> days = "Tuesday"
        Days.WEDNESDAY -> days = "Wednesday"
        Days.THURSDAY -> days = "Thursday"
        Days.FRIDAY -> days = "Friday"
        Days.SATURDAY -> days = "Saturday"
        Days.SUNDAY -> days = "Sunday"
        else -> {
            "Not a valid day"
        }
    }
    return days
}

enum class Colors(val r : Int, val g : Int, val b : Int){
    RED(255, 0, 0),
    BLUE(0, 0, 255),
    GREEN(0, 255, 0);

    fun rgb() = (r * 256 + g) * 256 + b
}

fun main() {
    println(Colors.BLUE.rgb())
    println(printDays(Days.SATURDAY))
}