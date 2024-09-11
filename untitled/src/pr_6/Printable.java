package pr_6;
interface Printable {
    void print();
}

class Book implements  Printable {
    protected String name;
    public Book(String name) {
        this.name = name;
    }
    public void print() {
        System.out.println("Book: "+name);
    }
}

class Shop implements Printable {
    protected String name;
    public Shop(String name) {
        this.name = name;
    }
    public void print() {
        System.out.println("Journal: "+name);
    }
}

class Task69 {
    public static void main(String[] args) {
        Printable[] mass = new Printable[4];
        mass[0] = new Book("1");
        mass[1] = new Shop("2");
        mass[2] = new Book("3");
        mass[3] = new Shop("4");
        for (Printable m : mass) m.print();
    }
}







