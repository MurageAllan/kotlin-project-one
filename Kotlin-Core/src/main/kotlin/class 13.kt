private class Computer( model: String,  manufacturer: String) {
    val make : String
    var builder : String
    init {
        make = model
        builder = manufacturer
    }

    constructor(serialNumber: Int): this("Hp", "San Microsystems"){
        println(serialNumber)
        println(make)
        println(builder)
    }

    constructor(operatingSystem : String): this(637){
        println(operatingSystem)
    }
}

fun main() {
    val computer = Computer("Dell", "ATL Labs");
    Computer(43)
    Computer("Windows")
    println("The computer is of model ${computer.make} and was manufactured by ${computer.builder}")
}