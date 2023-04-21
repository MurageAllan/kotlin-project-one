open class Bird{
    open val color : String = "Black"
    open val age: Int = 5

    open fun fly(){
        println("The bird fly's so fast")
    }

}

interface Animals{
    fun fly (){
        println("Animal is flying")
    }
}


class Parrot : Bird(), Animals{
    override val age: Int
        get() = 4

    override val color: String
        get() = "white"

    override fun fly() {
        super<Bird>.fly()
        super<Animals>.fly()
    }
}

fun main() {
    val parrot = Parrot()
    println( parrot.color )
    parrot.fly()
}