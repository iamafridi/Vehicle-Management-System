
public class Car extends Vehicle {

    private int doors;
    private boolean isConvertable;

    public Car(String make, String model, int doors, boolean isConvertable) {
        super(make, model);
        this.doors = doors;
        this.isConvertable = isConvertable;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }
    public boolean  getConvertable() {
        return isConvertable;
    }

    public void setConvertable(boolean isConvertable) {
        this.isConvertable = isConvertable;
    }

}
