import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Класс Автомобиль
class Car {
    String brand;
    String color;
    String vin;
    String regNumber;

    public Car(String brand, String color, String vin, String regNumber) {
        this.brand = brand;
        this.color = color;
        this.vin = vin;
        this.regNumber = regNumber;
    }

    // Переопределяем equals() и hashCode() для корректной работы с HashSet
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car car = (Car) obj;
        return vin.equals(car.vin);
    }

    @Override
    public int hashCode() {
        return vin.hashCode();
    }

    @Override
    public String toString() {
        return "Марка: " + brand + ", Цвет: " + color + ", VIN: " + vin + ", Регистрационный номер: " + regNumber;
    }
}

public class CarApp {
    public static void main(String[] args) {
        // Список всех проданных автомобилей
        List<Car> soldCars = new ArrayList<>();

        // Добавляем несколько автомобилей
        soldCars.add(new Car("Toyota", "Синий", "VIN123", "REG123"));
        soldCars.add(new Car("BMW", "Черный", "VIN124", "REG124"));
        soldCars.add(new Car("Audi", "Белый", "VIN125", "REG125"));
        soldCars.add(new Car("Mercedes", "Красный", "VIN126", "REG126"));
        soldCars.add(new Car("Tesla", "Серый", "VIN127", "REG127"));

        // HashSet для автомобилей, проданных в лизинг
        Set<Car> leasingCars = new HashSet<>();
        leasingCars.add(soldCars.get(0)); // Toyota
        leasingCars.add(soldCars.get(2)); // Audi

        // Обновляем информацию о проданных автомобилях
        soldCars.get(0).regNumber = "NEWREG123"; // Изменение регистрационного номера
        soldCars.get(2).color = "Зеленый"; // Изменение цвета

        // Определяем, какие автомобили всё ещё находятся в лизинге
        System.out.println("Автомобили в лизинге после изменений:");
        for (Car car : soldCars) {
            if (leasingCars.contains(car)) {
                System.out.println(car);
            }
        }
    }
}
