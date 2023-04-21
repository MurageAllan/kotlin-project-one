class Calculator {
    var foo1 :Int = run {
        println("Calculating the lambda answer")
        return@run 48
    }


    var foo2: Int = 0
        get() {
            println("Calculating the getter value")
            return 42
        }
        set(value) {
            println("The value is $field -> $value")
            field = value
        }

    var foo3: Int = 0
        set(value) {
            println("The field $field has been assigned $value")
            field = value
            println("Setter is called when there is assignment")
        }
        get() {
            println("Getter is called when there is no assignment")
            return field
        }
    // In java the above syntax is
    // public void setFoo3(int foo3){
    //      this.foo3 = foo3;
    // }
    // public int getFoo3(){
    //      return foo3;
    // }

    var foo4 : Int

    init {
        foo4 = 56
        println("running init function")
    }


}

fun main() {
    var calculator = Calculator()
    calculator.foo3 = 67 // The setter is called
    calculator.foo3 // The getter is called
    //println("${Calculator().foo1} ${Calculator().foo2} ${Calculator().foo2}")
}