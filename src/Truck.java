
public class Truck extends Car {

    public Truck(String make, String model, boolean isConvertable) {
        super(make, model, 2, isConvertable);
    }

    public void load(double payLoad) {
        double newLoad = getCurrentCapacity() + payLoad;

        if (newLoad == 0) {
            stopped();
            System.out.println("Truck Has No Load Present At This Moment");
        } else if (newLoad > 0 && newLoad <= 1500) {
            System.out.println("The Towing Capacity is Excelent");
        } else if (newLoad > 1500 && newLoad <= 2500) {
            System.out.println("The Towing Capacity is Good");
        } else if (newLoad > 2500 && newLoad <= 3000) {
            System.out.println("The Towing Capacity is at its Peak");
        } else if (newLoad > 3000) {
            System.out.println("Truck is OVERLOADED!!!!!");
        } else {
            System.out.println("Truck is empty");
        }

    }

}
