// Define the primary constructor
class Machine(private val age: Int, private val engineer: String) {

    fun run(): Unit{
       println("The machine is running")
    }
    // The init blocks will always run before the secondary constructor.
    // They will execute in order in which they are defined.
    init {
        println("Init 1")
        println("The machine is $age years old and was manufactured by $engineer")
    }

    // Define a secondary constructor
    // In most projects secondary constructors are not always necessary because of the power of the default parameter values.
    constructor() : this(3, "Eng. Nyamu Murage") {
        println("Secondary constructor")
    }

    init {
        println("Init 2")
    }
}