class Teams <T> (var name : T, var averageAge : T, var coach : T){
    override fun toString(): String {
        return "Name of the team is $name and average age of the players is $averageAge and the teams coach is $coach"
    }
}

fun <T> List<T>.firstOrNull() :T?{
    return this[size - 1]
}

fun <T : Any> List<T>.printList(){
    for(element in this){
        println(element)
    }
}

fun <T : Number?> oneHalf(value : T) : Double?{
    if(value == null) return null
    return value.toDouble() / 2.0
}

fun main() {
    var team = Teams("Real madrid", 27, "Nesta")
    var team2 = Teams("Man city", 30.0, "Arteta")
    println(team)
    println(team2)

    val ints = listOf<String>("Goat", "Cow", "Sheep", "Hen")
    println(ints.firstOrNull())
    ints.printList()
    println(oneHalf(87))
    println( oneHalf(null))
}