import java.util.*;
import java.util.stream.Collectors;

public class StreamSorting {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a1", "b5", "c1", "a2", "b4", "c1", "a1");

        // Прямая сортировка и удаление дубликатов
        List<String> directOrder = list.stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        // Обратная сортировка и удаление дубликатов
        List<String> reverseOrder = list.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        // Вывод результатов
        System.out.println("Прямая сортировка: " + directOrder);
        System.out.println("Обратная сортировка: " + reverseOrder);
    }
}
