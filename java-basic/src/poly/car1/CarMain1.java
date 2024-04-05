package poly.car1;

public class CarMain1 {

    public static void main(String[] args) {
        Driver driver = new Driver();

        // k3 선택
        K3Car k3Car = new K3Car();
        driver.setCar(k3Car);
        driver.drive();

        // model3 선택
        Model3Car model3Car = new Model3Car();
        driver.setCar(model3Car);
        driver.drive();

        // newcar 선택
        NewCar newCar = new NewCar();
        driver.setCar(newCar);
        driver.drive();
    }
}
