import java.util.*;
public class randomStringsGeneration {
     public static void main(String[] args) {
            // Создание двух строк случайных символов
            String str1 = generateRandomString(20, 50);
            String str2 = generateRandomString(20, 50);

            // Вывод строк для наглядности
            System.out.println("Строка 1: " + str1);
            System.out.println("Строка 2: " + str2);

            // Объединяем строки
            String combined = str1 + str2;

                // Создаем Map для подсчета количества появлений каждого символа
                Map<Character, Integer> charCountMap = new HashMap<>();
                for (char ch : combined.toCharArray()) {
                    charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);// сh символ, второй параметр постепенное добавление,сколько раз он встречается.
                }

            // Формируем список символов, которые встречаются только один раз
            List<Character> uniqueChars = new ArrayList<>();
            for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
                if (entry.getValue() == 1) {
                    uniqueChars.add(entry.getKey());
                }
            }

            // Вывод списка уникальных символов
            System.out.println("Символы, которые встречаются только один раз: " + uniqueChars);
        }

        // Метод для генерации случайной строки заданной длины
        public static String generateRandomString(int minLength, int maxLength) {
            Random random = new Random();// используется для генерации случайных чисел.
            int length = random.nextInt(maxLength - minLength + 1) + minLength;// рандом для случайного числа в диапазоне от максимума и минимума и плюс один,т.к. диапазон исключает последнее число и идёт от ноля, добавляем минимальную строку, это сдвигает диапазон случайных значений, чтобы он начинался не с 0, а с минимальной длины строки.
            StringBuilder sb = new StringBuilder(length); // объект класса стринг биллдер с заданной длинной, для дальнейших манипуляций со строкой.
            for (int i = 0; i < length; i++) {
                char randomChar = (char) ('a' + random.nextInt(26)); // генерируем случайные буквы от 'a' до 'z'. Когда мы прибавляем к 'a' случайное число от 0 до 25, мы получаем одну из букв английского алфавита. Операция (char) преобразует результат сложения (число) в символ.
                sb.append(randomChar); // добавляем символ к строке
            }
            return sb.toString();
        }
    }


