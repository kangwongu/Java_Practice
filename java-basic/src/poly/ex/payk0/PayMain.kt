package poly.ex.payk0


fun main() {
    val payService = PayService()

    //kakao 결제
    val payOption1 = "kakao"
    val amount1 = 5000
    payService.processPay2(payOption1, amount1)

    //naver 결제
    val payOption2 = "naver"
    val amount2 = 10000
    payService.processPay2(payOption2, amount2)

    //잘못된 결제 수단 선택
    val payOption3 = "bad"
    val amount3 = 15000
    payService.processPay2(payOption3, amount3)

    //애플페이 선택
    val payOption4 = "apple"
    val amount4 = 20000
    payService.processPay2(payOption4, amount4)

    //토스
    val payOption5 = "toss"
    val amount5 = 40000
    payService.processPay2(payOption5, amount5)
}
