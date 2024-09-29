import java.util.*;

class Car {
    String brand;
    String color;
    String vin;  // Уникальный номер
    String regNumber; // Уникальный регистрационный номер

    public Car(String brand, String color, String vin, String regNumber) {
        this.brand = brand;
        this.color = color;
        this.vin = vin;
        this.regNumber = regNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car car = (Car) obj;
        return vin.equals(car.vin); // Сравниваем по VIN, так как он уникальный
    }

    @Override
    public int hashCode() {
        return Objects.hash(vin);
    }

    @Override
    public String toString() {
        return brand + " (" + color + "), VIN: " + vin + ", RegNumber: " + regNumber;
    }
}

public class CarApp {
    public static void main(String[] args) {
        // Список проданных машин
        List<Car> soldCars = new ArrayList<>();
        soldCars.add(new Car("Toyota", "Red", "VIN001", "REG001"));
        soldCars.add(new Car("Honda", "Blue", "VIN002", "REG002"));

        // Машины, проданные в лизинг
        Set<Car> leasingCars = new HashSet<>();
        leasingCars.add(soldCars.get(0)); // Добавляем машину в лизинг

        // Изменение данных: машина перепродаётся и изменяет регистрационный номер
        Car modifiedCar = new Car("Toyota", "Red", "VIN001", "REG999");
        soldCars.set(0, modifiedCar);

        // Проверяем, осталась ли машина в лизинге
        if (leasingCars.contains(modifiedCar)) {
            System.out.println("Машина находится в лизинге: " + modifiedCar);
        } else {
            System.out.println("Машина больше не в лизинге.");
        }
    }
}
