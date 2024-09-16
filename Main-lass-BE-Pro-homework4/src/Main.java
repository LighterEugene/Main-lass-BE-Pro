import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

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

        // 3. Classic for с предварительным определением list.size() в переменную
        startTime = System.currentTimeMillis();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int temp = list.get(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Classic for с определением list.size() в переменную: " + (endTime - startTime) + " ms");

        // 4. Classic for с предварительным определением list.size() и перебором с конца
        startTime = System.currentTimeMillis();
        for (int i = size - 1; i >= 0; i--) {
            int temp = list.get(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Classic for с перебором с конца: " + (endTime - startTime) + " ms");

        // 5. Использование Iterator
        startTime = System.currentTimeMillis();
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int temp = iterator.next();
        }
        endTime = System.currentTimeMillis();
        System.out.println("Iterator: " + (endTime - startTime) + " ms");

        // 6. Использование ListIterator
        startTime = System.currentTimeMillis();
        ListIterator<Integer> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            int temp = listIterator.next();
        }
        endTime = System.currentTimeMillis();
        System.out.println("ListIterator: " + (endTime - startTime) + " ms");
    }
}
