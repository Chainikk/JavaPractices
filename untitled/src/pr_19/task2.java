package pr_19;

import java.util.Arrays;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;

class Student {
    private String name;
    private double averageScore;

    public Student(String name, double averageScore) {
        this.name = name;
        this.averageScore = averageScore;
    }

    public String getName() {
        return name;
    }

    public double getAverageScore() {
        return averageScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", averageScore=" + averageScore +
                '}';
    }
}

class StudentSorter {
    private static final int MAX_STUDENTS = 5;
    private static Student[] students = new Student[MAX_STUDENTS];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < MAX_STUDENTS; i++) {
            System.out.print("Введите имя студента: ");
            String name = scanner.nextLine();

            double averageScore = 0;
            boolean validInput = false;
            while (!validInput) {
                try {
                    System.out.print("Введите средний балл: ");
                    averageScore = scanner.nextDouble();
                    validInput = true;
                } catch (InputMismatchException e) {
                    System.out.println("Некорректный ввод! Пожалуйста, введите число.");
                    scanner.nextLine(); // clear the input buffer
                }
            }
            scanner.nextLine(); // clear the input buffer

            students[i] = new Student(name, averageScore);
        }

        System.out.println("\nМассив студентов до сортировки: ");
        printStudents(students);

        Arrays.sort(students, Comparator.comparing(Student::getAverageScore));

        System.out.println("\nМассив студентов после сортировки: ");
        printStudents(students);

        System.out.print("\nВведите имя студента для поиска: ");
        String searchName = scanner.nextLine();

        try {
            Student foundStudent = findStudentByName(searchName);
            System.out.println("Найденный студент: " + foundStudent);
        } catch (StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void printStudents(Student[] students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    private static Student findStudentByName(String name) throws StudentNotFoundException {
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                return student;
            }
        }
        throw new StudentNotFoundException("Student not found!");
    }
}

class StudentNotFoundException extends Exception {
    public StudentNotFoundException(String message) {
        super(message);
    }
}
