public class Main {
    public static void main(String[] args) {
        // --- Задание 1: Класс Person ---
        // Создание объектов класса Person
        Person person1 = new Person(); // Используем конструктор по умолчанию
        Person person2 = new Person("John Doe", 30); // Используем конструктор с параметрами

        // Вызов методов move и talk для первого объекта
        person1.move();
        person1.talk();

        // Вызов методов move и talk для второго объекта
        person2.move();
        person2.talk();

        // --- Задание 2: Класс Phone ---
        // Создание объектов класса Phone
        Phone phone1 = new Phone("+1234567890", "iPhone", 174.0);
        Phone phone2 = new Phone("+0987654321", "Samsung", 158.5);
        Phone phone3 = new Phone("+1122334455", "Nokia", 135.0);

        // Вывод значений переменных на консоль
        System.out.println("\nPhone 1: Number = " + phone1.number + ", Model = " + phone1.model + ", Weight = " + phone1.weight);
        System.out.println("Phone 2: Number = " + phone2.number + ", Model = " + phone2.model + ", Weight = " + phone2.weight);
        System.out.println("Phone 3: Number = " + phone3.number + ", Model = " + phone3.model + ", Weight = " + phone3.weight);

        // Вызов методов для каждого объекта
        phone1.receiveCall("Alice");
        System.out.println("Phone 1 Number: " + phone1.getNumber());

        phone2.receiveCall("Bob");
        System.out.println("Phone 2 Number: " + phone2.getNumber());

        phone3.receiveCall("Charlie");
        System.out.println("Phone 3 Number: " + phone3.getNumber());
    }
}
