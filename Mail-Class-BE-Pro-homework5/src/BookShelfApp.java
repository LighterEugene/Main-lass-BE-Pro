import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

// Класс Автор
class Author {
    String name;
    int birthYear;

    public Author(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return name + " (Год рождения: " + birthYear + ")";
    }
}

// Класс Книга
class Book {
    String title;
    int publishYear;
    int pages;
    Author author;

    public Book(String title, int publishYear, int pages, Author author) {
        this.title = title;
        this.publishYear = publishYear;
        this.pages = pages;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Название: " + title + ", Год издания: " + publishYear + ", Страницы: " + pages + ", Автор: " + author;
    }
}

public class BookShelfApp {
    public static void main(String[] args) {
        // Создаем авторов
        Author author1 = new Author("Лев Толстой", 1828);
        Author author2 = new Author("Фёдор Достоевский", 1821);
        Author author3 = new Author("Александр Пушкин", 1799);

        // Создаем книги
        List<Book> bookShelf = new ArrayList<>();
        bookShelf.add(new Book("Война и мир", 1869, 1225, author1));
        bookShelf.add(new Book("Анна Каренина", 1877, 864, author1));
        bookShelf.add(new Book("Преступление и наказание", 1866, 671, author2));
        bookShelf.add(new Book("Идиот", 1869, 667, author2));
        bookShelf.add(new Book("Евгений Онегин", 1833, 224, author3));
        bookShelf.add(new Book("Капитанская дочка", 1836, 128, author3));
        bookShelf.add(new Book("Герой нашего времени", 1840, 304, author3));
        bookShelf.add(new Book("Мёртвые души", 1842, 352, author2));
        bookShelf.add(new Book("Братья Карамазовы", 1880, 824, author2));
        bookShelf.add(new Book("Пиковая дама", 1834, 82, author3));

        // Вывод содержимого книжной полки в оригинальном виде
        System.out.println("Книжная полка (оригинальный порядок):");
        for (Book book : bookShelf) {
            System.out.println(book);
        }

        // Запрос вариантов сортировки с консоли
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nВыберите вариант сортировки:");
        System.out.println("1 - По названию\n2 - По году издания\n3 - По количеству страниц\n4 - По году рождения автора");
        int option = scanner.nextInt();

        // Компараторы для сортировки
        Comparator<Book> byTitle = Comparator.comparing(book -> book.title);
        Comparator<Book> byPublishYear = Comparator.comparingInt(book -> book.publishYear);
        Comparator<Book> byPages = Comparator.comparingInt(book -> book.pages);
        Comparator<Book> byAuthorBirthYear = Comparator.comparingInt(book -> book.author.birthYear);

        // В зависимости от выбранного варианта выполняем сортировку
        switch (option) {
            case 1 -> Collections.sort(bookShelf, byTitle);
            case 2 -> Collections.sort(bookShelf, byPublishYear);
            case 3 -> Collections.sort(bookShelf, byPages);
            case 4 -> Collections.sort(bookShelf, byAuthorBirthYear);
            default -> System.out.println("Неверный вариант сортировки.");
        }

        // Вывод отсортированной книжной полки
        System.out.println("\nКнижная полка (после сортировки):");
        for (Book book : bookShelf) {
            System.out.println(book);
        }
    }
}
