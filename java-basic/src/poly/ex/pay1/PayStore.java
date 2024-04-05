package poly.ex.pay1;


// 구체화를 관리하는 곳, 세부사항
// 생성을 못하도록 abstract
public abstract class PayStore {

    //결제 수단 추가시 변하는 부분
    public static Pay findPay(String option) {
        if (option.equals("kakao")) {
            return new KakaoPay();
        } else if (option.equals("naver")) {
            return new NaverPay();
        } else if (option.equals("apple")) {
            return new ApplePay();
        } else if (option.equals("toss")) {
            return new TossPay();
        } else if (option.equals("samsung")) {
            return new SamsungPay();
        } else {
            return new DefaultPay();
        }
    }

}
