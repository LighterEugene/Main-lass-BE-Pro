import java.util.*;
import java.util.stream.Collectors;

class Student {
    String name;
    double rate;
    boolean finished;

    public Student(String name, double rate, boolean finished) {
        this.name = name;
        this.rate = rate;
        this.finished = finished;
    }

    @Override
    public String toString() {
        return name + " (" + rate + ")";
    }
}

class FrontEndStudent extends Student {
    public FrontEndStudent(String name, double rate, boolean finished) {
        super(name, rate, finished);
    }
}

class BackEndStudent extends Student {
    public BackEndStudent(String name, double rate, boolean finished) {
        super(name, rate, finished);
    }
}

class QAStudent extends Student {
    public QAStudent(String name, double rate, boolean finished) {
        super(name, rate, finished);
    }
}

class ProjectStudent {
    String name;
    double rate;
    String type;

    public ProjectStudent(String name, double rate, String type) {
        this.name = name;
        this.rate = rate;
        this.type = type;
    }

    @Override
    public String toString() {
        return name + " (" + rate + ") - " + type;
    }
}

public class StudentApp {
    public static void main(String[] args) {
        // Создаём три списка студентов
        List<FrontEndStudent> feStudents = Arrays.asList(
                new FrontEndStudent("FE_Student_1", 4.6, true),
                new FrontEndStudent("FE_Student_2", 4.0, false),
                new FrontEndStudent("FE_Student_3", 5.0, true),
                new FrontEndStudent("FE_Student_4", 4.9, true),
                new FrontEndStudent("FE_Student_5", 3.5, true)
        );

        List<BackEndStudent> beStudents = Arrays.asList(
                new BackEndStudent("BE_Student_1", 4.7, true),
                new BackEndStudent("BE_Student_2", 3.9, false),
                new BackEndStudent("BE_Student_3", 4.5, true),
                new BackEndStudent("BE_Student_4", 4.8, true),
                new BackEndStudent("BE_Student_5", 4.1, true)
        );

        List<QAStudent> qaStudents = Arrays.asList(
                new QAStudent("QA_Student_1", 4.2, true),
                new QAStudent("QA_Student_2", 4.6, true),
                new QAStudent("QA_Student_3", 4.8, true),
                new QAStudent("QA_Student_4", 3.9, false),
                new QAStudent("QA_Student_5", 5.0, true)
        );

        // Объединяем все списки в один список списков
        List<List<? extends Student>> allStudents = Arrays.asList(feStudents, beStudents, qaStudents);

        // Стрим для выборки студентов с rate > 4.5 и finished == true
        List<ProjectStudent> projectStudents = allStudents.stream()
                .flatMap(List::stream)
                .filter(student -> student.rate > 4.5 && student.finished)
                .map(student -> {
                    String type;
                    if (student instanceof FrontEndStudent) {
                        type = "FE";
                    } else if (student instanceof BackEndStudent) {
                        type = "BE";
                    } else {
                        type = "QA";
                    }
                    return new ProjectStudent(student.name, student.rate, type);
                })
                .collect(Collectors.toList());

        // Вывод результатов
        projectStudents.forEach(System.out::println);
    }
}
