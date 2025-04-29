package car;

public class Car {

    public static final String BRAND = "Toyota";
    public static String model;
    public final int horsepower;

    public Car(String model, int horsepower) {
        Car.model = model;
        this.horsepower = horsepower;
    }

    public static void brake() {
        System.out.println("The car is braking...");
    }

    public void accelerate() {
        System.out.println("The car is accelerating with " + horsepower + " horsepower.");
    }

}
