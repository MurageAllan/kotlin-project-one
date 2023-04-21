// A primary constructor with default values
// There's no need for an empty secondary constructor when setting the args with default values
// properties in kotlin will have getters and setters generated for them automatically by the compiler.
// If the property is a val it will have a getter generated
// If it is a var it will have a getter and setter generated.
// We can define our own getters and setters explicitly and provide our own maybe complex implementation.
// ?: is called the else if operator in kotlin
class Camera(private val type: String = "Cannon", private val origin: String = "USA") {

    // defining a field in a class
    var nickName: String? = null
        // explicitly define our own setter even though it is defined implicitly.
        set(value) {
            field = value
            println("The new nickname is $value")
        }
        // explicitly define our own getter even though it is defined implicilty.
        get() {
            println("The returned value is $field")
            return field
        }

    // defining a method in class.
    fun printInfo() {
        //val nickNameToPrint = if(nickName != null) nickName else "no nickname"
        // A simplified version of the above
        val nickNameToPrint = nickName ?: "no nickname"
        println("This camera of type $type is of $origin origin and has a $nickNameToPrint nickname in Kenya")
    }

}