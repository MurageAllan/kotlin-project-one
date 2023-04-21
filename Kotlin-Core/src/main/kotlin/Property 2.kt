var firstName : String = "Nyamu"
    set(value) {
        println("The value is $field -> $value")
        field = value
    }
    get() {
        return field
    }

class Rectangle(val length : Int, val height : Int){
    var isSquare : Boolean
        get() {
            return height == length
        }
        set(value) = Unit
}

fun main() {
    var rec = Rectangle(7, 8)
    println(rec.isSquare)
    firstName = "James"
    println(firstName)
}