fun main() {
    val person = Person("Nyamu", "Murage")

    // property access syntax refernce the props directly via their name without using getters and setters
    person.firstName
    person.lastName

    val animal = Animal("Bosco", "Rex")
    animal.firstName
    animal.lastName

    // Calling the primary constructor
    Machine(4, "Eng. Moses Kuria").run()
    println("\n")
    // calling the secondary constructor
    Machine().run()


}