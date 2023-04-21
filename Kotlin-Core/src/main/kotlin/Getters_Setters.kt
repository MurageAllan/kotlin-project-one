class Getters_Setters {

    var firstName: String = ""

    var lastName: String? = null
        get() {
           return this.toString()
        }
        set(value) {
            field = value

        }

}