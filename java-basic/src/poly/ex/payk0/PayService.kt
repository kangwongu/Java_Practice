package poly.ex.payk0


class PayService {

    // 스프링에서는 빈으로 주입받을 값들
    private val pays = mutableListOf(ApplePay(), KakaoPay(), NaverPay(), SamsungPay(), TossPay())

    fun processPay(option: String, amount: Int) {
        var result = false
        println("결제를 시작합니다: option=$option, amount=$amount")

        for (pay in pays) {
            if (pay.isSupport(option)) {
                result = pay.pay(amount)
            }
        }

        if (result) {
            println("결제가 성공했습니다.")
        } else {
            println("결제 수단이 없습니다.")
            println("결제가 실패했습니다.")
        }

    }

    fun processPay2(option: String, amount: Int) {
        println("결제를 시작합니다: option=$option, amount=$amount")
        val pay = PayStore.findPay(option)
        val result = pay.pay(amount)

        if (result) {
            println("결제가 성공했습니다.")
        } else {
            println("결제가 실패했습니다.")
        }

    }
}