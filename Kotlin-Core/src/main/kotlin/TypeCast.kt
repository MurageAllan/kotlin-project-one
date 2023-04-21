fun checkingStringType() {
    val string1 = "Hello world"

    if (string1 is String) {
        val string2 = string1 as String
        val string3 = string2 as? String
        string2.uppercase()
    }
}

fun main() {
    checkingStringType()
}