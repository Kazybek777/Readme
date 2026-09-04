package weeks.week3;

public class Week3 {

    public static void main(String[] args) {

        Car car =  Car.create();/*new Car(
                "Toyota",
                "Camry",
                2024,
                220,
                FuelType.PETROL,
                4
        );*/

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
        System.out.println();
        car.start();
        car.move();
        car.stop();
        car.openDoors();
        car.refuel(5);

        System.out.println();

        System.out.println("bus");
        bus.showInfo();
        bus.start();
        bus.move();
        bus.openDoors();
        bus.refuel(100);

        System.out.println();

        System.out.println("elec CAR");
        electricCar.showInfo();
        electricCar.start();
        electricCar.move();
        electricCar.charge(30);
        electricCar.stop();

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
