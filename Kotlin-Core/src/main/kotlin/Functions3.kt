fun sayCheese(firstName:String, lastName:String ){
    println("$firstName $lastName say cheese!")
}

// function with default value
fun sayHurray(firstName: String = "Allan", lastName: String = "Nyamu", msg:String = "say hurray"){
    println("$firstName $lastName $msg")
}


fun main() {
    // named args
    sayCheese(firstName = "Nyamu", lastName = "Murage")

    println("\n")

    // call the fun with default values
    sayHurray()

    println("\n")

    // call the function without default value
    sayHurray(firstName = "DBK", lastName = "Kipkorir", msg = "Say Hurray!")
}