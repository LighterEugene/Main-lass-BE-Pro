import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создаем список и заполняем его 10 миллионами элементов
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10_000_000; i++) {
            list.add(i);
        }

        // 1. For-each loop
        long startTime = System.currentTimeMillis();
        for (int i : list) {
            int temp = i;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("For-each loop: " + (endTime - startTime) + " ms");

        // 2. Classic for с вызовом list.size() на каждой итерации
        startTime = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            int temp = list.get(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Classic for с вызовом list.size() на каждой итерации: " + (endTime - startTime) + " ms");
    }
}