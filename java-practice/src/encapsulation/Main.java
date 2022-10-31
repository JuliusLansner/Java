package encapsulation;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Chev", "cam", 1992);
        car.getMake();
        car.setYear(1992);
    }
}
