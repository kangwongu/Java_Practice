package poly.ex.pay0;

public class TossPay implements Pay {

    @Override
    public boolean isSupport(String option) {
        return option.equals("toss");
    }

    @Override
    public boolean pay(int amount) {
        System.out.println("토스페이 시스템과 연결합니다.");
        System.out.println(amount + "원 결제를 시도합니다.");
        return true;
    }
}
