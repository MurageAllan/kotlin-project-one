var people = arrayOf("nyamu", "james", "kamau", "Ian")
var years = arrayOf<Int>(56, 336, 372, 322)
var peopleAge = arrayOf("Don", "Dbk", "Ivy", "Muthoni", 98, 32, 0.87, false, )

var ages : IntArray = intArrayOf(67,22,72,89,65,90,56,21)

fun main() {

    years[1] = 67
    people.set(0, "John")
    var num = ages.get(2)

    println(num)

    for(element in people){
        println(element)
    }
    println("\n")
    for(element in years){
        println(element)
    }
    println("\n")
    for(index in 0..3){
        println(people[index])
    }
}