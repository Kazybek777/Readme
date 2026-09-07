package weeks.week3;

public class Plane extends Transport implements Flyable {

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
