interface Students{
    val firstName: String
    val lastName: String
    val age: Int
    val grade: Char

    fun run(){
        println("Students in this school move by running")
    }

    fun perfomance(){
        println("The students are always perfoming very well")
    }

    fun rank()

    fun hobbies()
}

interface Staff{
    val name: String
    val age: Int
    val residence: String

    fun hobbies()

    fun experience()

    fun perfomance(){
        println("The staff are always perfoming very well.")
    }
}


private class People: Staff, Students{
    override val age: Int
        get() = 21
    override val firstName: String
        get() = "Achieng"
    override val lastName: String
        get() = "Aneko"
    override val grade: Char
        get() = 'A'
    override val name: String
        get() = "Achieng Aneko"
    override val residence: String
        get() = "Machakos"

    override fun hobbies() {
        println("")
    }

    override fun rank() {
        TODO("Not yet implemented")
    }

    override fun experience() {
        TODO("Not yet implemented")
    }

    override fun run() {
        super.run()
    }

    override fun perfomance() {
        super<Staff>.perfomance()
        super<Students>.perfomance()
    }
}

fun main() {

}