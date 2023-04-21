// interfaces can provide default implementations of methods
// We can provide properties in our interface as well as methods
// However property initialization is not allowed in interfaces
// classes by default are final that is cannot be inherited.
// To inherit a class add an open keyword
interface PersonInfoProvider {

    val providerInfo: String
    fun printInfo(person: Person) {
        println(providerInfo)
        person.printInfo()
    }
}

interface SessionInfoProvider {
    fun getSessionInfo(): String
}

open class BasicInfoProvider : PersonInfoProvider, SessionInfoProvider {

    protected open val sessionIdPrefix: String = "Basic session id"

    override val providerInfo: String
        get() = "BasicInfoProvider"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("Additional printing information")
    }

    override fun getSessionInfo(): String {
        return sessionIdPrefix
    }

    open fun getHomeDetails(){
        println("I am from Toronto")
    }
}


fun checkType(infoProvider: PersonInfoProvider) {
    if (infoProvider is SessionInfoProvider) {
        println("It is a session info provider")
        // we have already checked the obj
        // the as is used to cast to another type after checking the type as is not needed.
        //(infoProvider as SessionInfoProvider).getSessionInfo() instead do:
        infoProvider.getSessionInfo()
    } else {
        println("Not a session info provider")
    }
}