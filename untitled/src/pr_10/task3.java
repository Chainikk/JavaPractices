package pr_10;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

class Students {
    private String name;
    private String lastName;
    private String profile;
    private int course;
    private String group;
    private int GPA;

    public Students(String name, String lastName, String profile, int course, String group, int gpa) {
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

class StundentComparatorGPA implements Comparator<Students> {
    @Override
    public int compare(Students o1, Students o2) {
        return o1.getGPA() - o2.getGPA();
    }
}
class MergeTwoArrays {
    public static ArrayList<Students> setArray1() {
        Random rangen = new Random();
        ArrayList<Students> to_return = new ArrayList<Students>();
        for (int i = 0; i < 100; i++) {
            to_return.add(new Students("John" + i, "Doe" + i, Integer.toString(rangen.nextInt(1, 1000)),
                    rangen.nextInt(1, 5), "random group" + i, rangen.nextInt(1, 500)));
        }

        return to_return;
    }

    public static ArrayList<Students> setArray2() {
        Random rangen = new Random();
        ArrayList<Students> to_return = new ArrayList<Students>();
        for (int i = 0; i < 100; i++) {
            to_return.add(new Students("John" + i + 100, "Doe" + i + 100, Integer.toString(rangen.nextInt(1000, 2000)),
                    rangen.nextInt(1, 5), "random group" + i + 100, rangen.nextInt(500, 1000)));
        }

        return to_return;
    }

    public static void mergeSortGPA(List<Students> arr, int start, int end) {
        if (start != end) {
            int mid = (start + end) / 2;
            mergeSortGPA(arr, start, mid);
            mergeSortGPA(arr, mid + 1, end);
            mergeGPA(arr, start, mid, end);
        }
    }

    private static void mergeGPA(List<Students> arr, int start, int mid, int end) {
        int i = start;
        int j = mid + 1;
        int k = 0;
        StundentComparatorGPA comparator = new StundentComparatorGPA();

        Students[] temp = new Students[end - start + 1];

        while ((i <= mid) && (j <= end)) {
            if (comparator.compare(arr.get(i), arr.get(j)) < 0)
//            if (arr.get(i).GPA < arr.get(j).GPA)
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
            Students e = temp[i - start];
            arr.add(i, e);
        }
    }
    public static void outArray(List <Students> arr){
        for(Students student : arr){
            student.print();
        }
    }
    public static void main(String[] args) {
        ArrayList<Students> arr1 = setArray1();
        ArrayList<Students> arr2 = setArray2();
        ArrayList<Students> arrfin = new ArrayList<Students>();
        for (int i = 0; i < 100; i++){
            arrfin.add(arr1.get(i));
            arrfin.add(arr2.get(i));
        }
        System.out.println("Первый список ");
        outArray(arr1);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Второй список ");
        outArray(arr2);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Финальный список ");

        mergeSortGPA(arrfin, 0, arrfin.size() - 1);
        outArray(arrfin);
    }
}
