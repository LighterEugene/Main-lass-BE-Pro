import java.util.*;

class Author {
    String firstName;
    String lastName;
    int birthYear;

    public Author(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (р. " + birthYear + ")";
    }
}

class Publisher {
    String name;
    int foundationYear;

    public Publisher(String name, int foundationYear) {
        this.name = name;
        this.foundationYear = foundationYear;
    }

    @Override
    public String toString() {
        return name + " (основано в " + foundationYear + ")";
    }
}

class Book {
    String title;
    Author author;
    int pages;
    int publishYear;
    Publisher publisher;

    public Book(String title, Author author, int pages, int publishYear, Publisher publisher) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.publishYear = publishYear;
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return title + " - " + author + ", " + publishYear + ", " + pages + " стр., издательство: " + publisher;
    }
}

public class BookshelfApp {
    public static void main(String[] args) {
        // Создаём несколько книг
        List<Book> bookshelf = new ArrayList<>();
        bookshelf.add(new Book("Книга 1", new Author("Александр", "Пушкин", 1799), 320, 1837, new Publisher("Азбука", 1995)));
        bookshelf.add(new Book("Книга 2", new Author("Лев", "Толстой", 1828), 1225, 1877, new Publisher("Эксмо", 1993)));
        bookshelf.add(new Book("Книга 3", new Author("Антон", "Чехов", 1860), 400, 1896, new Publisher("Росмэн", 2000)));
        bookshelf.add(new Book("Книга 4", new Author("Николай", "Гоголь", 1809), 150, 1842, new Publisher("Питер", 1991)));
        bookshelf.add(new Book("Книга 5", new Author("Иван", "Тургенев", 1818), 320, 1859, new Publisher("Махаон", 1987)));
        bookshelf.add(new Book("Книга 6", new Author("Михаил", "Булгаков", 1891), 500, 1967, new Publisher("АСТ", 2002)));
        bookshelf.add(new Book("Книга 7", new Author("Фёдор", "Достоевский", 1821), 430, 1866, new Publisher("Альфа-книга", 1998)));

        // Запрашиваем вариант сортировки
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите вариант сортировки: 1-По Автору, 2-По Году издания, 3-По Издательству");
        int option = scanner.nextInt();

        // Сортировка с использованием лямбда-выражений
        switch (option) {
            case 1 -> bookshelf.sort(Comparator.comparing(book -> book.author.lastName));
            case 2 -> bookshelf.sort(Comparator.comparingInt(book -> book.publishYear));
            case 3 -> bookshelf.sort(Comparator.comparing(book -> book.publisher.name));
            default -> System.out.println("Неверный вариант сортировки.");
        }

        // Вывод отсортированных книг
        System.out.println("Содержимое книжной полки:");
        for (Book book : bookshelf) {
            System.out.println(book);
        }
    }
}
