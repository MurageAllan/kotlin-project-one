interface LivingThings{
    var scientificName: String // abstract by default
    var scientificGroup : String
    fun breath() // abstract by default
    fun die(): String

    fun locomote(){
        print("Some living things specifically animals do locomote")
    }
}

interface NonLivingThings{
    fun locomote(){
        println("All non living things like stones don't locomote")
    }
}
abstract class Plants {
    abstract var name: String
    abstract var age: Int
    var height: Int? = null
    var girth: Int? = null

    open fun grow(): String {
        return "The plant grows at a very fast rate"
    }

    open fun reproduce() {
        println("The plant reproduces after every six months")
    }

    abstract fun wither()

    abstract fun germinate()

}

class Maize(override var name: String, override var age: Int) : Plants(), LivingThings, NonLivingThings {

    override var scientificGroup: String
        get() = TODO("Not yet implemented")
        set(value) {}

    override var scientificName: String
        get() = "Duck-Billed-platypus"
        set(value) {}


    override fun wither(){
        println("The plant withers after seven months")
    }

    override fun germinate() {
        println("The plant germinates after 2 weeks")
    }

    override fun reproduce() {
        super.reproduce()
    }

    override fun breath() {
        println("All living things do breath")
    }

    override fun die(): String {
        return "Living things do die at some point"
    }

    override fun locomote() {
        TODO("Not yet implemented")
    }


}

fun main() {
    val maize = Maize("kikamba", 3)
    maize.reproduce()
    maize.height = 8
    println(maize.height)
    maize.locomote()
    println("\n")
    println(maize.scientificName)
}