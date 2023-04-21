// The primary constructor.
class Person(firstName: String, lastName: String) {
    val firstName: String = firstName
    val lastName: String = lastName
    val nickName = "Shappaman"
    // initialize the above fields
    // the init block will be run anytime the instance of the class is run
//    init{
//        _firstName = firstName
//        _lastName = lastName
//    }

    fun printInfo(){
        println("My first name is $firstName and last name is $lastName and they have nick named me $nickName")
    }
}

// An alternative syntax to inialize the parameters of the constructor
class Animal(val firstName: String, val lastName: String) {

}