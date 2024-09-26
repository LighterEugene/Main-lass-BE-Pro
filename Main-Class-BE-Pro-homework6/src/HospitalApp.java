import java.util.*;


class Patient {
    String name;
    boolean isCritical;

    // Конструктор класса Patient
    public Patient(String name, boolean isCritical) {
        this.name = name;
        this.isCritical = isCritical; // Устанавливаем, критичен ли пациент
    }

    // Переопределение метода toString() для удобного вывода информации о пациенте
    @Override
    public String toString() {
        return name + (isCritical ? " (Критичен)" : " (Обычный)");
    }
}

// Класс Therapy представляет терапию, которая назначается пациентам
class Therapy {
    // Метод для назначения терапии пациенту
    public void assign(Patient patient) {
        System.out.println("Назначена терапия для: " + patient);
    }
}

// Класс DoctorQueue представляет очередь к доктору, которая обслуживает сначала критичных пациентов
class DoctorQueue {
    // Используем приоритетную очередь (PriorityQueue), которая будет обслуживать критичных пациентов в первую очередь
    PriorityQueue<Patient> doctorQueue;

    // Конструктор класса DoctorQueue
    public DoctorQueue() {
        // Приоритетная очередь сортирует пациентов, ставя критичных (isCritical = true) выше обычных
        doctorQueue = new PriorityQueue<>(Comparator.comparing((Patient p) -> !p.isCritical));
    }

    // Метод добавления пациента в очередь к доктору
    public void addToQueue(Patient patient) {
        doctorQueue.offer(patient); // Добавляем пациента в очередь
    }

    // Метод обработки очереди к доктору (пациенты обслуживаются в порядке приоритета)
    public void processQueue() {
        // Пока очередь не пуста, доктор обслуживает пациентов
        while (!doctorQueue.isEmpty()) {
            Patient patient = doctorQueue.poll(); // Извлекаем пациента с наибольшим приоритетом
            System.out.println("Доктор обслуживает: " + patient); // Доктор начинает обслуживание пациента
        }
    }
}

public class HospitalApp {
    public static void main(String[] args) {
        // Очередь регистрации пациентов (регистратура)
        Queue<Patient> registrationQueue = new LinkedList<>();

        // Очередь к доктору (используем класс DoctorQueue)
        DoctorQueue doctorQueue = new DoctorQueue();

        // Экземпляр класса Therapy для назначения терапии пациентам
        Therapy therapy = new Therapy();

        // Список пациентов
        List<Patient> patients = new ArrayList<>();

        // Создаём 15 пациентов, каждый третий пациент — критичный
        for (int i = 1; i <= 15; i++) {
            patients.add(new Patient("Пациент " + i, i % 3 == 0)); // Каждый третий пациент критичен
        }

        // Процесс регистрации пациентов в регистратуру
        int capacity = 7;

        // Добавляем пациентов в регистратуру
        for (Patient patient : patients) {
            if (registrationQueue.size() < capacity) {
                registrationQueue.offer(patient); // Добавляем пациента в регистратуру, если есть место
            } else {
                // Если регистратура заполнена, начинаем обработку очереди

                // Обработка очереди в регистратуре
                while (!registrationQueue.isEmpty()) {
                    // Извлекаем пациента из регистрационной очереди
                    Patient currentPatient = registrationQueue.poll();
                    System.out.println(currentPatient + " проходит регистрацию.");
                    therapy.assign(currentPatient); // Назначаем терапию пациенту
                    doctorQueue.addToQueue(currentPatient); // Добавляем пациента в очередь к доктору
                }

                // Обрабатываем очередь к доктору (пациенты обслуживаются доктором)
                doctorQueue.processQueue();

                // Добавляем следующего пациента в регистратуру
                registrationQueue.offer(patient);
            }
        }

        // После того, как все пациенты добавлены, обрабатываем оставшуюся очередь в регистратуре
        while (!registrationQueue.isEmpty()) {
            // Извлекаем пациента из регистрационной очереди
            Patient currentPatient = registrationQueue.poll();
            System.out.println(currentPatient + " проходит регистрацию.");
            therapy.assign(currentPatient); // Назначаем терапию пациенту
            doctorQueue.addToQueue(currentPatient); // Добавляем пациента в очередь к доктору
        }

        // Последний этап: обрабатываем очередь к доктору
        doctorQueue.processQueue();
    }
}
