package poly.ex.payk0



abstract class PayStore {

    companion object {
        fun findPay(option: String): Pay {
            return when (option) {
                "kakao" -> {
                    KakaoPay()
                }
                "naver" -> {
                    NaverPay()
                }
                "apple" -> {
                    ApplePay()
                }
                "toss" -> {
                    TossPay()
                }
                "samsung" -> {
                    SamsungPay()
                }
                else -> {
                    DefaultPay()
                }
            }
        }
    }
}