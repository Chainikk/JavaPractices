package pr_30;

public class Main {
    public static void main(String[] args) {
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
                return 11.99;
            }
        };
        Order order2 = new Order() {
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
                return 20.99;
            }
        };

        // Создаем объекты пунктов меню
        MenuItem item1 = new MenuItem("Item 1", 6.00);
        MenuItem item2 = new MenuItem("Item 2", 5.99);
        MenuItem item3 = new MenuItem("Item 3", 10.99);
        MenuItem item4 = new MenuItem("Item 4", 10.00);


        // Добавляем пункты меню в заказы
        order1.add(item1);
        order2.add(item2);

        // Выводим информацию о заказах
        System.out.println("Quantity of item1 in internet orders: " + order1.itemQuantity(item1));
        System.out.println("Quantity of item2 in table orders: " + order2.itemQuantity(item2));
        System.out.println("Total quantity of internet orders: " + order1.itemsQuantity());
        System.out.println("Total quantity of table orders: " + order2.itemsQuantity());
        System.out.println("Total cost of internet orders: " + order1.costTotal());
        System.out.println("Total cost of table orders: " + order2.costTotal());
    }
}
