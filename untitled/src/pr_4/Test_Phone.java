package pr_4;

import pr_4.Phone;

public class Test_Phone {
    public static void main(String[] args) {
        Phone phone1 = new Phone(111000001, "Iphone", 150);
        Phone phone2 = new Phone(111111110, "Samsung", 176);
        Phone phone3 = new Phone(101111001, "OnePlus", 183);

        System.out.println(phone1.toString());
        System.out.println(phone2.toString());
        System.out.println(phone3.toString());

        System.out.println("Номер: "+phone1.getNumber());
        phone1.receiveCall("Дмитрий");
        System.out.println("Номер: "+phone2.getNumber());
        phone1.receiveCall("Олег");
        System.out.println("Номер: "+phone3.getNumber());
        phone1.receiveCall("Константин");

        System.out.println("Номер: "+phone1.getNumber());
        phone1.receiveCall("Андрей", 1010101010);

        System.out.println("Список номеров, которым будет отправлено сообщение");
        int[] numbers = {111000001,111111110,101111001};
        phone1.sendMessage(numbers);
    }
}
