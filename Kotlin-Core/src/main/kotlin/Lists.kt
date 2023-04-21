val soccerTeams = listOf("Real Madrid", "Man city", "Barcelona", "Man utd", "Arsenal", "Chelsea")
val soccerTeam = mutableListOf("Gor mahia", "KCB", "Tusker", "Afc Leopards", "Western Stima")
val banksAcc = mutableListOf("KCB", "Equity", "Barclays", "DTB", "Standard Chartered", "Family Bank")
val phone : MutableList<String> = mutableListOf("Nokia", "Samsung", "Iphone", "Tecno", "Alcatel")
val courses : List<Any> = listOf(8, 9, "Medicine", "Mathemetics")

fun bankAccounts(accountOwner: String, listOfBankAccs: MutableList<String>) {
    listOfBankAccs.add("ABSA")
    listOfBankAccs.forEach { banks -> println("$banks the owner of this bank account is $accountOwner") }

}

// We can twist the above function to achieve some flexibility in that on pass one param instead of two
// The vararg enable the parameters to be treated as an array.
// The below function also enables us to pass 0, 1 or no argument during function call.
fun bankAccounts(accountOwner: String, vararg listOfBankAccs: String) {
    listOfBankAccs.forEachIndexed { indexOfAcc, bank -> println("$bank the owner is $accountOwner and the bank is index $indexOfAcc") }
}
fun phoneDetails(phones: MutableList<String> = phone, index : Int = 67){
    phones.add("Iphone")
    phones.add("Nokia")
    phones.add("Samsung")
    phones.add("Readmi")

    phones.forEach{phone -> println("$phone and has index $index") }
    println("\n")
    println(phones[0])
    println(phones.set(0,"Huawei"))
    println(phones.size)
    println(phones.contains("Nokia"))
    println(phones.isEmpty())
    println(phones.subList(0,2))
    println(phones.remove("Readmi"))
    println(phones.drop(1))
}
fun main() {
    println(soccerTeams[0])
    println(soccerTeams[3])

    println("\n")

    soccerTeams.forEach { teams -> println(teams) }

    println("\n")

    for (teams in soccerTeams) {
        println(teams)
    }

    println("\n")

    soccerTeams.forEachIndexed { index, teams -> println(" team $teams : index $index") }

    println("\n")

    soccerTeam.add("Sony suagar")
    soccerTeam.add("Kariobangi sharks")

    soccerTeam.forEach { teams -> println(teams) }

    println("\n")

    bankAccounts("Eng. Nyamu Murage", banksAcc)
    println("\n")
    bankAccounts("Dkt. Don Kipkorir", "Diamond Trust", "Chase Bank", "Absa", "Bank of Kenya")

    println("\n")
    phoneDetails()

}


