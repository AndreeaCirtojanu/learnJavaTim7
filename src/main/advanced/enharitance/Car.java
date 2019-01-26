package main.advanced.enharitance;

public class Car extends Vehicle
        implements Drivable,Cleanable {
    public Car(String name, int seatCapacity, String color, float maxSpeed) {
        super(name, seatCapacity, color, maxSpeed);
    }


    @Override
    public void info() {
        System.out.println("this is a car");
    }

    public void info(String carType) {
        System.out.println("this is a "+carType+ " car.");
    }
    @Override
    public String toString() {
        return String.join(" | ",
                "Car"
                ,getName(),
                seatCapacity+ "seats",
                color,
                maxSpeed+ "km/h");
    }
    String getMessage(){
        return "message from car";
    }

    @Override
    public void drive(float distanceInKm) {
        System.out.println("drove "+ distanceInKm+ " km");

    }


    @Override
    public void clean(String cleanType) {
        System.out.println(getName()+ " cleaned "+cleanType);

    }
}
