public class Car extends Vehicle {
    private String owner;
    private boolean needsOilChange;

    Car(String owner) {
        this.owner = owner;
        this.needsOilChange = false;
    }

    @Override
    public String toString() {
        return String.format("%s's %d %s %s",
                this.owner, this.getYear(), this.getMake(), this.getModel());
    }

    @Override
    public String currentSpeed(int speed) {
        return String.format("%s is going %d mph.", this.toString(), speed);
    }

    public boolean getNeedsOilChange() {
        return needsOilChange;
    }

    public void setNeedsOilChange(boolean needsOilChange) {
        this.needsOilChange = needsOilChange;
    }

}
