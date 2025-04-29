package car;

public class Main {
    public static void main(String[] args) {

        Car.brake();

        Car myCar = new Car("Celica", 150);

        System.out.println("Brand: " + Car.BRAND);
        System.out.println("Model: " + Car.model);
        System.out.println("Horsepower: " + myCar.horsepower);

        myCar.accelerate();

    }
}
