package main.advanced.enharitance;

public interface Drivable {
    static void start(){
        System.out.println("Started!");
    }

    void drive(float distanceInKm);

    default void stop(){
        System.out.println("Stopped!");
    }

    }

