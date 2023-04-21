// assigning and re-assigning values conditionally
var music = "reggae"
var musicToPrint = if (music != null) "I love $music music " else "Afro"
fun main() {
    musicToPrint = when (music) {
        null -> "I fancy $music "
        else -> "Kenyan local"
    }
    println(musicToPrint)
}