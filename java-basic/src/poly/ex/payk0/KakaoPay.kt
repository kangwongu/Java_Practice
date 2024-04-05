package poly.ex.payk0

class KakaoPay : Pay {
    override fun isSupport(option: String): Boolean {
        return option == "kakao"
    }

    override fun pay(amount: Int): Boolean {
        println("카카오페이 시스템과 연결합니다.")
        println("${amount}원 결제를 시도합니다.")
        return true
    }
}