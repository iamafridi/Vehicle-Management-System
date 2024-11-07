
public class Vehicle {

    private String make;
    private String model;
    private int currentCapacity;
    private int year;

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
        this.currentCapacity=0;
        this.year = 0;

    }

// Released 
    public void design(int releasedYear) {
        this.year += releasedYear;
        System.out.println("This Car was Released in : " + year);
    }

    public void towing(int speed){
        currentCapacity = speed;
        System.out.println("The Towing Capacity :"+ currentCapacity);
    }
     
    // Get and Set
    public String getMake(String make) {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getCurrentCapacity(){
        return currentCapacity;
    }

    public void setCurrentCapacity(int currentCapacity){
        this.currentCapacity = currentCapacity;
    }

    public String getmodel(String model) {
        return model;
    }

    public void setmodel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Stopped Method
    public void stopped() {
        this.year = 0;
    }

}
