internal open class City( name : String){
    var weather : String? = "sunny"
    var height : Int? = null

    init{
        println("name is $name")
    }
    fun livelihood(){
        println("Majority of the people get their livelihood from farming")
    }

    open fun lifeExpectancy(): String {
        return "Majority of the population's life expectancy is above fifty"
    }
}

internal class MajorCity : City("Nairobi") {

}

internal class MinorCity : City("Kisumu"){
    override fun lifeExpectancy(): String {
        return super.lifeExpectancy()
    }
    fun printAtmosphere(): String{
        var atm = super.weather
        return "The atmosphere of the city is $atm"
    }
}

fun main() {
    val minor = MinorCity()
    val city = City("Lagos")
    minor.livelihood()
    println(minor.printAtmosphere())
}