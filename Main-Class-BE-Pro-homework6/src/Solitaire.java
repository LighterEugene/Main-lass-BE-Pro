import java.util.*;

// Перечисление рангов карт (от двойки до туза)
enum Rank {
    TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE
}

// Перечисление мастей карт (червы, бубны, трефы, пики)
enum Suit {
    HEARTS, DIAMONDS, CLUBS, SPADES
}

// Класс Card представляет одну карту с полями ранга и масти
class Card {
    Rank rank; // Ранг карты (например, ТУЗ)
    Suit suit; // Масть карты (например, ЧЕРВИ)

    // Конструктор, инициализирующий карту с определенным рангом и мастью
    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    // Переопределение метода toString() для удобного вывода карты (например, "ACE of SPADES")
    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}

// Класс Deck представляет колоду карт
class Deck {
    // Поле cards - список карт, которые будут находиться в колоде
    List<Card> cards = new ArrayList<>();

    // Конструктор Deck создает полную колоду карт (52 карты)
    public Deck() {
        // Для каждой масти и каждого ранга создается карта и добавляется в колоду
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards.add(new Card(rank, suit));
            }
        }
    }

    // Метод shuffle перемешивает колоду с помощью метода shuffle из класса Collections
    public void shuffle() {
        Collections.shuffle(cards); // Перемешиваем карты
    }

    // Метод deal раскладывает карты в стопку по правилам игры и возвращает результат
    public List<Card> deal() {
        Stack<Card> stack = new Stack<>(); // Используем стек для хранения карт

        // Проходим по каждой карте в колоде
        for (Card card : cards) {
            stack.push(card); // Кладем карту на вершину стека

            // Проверяем, есть ли в стеке хотя бы две карты
            if (stack.size() > 1) {
                // Берем две верхние карты
                Card topCard = stack.pop(); // Вытаскиваем верхнюю карту
                Card secondTopCard = stack.pop(); // Вытаскиваем карту под ней

                // Если масти двух карт не совпадают, возвращаем их обратно в стек
                if (topCard.suit != secondTopCard.suit) {
                    stack.push(secondTopCard); // Возвращаем вторую карту обратно в стек
                    stack.push(topCard); // Возвращаем верхнюю карту обратно в стек
                }
                // Если масти совпадают, карты не возвращаются в стек и удаляются
            }
        }

        // Преобразуем стек в список и возвращаем
        return new ArrayList<>(stack);
    }
}

// Класс Solitaire представляет основное приложение пасьянса
public class Solitaire {
    public static void main(String[] args) {
        // Создаем новую колоду и перемешиваем её
        Deck deck = new Deck();
        deck.shuffle(); // Перемешиваем карты

        // Раскладываем карты по правилам и получаем оставшиеся карты
        List<Card> remainingCards = deck.deal();

        // Выводим оставшиеся карты
        System.out.println("Остаток карт в стопке:");

        // Считаем количество карт каждой масти
        Map<Suit, Integer> suitCount = new HashMap<>();
        for (Card card : remainingCards) {
            System.out.println(card); // Выводим каждую оставшуюся карту
            // Увеличиваем счётчик для каждой масти
            suitCount.put(card.suit, suitCount.getOrDefault(card.suit, 0) + 1);
        }

        // Проверяем, сошелся ли пасьянс: должны остаться ровно по одной карте каждой масти
        boolean solitaireSolved = suitCount.values().stream().allMatch(count -> count == 1);

        // Выводим результат
        if (solitaireSolved) {
            System.out.println("Пасьянс сошелся!"); // Если по одной карте каждой масти
        } else {
            System.out.println("Пасьянс не сошелся."); // Если не по одной карте каждой масти
        }
    }
}
