fun main() {
    val coach = RealMadrid()
    RealMadrid(currentYear = 2022, debutCoachingYear = 2002)

    println("\n")

    coach.clubsCoached()

    println("\n")

    println(coach.topPlayersCoached())

    println("\n")

    coach.homeDetails()

    println("\n")

    println(coach.nickName)

    println("\n")

    coach.age = 34
    println(coach.age)

    println("\n")
    coach.firstName = "Moses"
    println(coach.firstName)

    println("\n")

    coach.countriesCoached.forEach{country -> println(country) }
}