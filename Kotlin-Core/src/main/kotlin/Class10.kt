private data class User(var name: String = "John", var age: Int = 34) {
// This class implicitly contains : equals(), hashcode(), toString(), conponent functions that is getters and setters, copy()
}

fun main() {
    val user = User("Nyamu", 20)
    val user2 = User("Nyamu", 20)
    var user3 = User("Murage", 21)
    user3 = user2.copy()
    println(user)
    print(user == user2)
    println("value of user3 is : $user3")


}