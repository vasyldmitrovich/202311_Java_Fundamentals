package softserve.edu06.pt;

abstract class Car {
    private String model;
    private int maxSpeed;
    private int yearOfProduction;

    public Car(String model, int maxSpeed, int yearOfProduction) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfProduction = yearOfProduction;
    }

    public abstract void run();

    public abstract void stop();

    public String getModel() {
        return model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }
}

class Truck extends Car {
    private int cargoCapacity;

    public Truck(String model, int maxSpeed, int yearOfProduction, int cargoCapacity) {
        super(model, maxSpeed, yearOfProduction);
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public void run() {
        System.out.println("Truck is running.");
    }

    @Override
    public void stop() {
        System.out.println("Truck has stopped.");
    }

    public void loadCargo() {
        System.out.println("Cargo is loaded in the truck.");
    }
}

class Sedan extends Car {
    private String bodyType;

    public Sedan(String model, int maxSpeed, int yearOfProduction, String bodyType) {
        super(model, maxSpeed, yearOfProduction);
        this.bodyType = bodyType;
    }

    @Override
    public void run() {
        System.out.println("Sedan is running.");
    }

    @Override
    public void stop() {
        System.out.println("Sedan has stopped.");
    }

    public void openTrunk() {
        System.out.println("Trunk of the sedan is open.");
    }
}

public class Main {
    public static void main(String[] args) {
        Car[] cars = new Car[3];

        cars[0] = new Truck("Truck1", 80, 2022, 5000);
        cars[1] = new Sedan("Sedan1", 120, 2021, "Sedan");
        cars[2] = new Truck("Truck2", 70, 2020, 7000);

        for (Car car : cars) {
            System.out.println("Model: " + car.getModel());
            System.out.println("Max Speed: " + car.getMaxSpeed() + " km/h");
            System.out.println("Year of Production: " + car.getYearOfProduction());

            car.run();
            car.stop();

            if (car instanceof Truck) {
                ((Truck) car).loadCargo();
            } else if (car instanceof Sedan) {
                ((Sedan) car).openTrunk();
            }

            System.out.println();
        }
    }
}
