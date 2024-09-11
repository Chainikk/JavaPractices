package pr_3;

import pr_3.Currency_Convertor;

import java.util.Scanner;
public class Internet_Shop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Currency_Convertor object = new Currency_Convertor(90.0, 80.0);
        String[] assortment = {"Компьютер", "Планшет", "Смартфон"};
        Double[] base = {10000.0, 13243.0, 15577.1333};
        System.out.println("Ассортимент товара с ценой, указанной в рублях");
        for(int i = 0; i < assortment.length; i++){
            System.out.println((i+1) + ")   " + assortment[i] + "  -  " + base[i]);
        }
        System.out.print("Введите номер товара, который хотите приобрести ");
        int n = sc.nextInt();
        System.out.println("Выберите валюту для оплаты товара: 1 - рубль, 2 - евро, 3 - доллар");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Стоимость вашей покупки составляет " + base[n-1] + "; валюта - рубль");
                break;
            case 2:
                System.out.print("Стоимость вашей покупки составляет " + object.RubleToEuro(base[n-1]) + "; валюта - евро");
                break;
            case 3:
                System.out.print("Стоимость вашей покупки составляет " + object.RubleToDollar(base[n-1]) + "; валюта - доллар");
                break;
        }
    }
}
