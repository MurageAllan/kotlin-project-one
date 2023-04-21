import java.lang.StringBuilder

fun String.lastChar() = this[this.length-1] // this refers to the String obj
var s = "abc"


fun String.repeat(i : Int): String{
    val sb = StringBuilder( i * length)
    for(i in 1..i){
        sb.append(this)
    }
    return sb.toString()
}

open class Parent
class Child : Parent()

fun Parent.foo() = "Parent"
fun Child.foo() = "Child"

//infix fun Int.until(to : Int) = IntRange

fun main() {
    val parent : Parent = Child()
    println(parent.foo())
    val c : Char = s.lastChar()
    println(c)
    var s = "abc".repeat(4)
    println(s)
    

}