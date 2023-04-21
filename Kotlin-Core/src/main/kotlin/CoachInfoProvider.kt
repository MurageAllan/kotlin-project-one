interface CoachInfoProvider {

    var firstName: String
    val nickName: String
    val lastName: String
    var age: Int?
    val countryOfOrigin: String
    var countriesCoached: MutableList<String>


    fun clubsCoached() {
        println("The coach has coached quite a number of clubs the real no will be given in the implementing classes")
    }

    fun homeDetails() {
        println("The coach's country of origin is $countryOfOrigin")
    }

    fun topPlayersCoached(): String {
        return "The coach has coached quite a number a number of top players the real figure will be given in the implementing classes."
    }

    fun trophiesWon() {
        println("The coach has won several accolades the real figure will be given in the implementing classes.")
    }
}