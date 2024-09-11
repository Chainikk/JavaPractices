package pr_10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

class Student {
    private String name;
    private String lastName;
    private String profile;
    private int course;
    private String group;
    private int GPA;

    public Student(String name, String lastName, String profile, int course, String group, int gpa) {
        this.name = name;
        this.lastName = lastName;
        this.profile = profile;
        this.course = course;
        this.group = group;
        this.GPA = gpa;
    }

    public void print() {
        System.out.println("Name: " + name + " LastName: " + lastName + " profile: " + profile + " course: " + course
                + " group: " + group + " GPA: " + GPA);
    }

    public String getName() {
        return name;
    }

    public int getGPA() {
        return GPA;
    }

    public int getCourse() {
        return course;
    }

    public String getGroup() {
        return group;
    }

    public String getLastName() {
        return lastName;
    }

    public String getProfile() {
        return profile;
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }
}

class StundentComparatoorGPA implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getGPA() - o2.getGPA();
    }
}

class StundentComparatoorCourse implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getCourse() - o2.getCourse();
    }
}

class StudentHell {

    public static ArrayList<Student> setArray() {
        Random rangen = new Random();
        ArrayList<Student> to_return = new ArrayList<Student>();
        for (int i = 0; i < 100; i++) {
            to_return.add(new Student("John" + i, "Doe" + i, Integer.toString(rangen.nextInt(1, 1000)),
                    rangen.nextInt(1, 5), "random group " + i, rangen.nextInt(1, 500)));
        }

        return to_return;
    }

    public static void mergeSortGPA(List<Student> arr, int start, int end) {
        if (start != end) {
            int mid = (start + end) / 2;
            mergeSortGPA(arr, start, mid);
            mergeSortGPA(arr, mid + 1, end);
            mergeGPA(arr, start, mid, end);
        }
    }

    private static void mergeGPA(List<Student> arr, int start, int mid, int end) {
        int i = start;
        int j = mid + 1;
        int k = 0;
        StundentComparatoorGPA comparator = new StundentComparatoorGPA();

        Student[] temp = new Student[end - start + 1];

        while ((i <= mid) && (j <= end)) {
            if (comparator.compare(arr.get(i), arr.get(j)) < 0)
                temp[k++] = arr.get(i++);
            else
                temp[k++] = arr.get(j++);
        }

        while (i <= mid) {
            temp[k++] = arr.get(i++);
        }

        while (j <= end) {
            temp[k++] = arr.get(j++);
        }

        for (i = start; i <= end; i++) {
            arr.remove(i);
            Student e = temp[i - start];
            arr.add(i, e);
        }
    }

    public static void mergeSortCourse(List<Student> arr, int start, int end) {
        if (start != end) {
            int mid = (start + end) / 2;
            mergeSortCourse(arr, start, mid);
            mergeSortCourse(arr, mid + 1, end);
            mergeCourse(arr, start, mid, end);
        }
    }

    private static void mergeCourse(List<Student> arr, int start, int mid, int end) {
        int i = start;
        int j = mid + 1;
        int k = 0;
        StundentComparatoorCourse comparator = new StundentComparatoorCourse();

        Student[] temp = new Student[end - start + 1];

        while ((i <= mid) && (j <= end)) {
            if (comparator.compare(arr.get(i), arr.get(j)) < 0)
                temp[k++] = arr.get(i++);
            else
                temp[k++] = arr.get(j++);
        }

        while (i <= mid) {
            temp[k++] = arr.get(i++);
        }

        while (j <= end) {
            temp[k++] = arr.get(j++);
        }

        for (i = start; i <= end; i++) {
            arr.remove(i);
            Student e = temp[i - start];
            arr.add(i, e);
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> arr = setArray();

        for (int i = 0; i < 100; i++) {
            arr.get(i).print();
        }
        System.out.println();
        System.out.println();
        System.out.println("Результат после сортировки по среднему баллу");

        mergeSortGPA(arr, 0, arr.size() - 1);

        for (int i = 0; i < 100; i++) {
            arr.get(i).print();
        }
        System.out.println();
        System.out.println();
        System.out.println("Результат после сортировки по курсу");

        mergeSortCourse(arr, 0, arr.size() - 1);

        for (int i = 0; i < 100; i++) {
            arr.get(i).print();
        }
    }
}

