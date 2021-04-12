package homework02.hw;

import homework02.hw.Car;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        List<Car> sedans = new ArrayList<>();
        List<Car> hatchbacks = new ArrayList<>();
        List<Car> crossovers = new ArrayList<>();
        List<Car> otherTypes = new ArrayList<>();

        cars.add(new Car("Lada", "Седан"));
        cars.add(new Car("Lada", "Хэтчбэк"));
        cars.add(new Car("Mercedes", "Седан"));
        cars.add(new Car("BMW", "Кроссовер"));
        cars.add(new Car("Peugeot", "Кроссовер"));
        cars.add(new Car("Ford", "Хэтчбэк"));
        cars.add(new Car("Toyota", "Седан"));
        cars.add(new Car("Mitsubishi", "Универсал"));


        for (Car car : cars) {
            if (car.getType().equals("Седан")) {
                sedans.add(car);
            } else if (car.getType().equals("Хэтчбэк")) {
                hatchbacks.add(car);
            } else if (car.getType().equals("Кроссовер")) {
                crossovers.add(car);
            } else {
                otherTypes.add(car);
            }
        }

        System.out.println("Список седанов: " + sedans);
        System.out.println("Список хэтчбэков: " + hatchbacks);
        System.out.println("Список кроссоверов: " + crossovers);
        System.out.println("Список машин других типов: " + otherTypes);
    }
}
