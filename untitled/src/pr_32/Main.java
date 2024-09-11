package pr_32;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            // Read orders from the file
            File file = new File("C:\\Users\\akano\\OneDrive\\Рабочий стол\\Orders.txt");
            Scanner scanner = new Scanner(file);

            // Create objects for each order
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] orderData = line.split(",");
                Order order = new Order() {
                    @Override
                    public boolean add(MenuItem item) {
                        return true;
                    }

                    @Override
                    public String[] itemsNames() {
                        return new String[0];
                    }

                    @Override
                    public int itemsQuantity() {
                        return 0;
                    }

                    @Override
                    public int itemQuantity(String itemName) {
                        return 0;
                    }

                    @Override
                    public int itemQuantity(MenuItem item) {
                        return 0;
                    }

                    @Override
                    public MenuItem[] getItems() {
                        return new MenuItem[0];
                    }

                    @Override
                    public boolean remove(String itemName) {
                        return false;
                    }

                    @Override
                    public boolean remove(MenuItem item) {
                        return false;
                    }

                    @Override
                    public int removeAll(String itemName) {
                        return 0;
                    }

                    @Override
                    public int removeAll(MenuItem item) {
                        return 0;
                    }

                    @Override
                    public MenuItem[] sortedItemsByCostDesc() {
                        return new MenuItem[0];
                    }

                    @Override
                    public Customer getCustomer() {
                        return null;
                    }

                    @Override
                    public void setCustomer(Customer customer) {

                    }

                    @Override
                    public double costTotal() {
                        return 0;
                    }
                };
                // Process the order
                // ...
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // Создаем объекты заказов
        Order order1 = new Order() {
            @Override
            public boolean add(MenuItem item) {
                return true;
            }

            @Override
            public String[] itemsNames() {
                return new String[3];
            }

            @Override
            public int itemsQuantity() {
                return 5;
            }

            @Override
            public int itemQuantity(String itemName) {
                return 2;
            }

            @Override
            public int itemQuantity(MenuItem item) {
                return 2;
            }

            @Override
            public MenuItem[] getItems() {
                return new MenuItem[2];
            }

            @Override
            public boolean remove(String itemName) {
                return false;
            }

            @Override
            public boolean remove(MenuItem item) {
                return false;
            }

            @Override
            public int removeAll(String itemName) {
                return 0;
            }

            @Override
            public int removeAll(MenuItem item) {
                return 0;
            }

            @Override
            public MenuItem[] sortedItemsByCostDesc() {
                return new MenuItem[0];
            }

            @Override
            public Customer getCustomer() {
                return null;
            }

            @Override
            public void setCustomer(Customer customer) {

            }

            @Override
            public double costTotal() {
                return 23.00;
            }
        };

        // Создаем объекты пунктов меню
        MenuItem item1 = new MenuItem("Item 1", 10.99);
        MenuItem item2 = new MenuItem("Item 2", 5.99);
        MenuInternet item4 = new MenuInternet("Item 4", 10.89);

        // Добавляем пункты меню в заказы
        order1.add(item1);
        order1.add(item2);
        // Выводим информацию о заказах
        System.out.println("Quantity of item1 in internet orders: " + order1.itemQuantity(item1));
        System.out.println("Total quantity of internet orders: " + order1.itemsQuantity());
        System.out.println("Total cost of internet orders: " + order1.costTotal());
    }
}
