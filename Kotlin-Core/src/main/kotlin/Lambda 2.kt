data class Hero(val name : String, val age : Int, val sex : Sex?)
enum class Sex{
    MALE, FEMALE
}
var heroe : List<Hero> = listOf(
    Hero("The Captain", 39, Sex.MALE),
    Hero("Sir Stephen", 56, Sex.MALE),
    Hero("Frenchy", 67, Sex.FEMALE),
    Hero("Lady Lauren", 67, Sex.FEMALE),
    Hero("First Mate", 76, Sex.MALE),
    Hero("The Kid", 34, null)
)




fun main() {
    val mapByAge : Map<Int, List<Hero>> = heroe.groupBy { it.age }
    val (age, group) = mapByAge.maxBy { (_, group) -> group.size } !!
    println(age)

    val mapByName : Map<String, Hero> = heroe.associateBy { it.name }
    println(mapByName)
    val years = mapByName["Frenchy"]?.age
    println(years)


    val mapByNames = heroe.associate { it.name to it.age }
    println(mapByNames)
    mapByNames.getOrElse("unknown"){0}
}