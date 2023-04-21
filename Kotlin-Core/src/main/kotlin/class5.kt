 open class Employee(age: Int, name: String, salary: Float) {
    val age: Int
    val name: String
    val salary: Float

    init {
        this.age = age
        this.name = name
        this.salary = salary
    }

    open fun transport(){
        println("The employee either walks or drives himself/herself to work")
    }

    open fun skill(){
        println("The employee is highly skillful")
    }
}

class SalesPerson(age: Int, name: String, salary: Float) : Employee(name= "George", age = 27, salary=7000.87F){
    override fun transport() {
        super.transport()
        println("The sales person drives to work.")
    }

    override fun skill() {
        println("The sales person is so effcient.")
    }

    fun doFieldWork(): String {
        return "Travelling is the sale's person hobby"
    }

    override fun toString(): String {
        return "The sale's person age is $age and salary is $salary and he/she is called $name"
    }
}

class Programmer(age: Int, name: String, salary: Float): Employee(name="Patrick", age=63, salary = 35262.22F){
    override fun skill() {
        super.skill()
    }

    override fun transport() {
        super.transport()
    }
    fun doProgramm(): String{
        return "Programming is the programmer's passion"
    }

    override fun toString(): String {
        return "The programmer's age is $age and name is $name he/she earns $salary"
    }
}

fun main() {
    val programmer = Programmer(53, "Nyamu", 8373.36F )
    println(programmer)
    programmer.transport()

}