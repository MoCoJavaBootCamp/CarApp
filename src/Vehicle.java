public class Vehicle {

    private String type;
    private String make;
    private String model;

    private String color;
    private double price;
    private int qty;

    //default constructor
    Vehicle() {
        this.type = "default type";
        this.make = "default make";
        this.model = "default model";
        this.color = "default color";
        this.price = 0.00;
        this.qty = 0;
    }

    //overloaded constructor
    Vehicle (String type, String make, String model, String color, double price, int qty) {
        this.type = type;
        this.make = make;
        this.model = model;
        this.color = color;
        this.price = price;
        this.qty = qty;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String start() {
        return String.format("The %s is starting.\n", this.type);
    }

    public String stop() {
        return String.format("The %s is stopping.\n", this.type);
    }

    public String accelerate() {
        return String.format("The %s is accelerating.\n", this.type);
    }

    public String currentSpeed(int speed) {
        return String.format("The %s is going at %d mph.\n", this.type, speed);
    }


}
