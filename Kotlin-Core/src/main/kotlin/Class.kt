private class Account {

    var name: String? = null
    var id: Int? = null
    var amount: Float = 0.0F
    var serialNuber: Double = 7.8

    fun checkBalance() {
        println("To check the account balance run this function.")
    }

    fun deposit(): String {
        return "To check the latest amount deposited run this function "
    }

    fun withdraw(remainingAmount: Int = 46222, initialAmount: Int = 50000): Int {
        println("To check the withdrawn amount run this function")
        return initialAmount - remainingAmount
    }

}

fun main() {
    val account = Account()
    account.name = "KCB"
    println(account.name)

    println(account.withdraw(remainingAmount = 25000, initialAmount = 56000))

}