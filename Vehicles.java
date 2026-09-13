class Vehicle{
    void start(){
        System.out.println("Vehicle starts");
    }
}

class Bike extends Vehicle {
    void start(){
        System.out.println("Bike starts");
    }
}

class Car extends Vehicle {
    void start(){
        System.out.println("Car Starts");

    }
}
public class Vehicles{
    public static void main(String args[]){
        Vehicle v;
        v = new Bike();
        v.start();

        v = new Car();
        v.start();
    }
}