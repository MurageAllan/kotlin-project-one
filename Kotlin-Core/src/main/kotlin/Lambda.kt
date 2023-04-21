data class Employees(val city : String, val age : Int)
val employees : List<Employees> = listOf(Employees("Prague", 30), Employees("Budapest", 31), Employees("Cairo", 32))


data class Heroes(val name : String, val age : Int, val gender : Gender?)
enum class Gender{
    MALE, FEMALE
}
var heroes : List<Heroes> = listOf(
    Heroes("The Captain", 39, Gender.MALE),
    Heroes("Sir Stephen", 56, Gender.MALE),
    Heroes("Frenchy", 67, Gender.FEMALE),
    Heroes("Lady Lauren", 67, Gender.FEMALE),
    Heroes("First Mate", 76, Gender.MALE),
    Heroes("The Kid", 34, null)
)




fun main() {
    var average : Double = employees.filter { it.city == "Budapest" }.map { it.age }.average()
    println(average)
    println(heroes.last().name)
    println(heroes.lastOrNull()?.gender?:"Gender is not available")
    println(heroes.firstOrNull{it.age == 30}?.name)

    println(heroes.map{it.age} // [39, 56, 67, 67, 76, 34]
        .distinct() // [39, 56, 76, 67, 34]
        .size) // 5
    println(heroes.filter { it.age > 67 }.size)

    heroes.forEach{ println(it) }

    val (youngest, oldest ) = heroes.partition { it.age < 50 }
    println(oldest.size)

    println(heroes.maxBy { it.age }?. name)

    println(heroes.all { it.age > 80 }) // false

    println(heroes.any{it.name == "The Kid"}) // true

}