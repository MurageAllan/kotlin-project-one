class FancyInfoProvider : BasicInfoProvider() {

    override val sessionIdPrefix: String
        get() = "Fancy Info provider"


    override val providerInfo: String
        get() = "FancyInfoProvider"

    override fun getSessionInfo(): String {
        println("Additional fancy session info")
        return super.getSessionInfo()

    }

    override fun getHomeDetails() {
        super.getHomeDetails()
    }

    override fun printInfo(person: Person) {
       super.printInfo(person)
    }


}