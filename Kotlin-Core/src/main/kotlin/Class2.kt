class Team {
    var teamName: String = "Real Madrid"

    // cannot access the teamName props of the outer class
    class Players {
        var playerName: String = "Modric"

        fun speed() {
            println("Modric runs at a very high speed.")
        }
    }

    // can access the teamName props of the outer class
    inner class Coaches {
        private var coachName = "Nesta"

        fun teamCoached() {
            println("$coachName is incharge of $teamName")
        }
    }
}

fun main() {
    val team = Team()
    // object creation of non-inner nested class
    val players = Team.Players()
    // object creation of inner nested class
    val coaches = Team().Coaches()

    println(team.teamName)

    println(players.playerName)

    players.speed()

    coaches.teamCoached()
}