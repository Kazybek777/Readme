package weeks.week3;

abstract class Transport {
    int y;
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

