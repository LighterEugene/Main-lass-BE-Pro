import java.util.*;

 class RandomNumberFrequency {
    public static void main(String[] args) {
        // Генерация списка из 1000 случайных целых чисел
        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            numbers.add(random.nextInt(100)); // Генерация числа от 0 до 99
        }

        // Подсчёт количества появлений каждого числа
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int number : numbers) {
            frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);
        }

        // Вывод в консоль информации о количестве повторений
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Число " + entry.getKey() + " появилось " + entry.getValue() + " раз(а).");
        }
    }
}
