// val is used with immutable variables can be assigned only ones.
// var is used with mutable variables can have their values re-assigned
// variables can be top level that is declared outside enclosing functions or class by declaring them inside a kotlin file.
// To assigne a null value to a variable use a ? mark at the end of type
// var or val and mandatory in variable declaration.
// It is not a must to specify the data type because kotlin can determine what type the value is except when declaring nulls.
const val name: String = "Nyamu Murage"
public var age: Int = 7
var course = "Bsc. Mathematics and computer science"
var school: String? = null
var greeting : String = "hello"

fun main() {
    age = 8
    school = "JKUAT"
    greeting = "hi"
    println("My name is $name and I am $age years old $greeting ")
    println("I school at $school")
}