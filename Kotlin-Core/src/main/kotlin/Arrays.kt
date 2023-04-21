val hobbies = arrayOf("Watching soccer", "Comic books", "Playing soccer", "Gate-aways", "Hiking")

fun myHobbies(name: String, vararg enteredHobbies: String) {
    enteredHobbies.forEach { hobby -> println("My name is $name and my hobbies are $hobby") }
}

fun main() {

    println("The size of the array is ${hobbies.size} ")
    println("The first element in the array is ${hobbies[0]}")

    for (hobby in hobbies) {
        println(hobby)
    }
    println("\n")
    hobbies.forEach { hobby ->
        println(hobby)
    }
    println("\n")
    hobbies.forEachIndexed { _, hobby -> println("Hobby is $hobby and is index ") }

    println("\n")

    // To pass an array of an existing array object use the spread operator (*)
    myHobbies("Nyamu", *hobbies)

}