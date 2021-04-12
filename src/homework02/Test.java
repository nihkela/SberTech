package homework02;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Lada", "Седан"));
        cars.add(new Car("Lada", "Хэтчбэк"));
        cars.add(new Car("Mercedes", "Седан"));
        cars.add(new Car("BMW", "Кроссовер"));
        cars.add(new Car("Lada", "Sedan"));
    }
}
