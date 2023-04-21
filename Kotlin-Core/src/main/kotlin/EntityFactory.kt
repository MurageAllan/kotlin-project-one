// A companion object is an object scoped to an instance of another class
// A companion object is similar to static declaration in java where the members declared inside the companion object belong to the class rather than the instance of the class
// functions and properties defined inside companion objects are accessible by refering to the class name
// A companion object is not inheritable
// It can inherit from another class, abstract class or implement interface

interface IdProvider{
    fun getId (): String
}
class Entity private constructor(val id: String){

    // A factory method design pattern that handles object creation using a companion.
    // The companion object has access to private instaces of the closing class
    companion object Factory : IdProvider{
        override fun getId(): String {
            return "3532"
        }
        const val ID = "id"
        fun createEntity():Entity = Entity(getId())
    }

    override fun toString(): String {
        return "id : $id"
    }


}

fun main() {

    // Accessing the companion property and method similar to how static methods and properties are accessed in java that is directly using class name
    Entity.Factory.createEntity()
    val entityId = Entity.Factory.ID
    println(entityId)
}