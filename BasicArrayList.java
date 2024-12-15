import java.util.ArrayList;

public class BasicArrayList {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("toyota");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.set(0, "Opel");
        System.out.println(cars); // [Opel, BMW, Ford, Mazda]
        cars.forEach((car) -> {
            System.out.println(car);
        });
    }

}
