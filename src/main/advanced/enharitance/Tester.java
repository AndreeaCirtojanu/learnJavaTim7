package main.advanced.enharitance;


import org.junit.jupiter.api.Test;

public class Tester {
    @Test
    public void interface_test(){
        Car porsche= new Car("Porsche",
                2,
                "red",
                350);
        Drivable.start();
        porsche.drive(50.5f);
        porsche.stop();
        porsche.clean("Premium");


    }

    public static void main(String[] args) {
        Vehicle plane= new Vehicle("plane",
                50,
                "white",
                300);
        //System.out.println(plane.toString());
        System.out.println(plane);
        plane.info();

        Car car= new Car("Audi",
                5,
                "grey",
                220);

        System.out.println(car);
        //object <-vehicle <-car
        car.info();
        car.info("sport"); //overloading. acelasi nume alta functie
        //public
        car.color="black";
        //protected
        car.seatCapacity=4;
        //default(package)
        car.maxSpeed=300;
        //private + setter
        car.setName("Ford");
        System.out.println(car);

        car.getMessage();
        System.out.println(car.getMessage());
        System.out.println();

        //polymorphism
         Object porsche= new Car("Porsche",2,"red",350);
        ((Vehicle) porsche).info();
        ((Car) porsche).info("sport");
        System.out.println(porsche);
        System.out.println(((Car) porsche).getMessage());

        System.out.println("porsche is object: "+ (porsche instanceof Object));
        System.out.println("porsche is vehicle: "+ (porsche instanceof Vehicle));
        System.out.println("porsche is car: "+(porsche instanceof Car));











    }
}
