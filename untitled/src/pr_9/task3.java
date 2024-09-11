package pr_9;

import java.util.ArrayList;
import java.util.List;

class MergeSortedList {
    public static void main(String[] args) {
        List<Students> list1 = new ArrayList<>();
        list1.add(new Students("Alice", 20));
        list1.add(new Students("Hob", 18));
        list1.add(new Students("Ilaire", 19));

        List<Students> list2 = new ArrayList<>();
        list2.add(new Students("Dave", 21));
        list2.add(new Students("Eve", 22));
        list2.add(new Students("Frank", 20));

        List<Students> mergedList = mergeLists(list1, list2);
        System.out.println(mergedList);
    }

    public static List<Students> mergeLists(List<Students> list1, List<Students> list2) {
        ArrayList<Students> mergedList = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i).compareTo(list2.get(j)) < 0) {
                mergedList.add(list1.get(i));
                i++;
            }
            else {
                mergedList.add(list2.get(j));
                j++;
            }
        }

        while (i < list1.size()) {
            mergedList.add(list1.get(i));
            i++;
        }

        while (j < list2.size()) {
            mergedList.add(list2.get(j));
            j++;
        }

        return mergedList;
    }
}

class Students implements Comparable<Students> {
    private String name;
    private int age;

    public Students(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Students student) {
        return this.getName().compareTo(student.getName());
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}