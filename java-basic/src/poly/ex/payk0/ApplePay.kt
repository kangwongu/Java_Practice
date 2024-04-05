package poly.ex.payk0

class ApplePay : Pay {
    override fun isSupport(option: String): Boolean {
        return option == "apple"
    }

    override fun pay(amount: Int): Boolean {
        println("애플페이 시스템과 연결합니다.")
        println("${amount}원 결제를 시도합니다.")
        return true
    }
}