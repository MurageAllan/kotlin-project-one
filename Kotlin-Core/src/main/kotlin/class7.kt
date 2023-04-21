open class School{
    open fun run(){
        println("The school is running smoothly")
    }
}

abstract class DaySchool{
    abstract fun run()
}

class BoardingSchool: DaySchool(){
    override fun run() {
        println("Boarding schools run so efficiently")
    }
}

fun main() {
    School().run()
    BoardingSchool().run()


}