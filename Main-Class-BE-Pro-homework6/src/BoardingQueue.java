import java.util.*;

// Класс Passenger представляет пассажира с именем и информацией о классе (первый класс или эконом класс)
class Passenger {
    String name; // Имя пассажира
    boolean isFirstClass; // Является ли пассажир пассажиром первого класса

    // Конструктор класса Passenger
    public Passenger(String name, boolean isFirstClass) {
        this.name = name;
        this.isFirstClass = isFirstClass; // Устанавливаем класс пассажира
    }

    // Переопределяем метод toString() для удобного вывода информации о пассажире
    @Override
    public String toString() {
        return name + (isFirstClass ? " (Первый класс)" : " (Эконом класс)");
    }
}

public class BoardingQueue {
    public static void main(String[] args) {
        // Используем очередь (Queue) для пассажиров
        Queue<Passenger> queue = new LinkedList<>();

        // Создаем список пассажиров (10 пассажиров, включая 3 пассажира первого класса)
        List<Passenger> passengers = new ArrayList<>();
        passengers.add(new Passenger("Alice", true));  // Первый класс
        passengers.add(new Passenger("Bob", false));   // Эконом класс
        passengers.add(new Passenger("Charlie", false));  // Эконом класс
        passengers.add(new Passenger("David", true));  // Первый класс
        passengers.add(new Passenger("Eve", false));   // Эконом класс
        passengers.add(new Passenger("Frank", true));  // Первый класс
        passengers.add(new Passenger("Grace", false)); // Эконом класс
        passengers.add(new Passenger("Hank", false));  // Эконом класс
        passengers.add(new Passenger("Isaac", false)); // Эконом класс
        passengers.add(new Passenger("Jack", false));  // Эконом класс

        // Сначала добавляем пассажиров первого класса в очередь
        for (Passenger passenger : passengers) {
            if (passenger.isFirstClass) {
                queue.offer(passenger); // Добавляем в очередь пассажира первого класса
            }
        }

        // Затем добавляем пассажиров эконом класса в очередь
        for (Passenger passenger : passengers) {
            if (!passenger.isFirstClass) {
                queue.offer(passenger); // Добавляем в очередь пассажира эконом класса
            }
        }

        // Разбираем очередь на посадку (обрабатываем очередь)
        System.out.println("Очередь на посадку:");
        while (!queue.isEmpty()) { // Пока очередь не пуста
            System.out.println(queue.poll()); // Извлекаем и выводим пассажиров в порядке очереди
        }
    }
}
