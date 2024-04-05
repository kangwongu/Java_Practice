package poly.ex.payk0

class DefaultPay : Pay {
    override fun isSupport(option: String): Boolean {
        return false
    }

    override fun pay(amount: Int): Boolean {
        println("결제 수단이 없습니다.")
        return false
    }
}