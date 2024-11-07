
public class VehicleManagementSystem {

    public static void main(String[] args) {
        Truck Hina = new Truck("German", "Hina", false);
        Hina.load(1500);
        Hina.load(0);

        Car HondaCivic = new Car("Japan", "Civic", 4, true);
        HondaCivic.design(2024);

    }
}
