package labtask3;

public class Car {
    private String make;
    private String model;
    private String color;
    private double price;
    public Car(String make, String model, String color, double price) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.price = price;
    }
    public Car(String make, String model, double price) {
        this(make, model, "Unknown", price);
    }
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Company name: " + make + ", Model: " + model + ", Color: " + color + ", Price: $" + price);
    }
}
