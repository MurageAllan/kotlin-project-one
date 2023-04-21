open class Bike( age : Int,  name: String  ){
    val name: String
    val age: Int

    init{
        this.name = name
        this.age = age
    }
    constructor( engineer: String = "Nyamu") : this(8, "Code bike") {
        println("enginner is : $engineer")
    }
    override fun toString(): String {
        return "name is $name age is $age "
    }

}


fun main() {
    val bike = Bike(45, "Mountain bike")
    val bike2 = Bike("Eng. Sadam Hussein")
    //val bike3 = Bike()
    println(bike)
    println(bike2)
   // println(bike3)

}