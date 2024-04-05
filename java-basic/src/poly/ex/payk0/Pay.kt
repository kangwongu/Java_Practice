package poly.ex.payk0

interface Pay {
    fun isSupport(option: String): Boolean
    fun pay(amount: Int): Boolean
}