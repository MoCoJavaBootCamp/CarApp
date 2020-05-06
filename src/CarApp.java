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
        System.out.println(myCar.toString());
    }
}
