import java.util.*;

class City {
    String name;
    int count;

    public City(String name) {
        this.name = name;
        this.count = 1; // Изначально город назван 1 раз
    }

    @Override
    public String toString() {
        return name + " (упомянут " + count + " раз)";
    }
}

public class CityGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, City> cityMap = new HashMap<>();
        List<String> allCities = new ArrayList<>();
        List<String> repeatedCities = new ArrayList<>();

        boolean gameOn = true;

        while (gameOn) {
            System.out.print("Введите название города: ");
            String cityName = scanner.nextLine();

            // Проверяем, был ли уже введён этот город
            if (cityMap.containsKey(cityName)) {
                City city = cityMap.get(cityName);
                city.count++;

                if (city.count >= 5) {
                    gameOn = false; // Останавливаем игру
                }

                if (city.count == 2) {
                    repeatedCities.add(cityName); // Добавляем в список повторяющихся городов
                }
            } else {
                cityMap.put(cityName, new City(cityName)); // Добавляем новый город
            }

            allCities.add(cityName); // Добавляем город в общий список
        }

        // Вывод результатов
        System.out.println("Все названные города: " + allCities);
        System.out.println("Города, которые были названы два и более раз: " + repeatedCities);
    }
}
