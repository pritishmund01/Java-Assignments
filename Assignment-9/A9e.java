class Vehicle {
    String make;
    String model;
    double fuel;
    Vehicle(String make, String model, double fuel) {
        this.make = make;
        this.model = model;
        this.fuel = fuel;
    }
    void fuelEfficiency() {
        System.out.println("Fuel Efficiency Calculation");
    }
    void distanceTravelled() {
        System.out.println("Distance Travelled");
    }
    void maxSpeed() {
        System.out.println("Maximum Speed");
    }
}

class Truck extends Vehicle {
    Truck(String make, String model, double fuel) {
        super(make, model, fuel);
    }
    void fuelEfficiency() {
        System.out.println("Truck Fuel Efficiency: 8km/l");
    }
    void distanceTravelled() {
        System.out.println("Truck Distance: 400km");
    }
    void maxSpeed(){
	System.out.println("Truck Maximum Speed: 100km/h");
    }
}

class Car extends Vehicle {
    Car(String make, String model, double fuel) {
        super(make, model, fuel);
    }
    void fuelEfficiency() {
        System.out.println("Car Fuel Efficiency: 18km/l");
    }
    void distanceTravelled() {
        System.out.println("Car Distance: 500km");
    }
    void maxSpeed(){
	System.out.println("Car Maximum Speed: 180km/h");
    }
}

class Motorcycle extends Vehicle {
    Motorcycle(String make, String model, double fuel) {
        super(make, model, fuel);
    }
    void fuelEfficiency() {
        System.out.println("Motorcycle Fuel Efficiency: 45km/l");
    }
    void distanceTravelled() {
        System.out.println("Motorcycle Distance: 300km");
    }
    void maxSpeed() {
        System.out.println("Motorcycle Maximum Speed: 120km/h");
    }
}

class main {
    public static void main(String[] args) {
        Car c = new Car("Maruti", "Shift", 30 );
        System.out.println(c.make);
        System.out.println(c.model);
        c.fuelEfficiency();
        c.distanceTravelled();
        c.maxSpeed();
    }
}
