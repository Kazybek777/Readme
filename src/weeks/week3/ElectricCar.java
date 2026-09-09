package weeks.week3;

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
