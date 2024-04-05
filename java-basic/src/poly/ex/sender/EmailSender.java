package poly.ex.sender;

public class EmailSender implements Sender {

    @Override
    public String toString() {
        return "메일";
    }

    @Override
    public void send(String message) {
        System.out.println("메일을 발송합니다: "+message);
    }
}
