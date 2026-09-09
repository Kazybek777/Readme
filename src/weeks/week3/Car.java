package weeks.week3;

class Car extends Transport {

    private int doors;

    private Car(
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

    public static Car create(){
        return new Car(null ,null, 0, 0, null, 0);
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
