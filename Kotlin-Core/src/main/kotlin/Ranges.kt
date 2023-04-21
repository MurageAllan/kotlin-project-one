fun isLetter(c :Char) = c in 'a'..'z' || c in 'A'..'Z'

fun main() {
    println(isLetter('d')) //true
}