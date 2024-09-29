import java.util.*;

class Author {
    String name;
    int birthYear;

    public Author(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }
}

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
        return title + " (" + publishYear + "), " + pages + " стр., Автор: " + author.name + " (" + author.birthYear + ")";
    }
}

public class Bookshelf {
    public static void main(String[] args) {
        List<Book> bookshelf = new ArrayList<>();
        bookshelf.add(new Book("Книга 1", 2001, 300, new Author("Автор 1", 1970)));
        bookshelf.add(new Book("Книга 2", 1999, 400, new Author("Автор 2", 1980)));
        bookshelf.add(new Book("Книга 3", 2005, 150, new Author("Автор 3", 1965)));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите вариант сортировки: 1-По названию, 2-По году издания, 3-По количеству страниц, 4-По году рождения автора");
        int option = scanner.nextInt();

        Comparator<Book> byTitle = Comparator.comparing(book -> book.title);
        Comparator<Book> byPublishYear = Comparator.comparingInt(book -> book.publishYear);
        Comparator<Book> byPages = Comparator.comparingInt(book -> book.pages);
        Comparator<Book> byAuthorBirthYear = Comparator.comparingInt(book -> book.author.birthYear);

        switch (option) {
            case 1 -> Collections.sort(bookshelf, byTitle);
            case 2 -> Collections.sort(bookshelf, byPublishYear);
            case 3 -> Collections.sort(bookshelf, byPages);
            case 4 -> Collections.sort(bookshelf, byAuthorBirthYear);
            default -> System.out.println("Неверный вариант сортировки.");
        }

        // Выводим отсортированные книги
        for (Book book : bookshelf) {
            System.out.println(book);
        }
    }
}

