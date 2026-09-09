package weeks.week3;

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