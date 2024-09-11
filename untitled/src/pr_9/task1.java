package pr_9;



class Student implements Comparable<Student> {
    private String name;
    private int iDNumber;

    public Student(String name, int iDNumber) {
        this.name = name;
        this.iDNumber = iDNumber;
    }

    public String getName() {
        return name;
    }

    public int getIDNumber() {
        return iDNumber;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.iDNumber, other.iDNumber);
    }
}

class test {
    public static void main(String[] args) {
        Student[] students = {
                new Student("John", 123),
                new Student("Alice", 3145),
                new Student("Bob", 789),
        };

        System.out.println("До сортировки:");
        for (Student studentt : students) {
            System.out.println(studentt.getName() + ": " + studentt.getIDNumber());
        }

        insertSort(students);

        System.out.println("\nПосле сортировки:");
        for (Student studentt : students) {
            System.out.println(studentt.getName() + ": " + studentt.getIDNumber());
        }
    }

    public static void insertSort(Student[] students) {
        for (int i = 1; i < students.length; i++) {
            Student key = students[i];
            int j = i - 1;
            while (j >= 0 && students[j].compareTo(key) > 0) {
                students[j + 1] = students[j];
                j--;
            }
            students[j + 1] = key;
        }
    }

}

