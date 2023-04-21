abstract class Bank{
    abstract val ceoName: String
    abstract fun interest(p: Int = 7000, r:Double = 2.5, t:Int = 3): Double
}

class KCB : Bank(){
    override val ceoName: String
        get() = "Duncan Mworia"

    override fun interest(p: Int, r: Double, t: Int): Double {
        return (p * r * t / 100)
    }
}

class Equity : Bank(){
    override val ceoName: String
        get() = "James Mwangi"

    override fun interest(p: Int, r: Double, t: Int): Double {
        return (p * r * t / 100)
    }
}

fun main() {
    val kcb:Bank = KCB()
    val equity = Equity()
    println(kcb.ceoName)
    println(equity.ceoName)
    println( Equity().interest(6000, 5.8, 4))
}