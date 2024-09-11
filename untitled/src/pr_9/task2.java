package pr_9;

import java.util.Comparator;

class student {
    private String name;
    private int gpa;

    public student(String name, int gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public int getGPA() {
        return gpa;
    }
}

class SortingStudentsByGPA implements Comparator<student> {
    @Override
    public int compare(student student1, student student2) {
        return Integer.compare(student2.getGPA(), student1.getGPA());
    }

    public void quickSort(student[] students, int low, int high) {
        if (low < high) {
            int pi = partition(students, low, high);
            quickSort(students, low, pi - 1);
            quickSort(students, pi + 1, high);
        }
    }

    private int partition(student[] students, int low, int high) {
        int pivot = students[high].getGPA();
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (students[j].getGPA() >= pivot) {
                i++;

                student temp = students[i];
                students[i] = students[j];
                students[j] = temp;
            }
        }

        student temp = students[i + 1];
        students[i + 1] = students[high];
        students[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        student[] students = {
                new student("John", 85),
                new student("Alice", 90),
                new student("Bob", 80),
        };

        System.out.println("До сортировки:");
        for (student student : students) {
            System.out.println(student.getName() + ": " + student.getGPA());
        }

        SortingStudentsByGPA sorter = new SortingStudentsByGPA();
        sorter.quickSort(students, 0, students.length - 1);

        System.out.println("\nПосле сортировки:");
        for (student student : students) {
            System.out.println(student.getName() + ": " + student.getGPA());
        }
    }
}
