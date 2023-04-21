open class RealMadrid(override var firstName: String = "Jose", override val lastName: String = "Mourinho") :
    CoachInfoProvider {
    override val countryOfOrigin: String
        get() = "Portugal"


    override var age: Int?
        get() = 56
        set(value) {}


    override val nickName: String
        get() = "The special one"


    override var countriesCoached: MutableList<String>
        get() = mutableListOf("England", "Holland", "Spain")
        set(value) {}


    init {
        println("Init running")
        try {
            countriesCoached.add("Japan")
            countriesCoached.add("USA")
        }catch (e : Exception){
            println(e.message)
        }

    }

    constructor(currentYear: Int, debutCoachingYear: Int) : this("Pep", "Gurdiola") {
        var numOfYearsCoached: Int = currentYear - debutCoachingYear

        println(numOfYearsCoached)
    }


    override fun homeDetails() {
        super.homeDetails()
        println("Mourinho hails from Portugal, Lisbon")
    }

    override fun topPlayersCoached(): String {
        return "Cristiano Ronaldo is Mourinho's top player he's coached"

    }

    override fun clubsCoached() {
        super.clubsCoached()
        println("Mourinho has coached eight clubs")
    }

    override fun trophiesWon() {
        //super.trophiesWon()
        println("Mourinho has won a total of 30 trophies as a manager")
    }


}