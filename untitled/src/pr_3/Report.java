package pr_3;

import pr_3.Employee;

import java.util.ArrayList;
import java.util.Scanner;
public class Report {
    public static void main(String[] args){
        ArrayList <Employee> mas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество сотрудников ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.println("Ввод данных о сотруднике номер " + (i+1));
            System.out.print("Введите ФИО ");
            sc = new Scanner(System.in);
            String name = sc.nextLine();
            System.out.print("Введите заработную плату ");
            sc = new Scanner(System.in);
            Double salary = sc.nextDouble();
            Employee object = new Employee(name, salary);
            mas.add(object);
        }
        System.out.println("Список сотрудников и их ЗП");
        Generate_Report(mas, n);
    }
    public static void Generate_Report(ArrayList <Employee> mas, int n){
        for(int i = 0; i < n; i++){
            //System.out.println((i+1) + ")" + "     Сотрудник: " + mas.get(i).getName() + "\n" + "Заработная плата: " + mas.get(i).getSalary());
            System.out.printf("%-40s%.2f\n", mas.get(i).getName(),mas.get(i).getSalary());

        }
    }
    /*System.out.println("Список сотрудников и их ЗП");
    System.out.println(mas);*/
}
