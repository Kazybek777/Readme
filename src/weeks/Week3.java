package weeks;

public class Week3 {

    public static void main(String[] args) {

        Car car = new Car(
                "Toyota",
                "Camry",
                2024,
                220,
                FuelType.PETROL,
                4
        );

        Bus bus = new Bus(
                "Mercedes",
                "Sprinter",
                2023,
                160,
                FuelType.DIESEL,
                20
        );

        ElectricCar electricCar = new ElectricCar(
                "Tesla",
                "Model 3",
                2025,
                250,
                82
        );

        System.out.println("car");
        car.showInfo();
//        System.out.println();
//        car.start();
//        car.move();
//        car.stop();
//        car.openDoors();
//        car.refuel(5);

        System.out.println();

        System.out.println("bus");
        bus.showInfo();
//        bus.start();
//        bus.move();
//        bus.openDoors();
//        bus.refuel(100);

        System.out.println();

        System.out.println("elec CAR");
        electricCar.showInfo();
//        electricCar.start();
//        electricCar.move();
//        electricCar.charge(30);
//        electricCar.stop();

        System.out.println();




        Flyable plane = new Plane(
                "Boeing",
                "737",
                2022,
                850,
                FuelType.JET_FUEL
        );

        plane.fly();

        System.out.println();


        System.out.println("Fuel: " + car.getFuelType());
        System.out.println("Type: " + TransportType.CAR);
        System.out.println("Color: " + Color.BLACK);

        System.out.println();


        System.out.println("Maximum speed: " + Transport.MAX_SPEED);

        System.out.println();


        car.printInfo();
        car.printInfo(true);
    }
}


enum FuelType {
    PETROL,
    DIESEL,
    ELECTRIC,
    JET_FUEL
}


enum TransportType {
    CAR,
    BUS,
    PLANE
}


enum Color {
    BLACK,
    WHITE,
    RED,
    BLUE
}


interface Flyable {

    void fly();
}


abstract class Transport {

    public static final int MAX_SPEED = 1000;

    private final String brand;
    private final String model;

    private int year;
    private int maxSpeed;

    private FuelType fuelType;

    public Transport(
            String brand,
            String model,
            int year,
            int maxSpeed,
            FuelType fuelType
    ) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    public abstract void move();

    public void start() {
        System.out.println(brand + " " + model + " started");
    }

    public void stop() {
        System.out.println(brand + " " + model + " stopped");
    }

    public void showInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Max speed: " + maxSpeed);
        System.out.println("Fuel: " + fuelType);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setYear(int year) {
        if (year >= 1950 && year <= 2026) {
            this.year = year;
        }
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed > 0 && maxSpeed <= MAX_SPEED) {
            this.maxSpeed = maxSpeed;
        }
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }
}


class Car extends Transport {

    private int doors;

    public Car(
            String brand,
            String model,
            int year,
            int maxSpeed,
            FuelType fuelType,
            int doors
    ) {
        super(brand, model, year, maxSpeed, fuelType);
        this.doors = doors;
    }

    @Override
    public void move() {
        System.out.println(
                getBrand() + " " + getModel() + " is driving"
        );
    }

    public void openDoors() {
        System.out.println("Doors opened: " + doors);
    }

    public void refuel(int liters) {
        if (getFuelType() == FuelType.PETROL ||
                getFuelType() == FuelType.DIESEL) {

            System.out.println(
                    "Refueled: " + liters + " liters"
            );
        } else {
            System.out.println("This transport does not use fuel");
        }
    }

    public void printInfo() {
        System.out.println(
                getBrand() + " " + getModel()
        );
    }

    public void printInfo(boolean detailed) {
        if (detailed) {
            showInfo();
        }
    }

    public void printInfo(String title) {
        System.out.println(title);
        showInfo();
    }
}


class Bus extends Transport {

    private int passengerCapacity;

    public Bus(
            String brand,
            String model,
            int year,
            int maxSpeed,
            FuelType fuelType,
            int passengerCapacity
    ) {
        super(brand, model, year, maxSpeed, fuelType);
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public void move() {
        System.out.println(
                getBrand() + " " + getModel() + " is driving with passengers"
        );
    }

    public void openDoors() {
        System.out.println("Bus doors opened");
    }

    public void refuel(int liters) {
        System.out.println(
                "Bus refueled: " + liters + " liters"
        );
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }
}


final class ElectricCar extends Transport {

    private int battery;

    public ElectricCar(
            String brand,
            String model,
            int year,
            int maxSpeed,
            int battery
    ) {
        super(
                brand,
                model,
                year,
                maxSpeed,
                FuelType.ELECTRIC
        );

        this.battery = battery;
    }

    @Override
    public void move() {
        System.out.println(
                getBrand() + " " + getModel() + " is driving"
        );
    }

    public void charge(int percent) {
        if (percent > 0 && percent <= 100) {
            System.out.println(
                    "Battery charged: " + percent + "%"
            );
        }
    }

    public int getBattery() {
        return battery;
    }
}


class Plane extends Transport implements Flyable {

    public Plane(
            String brand,
            String model,
            int year,
            int maxSpeed,
            FuelType fuelType
    ) {
        super(brand, model, year, maxSpeed, fuelType);
    }

    @Override
    public void move() {
        System.out.println(
                getBrand() + " " + getModel() + " is moving"
        );
    }

    @Override
    public void fly() {
        System.out.println(
                getBrand() + " " + getModel() + " is flying"
        );
    }
}
