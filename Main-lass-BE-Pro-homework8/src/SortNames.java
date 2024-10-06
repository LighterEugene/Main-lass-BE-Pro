import java.util.*;

public class SortNames {
    public static void main(String[] args) {
        String[][] names = { {"abc", "last"}, {"pklz", "yelp"}, {"rpng", "note"}, {"ppza", "xyz"} };

        // Сортировка по имени, если одинаково — по фамилии
        Arrays.sort(names, (a, b) -> {
            int firstNameCompare = a[0].compareTo(b[0]);
            if (firstNameCompare == 0) {
                return a[1].compareTo(b[1]);
            }
            return firstNameCompare;
        });

        // Вывод результата
        System.out.println("Отсортированные имена:");
        for (String[] namePair : names) {
            System.out.println(Arrays.toString(namePair));
        }
    }
}
