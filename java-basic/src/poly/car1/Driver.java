package poly.car1;

public class Driver {

    // 구체화에 의존하지 않고 역할에 의존한다
    private Car car;

    public void setCar(Car car) {
        System.out.println("자동차 : " + car);
        this.car = car;
    }

    public void drive() {
        System.out.println("자동차 운전중");
        car.startEngine();
        car.pressAccelerator();
        car.offEngine();
    }
}
