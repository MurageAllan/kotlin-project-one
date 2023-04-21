// Working with properties

class Address {

    private var name: String = "Holmes, Sherlock"
    private var street = "Baker"
    private var city: String = " London"
     private var state: String? = null
    private var zip: String = "125363"

    fun copyAddress(address: Address): Address{
        val address = Address()
        address.name
        address.street
        address.city
        address.state
        address.zip
        return address
    }


}



fun main() {
    println(Address().copyAddress(Address()))
}