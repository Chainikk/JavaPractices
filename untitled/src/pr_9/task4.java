package pr_9;


class Sstudent implements Comparable<Sstudent>{
    public int GPA;
    public String name;

    public Sstudent(int GPA, String name) {
        this.GPA = GPA;
        this.name = name;
    }

    @Override
    public int compareTo(Sstudent o) {
        return this.name.compareTo(o.name) + (this.GPA-o.GPA);
    }
}

class task4{
    public static void main(String[] args) {
        Sstudent first = new Sstudent(63, "Kyle");
        Sstudent second = new Sstudent(93, "Key");

        System.out.println(first.compareTo(second));

        first = new Sstudent(45, "Kyle");
        second = new Sstudent(45, "Kyle");

        System.out.println(first.compareTo(second));

    }
}

