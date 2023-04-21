fun main() {
    val provider = object : PersonInfoProvider{
        override val providerInfo: String
            get() = "Anonymous obj"

        override fun printInfo(person: Person) {
            println(providerInfo)
            super.printInfo(person)
        }
    }
    println(provider.providerInfo)
//    val provider2 = FancyInfoProvider()
//
//    // subclass/child class obj
//    provider2.printInfo(Person("Ivy", "Wangechi"))
//
//    println("\n")
//
//    println(provider2.getSessionInfo())

//    println("\n")
//
//    // parent class / superclass obj
//    provider.printInfo(Person("Nyamu", "Murage"))
//
//    println("\n")
//
//    println(provider.getSessionInfo())
//    println("\n")
//
//    checkType(BasicInfoProvider())
}