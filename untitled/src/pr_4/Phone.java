package pr_4;

public class Phone {
    private int number;
    private String model;
    private int weight;
    public Phone(int number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }
    public Phone() {}

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
    public void receiveCall(String name) {
        System.out.println("Звонит {"+name+"}");
    }
    public void receiveCall(String name, int number) {
        System.out.println("Звонит {"+name+": "+number+"}");
    }
    public void sendMessage(int[] numbers) {
        for (int i : numbers) {
            System.out.println(i);
        }
    }

    public int getNumber() {
        return number;
    }
}
