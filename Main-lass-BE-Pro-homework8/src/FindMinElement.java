import java.util.Arrays;
import java.util.List;

public class FindMinElement {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a1", "b5", "a2", "b4");

        String minElement = list.stream()
                .min(String::compareTo)
                .orElse("Нет элементов");

        System.out.println("Самый маленький элемент: " + minElement);
    }
}
