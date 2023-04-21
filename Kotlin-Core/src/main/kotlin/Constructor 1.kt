class Contact(var name : String, var age : Int){
    constructor( school : String, company : String): this("DBK", 56){
        println("The school is $school and company is $company")
    }
    override fun toString(): String {
        return "Contact(name= $name, age= $age)"
    }


}

class Location(city: String, zipCode : Int ){
    val city : String
    val zipCode : Int
    init {
        this.city = city
        this.zipCode = zipCode
    }
    constructor(districts : String) : this("Minnesota", 637){

    }

    override fun toString(): String {
        return "Location (city = $city, zipcode = $zipCode)"
    }
}

fun main() {
    println( Contact("Allan", 21))
    println( Location("Athens", 7822))
    println(Contact("JKUAT", "Amazon"))
}