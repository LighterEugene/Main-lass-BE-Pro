import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Создаем объект Random
        Random random = new Random();

        // Генерируем список из 500 целочисленных элементов
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 500; i++) {
            int element = random.nextInt(5000);
            integerList.add(element);
        }
        System.out.println(integerList);
        Set<Integer> uniqueSortedSet = new TreeSet<Integer>(integerList);
        System.out.println("Отсортированный набор уникальных элементов: " + uniqueSortedSet);

        // 2) Набор только уникальных элементов
        Set<Integer> uniqueSet = new HashSet<>(integerList);
        System.out.println("Набор только уникальных элементов: " + uniqueSet);
    }
}