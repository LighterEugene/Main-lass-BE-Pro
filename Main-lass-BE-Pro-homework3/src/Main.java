import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Создаем объект Random
        Random random = new Random();

        // Генерируем список из 500 целочисленных элементов
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 500; i++) {
            int element = random.nextInt(10);
            integerList.add(element);
        }

    }
}