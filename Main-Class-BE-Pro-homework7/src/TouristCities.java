import java.util.*;

public class TouristCities {
    public static void main(String[] args) {
        // Создаем карту для хранения туристов и их городов
        Map<String, List<String>> touristMap = new HashMap<>();

        // Турист 1
        touristMap.put("Турист 1", Arrays.asList("Берлин", "Барселона", "Валенсия", "Париж"));

        // Турист 2
        touristMap.put("Турист 2", Arrays.asList("Бонн", "Дюссельдорф", "Кёльн", "Амстердам"));

        // Добавление третьего туриста
        addThirdTourist(touristMap);

        // Выводим города для каждого туриста
        for (Map.Entry<String, List<String>> entry : touristMap.entrySet()) {
            System.out.println(entry.getKey() + " посетил следующие города: " + entry.getValue());
        }
    }

    // Метод для добавления третьего туриста
    public static void addThirdTourist(Map<String, List<String>> touristMap) {
        List<String> citiesTourist1 = touristMap.get("Турист 1");
        List<String> citiesTourist2 = touristMap.get("Турист 2");

        // Создаем список городов для третьего туриста, объединяя города первого и второго
        List<String> combinedCities = new ArrayList<>(citiesTourist1);
        combinedCities.addAll(citiesTourist2);

        // Добавляем третьего туриста в карту
        touristMap.put("Турист 3", combinedCities);
    }
}

