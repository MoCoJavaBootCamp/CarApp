public class CarApp {
    public static void main(String[] args) {
        Car myCar = new Car("Andrew");
        myCar.setYear(2020);
        myCar.setMake("Volkswagon");
        myCar.setModel("Jetta");
        myCar.setColor("Gray");
        myCar.setPrice(20000.00);
        myCar.setQty(1);
        myCar.setFeatures("GPS");
        myCar.setFeatures("automatic headlights");

        Car bobsCar = new Car("Bob");
        bobsCar.setYear(1988);
        bobsCar.setMake("Volkswagon");
        bobsCar.setModel("Beetle");
        bobsCar.setColor("Red");
        bobsCar.setPrice(12000);
        bobsCar.setQty(1);
        bobsCar.setFeatures("FM radio");
        bobsCar.setFeatures("Rolling windows");
        System.out.printf("%s: \n" +
                "Price: $%.2f\n" +
                "Features: %s\n",
                myCar.toString(), myCar.getPrice(), myCar.getFeatures());
        System.out.printf("%s: \n" +
                        "Price: $%.2f\n" +
                        "Features: %s\n",
                bobsCar.toString(), bobsCar.getPrice(), bobsCar.getFeatures());
        System.out.println(myCar.currentSpeed(80));
        System.out.println(bobsCar.currentSpeed(35));

    }
}
