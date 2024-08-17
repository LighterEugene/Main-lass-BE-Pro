class Phone {
    // Переменные экземпляра
    String number;
    String model;
    double weight;

    // Конструктор с параметрами
    Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    // Метод receiveCall()
    void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    // Метод getNumber()
    String getNumber() {
        return number;
    }
}

