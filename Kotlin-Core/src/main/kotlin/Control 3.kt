fun checkTheDataType(value : Any){
    when(value){
        is String -> println("value is a String")
        is Int -> println("value is a Int")
        is Double -> println("value is a Double")
        is Boolean -> println("value is a Boolean")
        is Float -> println("value is a Float")
        is Byte -> println("value is a byte")
    }
}

fun checker(x : Int) {
    var isEvens: (Int) -> Boolean = { i -> i % 2 == 0 }
    var isOdds: (Int) -> Boolean = { i -> i % 2 != 0 }
    when{
        isEvens(x) -> println("x is even")
        else -> println("x is odd")
    }

}

fun main() {
    checkTheDataType(3)
    checkTheDataType(7.90)
    checkTheDataType(6.5F)
    checker(8)
}