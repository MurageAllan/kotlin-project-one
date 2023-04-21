val String.lastIndex : Int
    get() {
        return this.length - 1
    }

val String.indices : IntRange
    get() {
        return 0..this.lastIndex
    }

fun main() {
    var word = "abcdef"
    println(word.lastIndex)
    println(word.indices)
}