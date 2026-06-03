class Vehicle {
    public void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle {
   // @Override
    public void start() {
        System.out.println("Car starts with a key");
    }
}

class Bike extends Vehicle {
    //@Override
    public void start() {
        System.out.println("Bike starts with a self-start button");
    }
}

class Bus extends Vehicle {
    //@Override
    public void start() {
        System.out.println("Bus starts with a heavy engine");
    }
}

public class Override1 {
    public static void main(String[] args) {
        Car c = new Car();
        Bike b = new Bike();
        Bus bs = new Bus();

        c.start();
        b.start();
        bs.start();
    }
}