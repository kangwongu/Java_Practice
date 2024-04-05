package poly.ex.pay0;

import java.util.List;

public class PayService {

    List<Pay> pays = List.of(new KakaoPay(), new NaverPay(), new ApplePay(), new SamsungPay(), new TossPay());

    public void processPay(String option, int amount) {

        boolean result = false;
        System.out.println("결제를 시작합니다: option=" + option + ", amount=" + amount);

        for (Pay pay : pays) {
            if (pay.isSupport(option)) {
                result = pay.pay(amount);
            }
        }

        if (result) {
            System.out.println("결제가 성공했습니다.");
        } else {
            System.out.println("결제 수단이 없습니다.");
            System.out.println("결제가 실패했습니다.");
        }
    }

}
