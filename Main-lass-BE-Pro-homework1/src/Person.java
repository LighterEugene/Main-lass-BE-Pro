class Person {
    // Переменные экземпляра
    String fullName;
    int age;

    // Конструктор по умолчанию
    Person() {
        this.fullName = "Unknown";
        this.age = 0;
    }

    // Конструктор с параметрами
    Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    // Метод move()
    void move() {
        System.out.println(fullName + " идет");
    }

    // Метод talk()
    void talk() {
        System.out.println(fullName + " говорит");
    }
}

