// The two paramters passed in the primary constructors are read and write
class Car constructor(val name: String, val age: Int) {

    override fun toString(): String {
        return "name: $name , age: $age"
    }
}

fun main() {
    val car = Car("Mercedes Benz", 43)
    println(car)
}