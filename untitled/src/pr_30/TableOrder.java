package pr_30;

public class TableOrder implements Order, OrdersManager{
    private int size;
    private MenuItem[] items;

    public TableOrder() {
        size = 0;
        items = new MenuItem[10]; // Предполагаем, что заказ может содержать до 10 элементов
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean add(MenuItem item) {
        if (size < items.length) {
            items[size] = item;
            size++;
        } else {
            System.out.println("Order is full. Cannot add more items.");
        }
        return false;
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

    public MenuItem remove(int index) {
        if (index >= 0 && index < size) {
            MenuItem removedItem = items[index];
            for (int i = index; i < size - 1; i++) {
                items[i] = items[i + 1];
            }
            items[size - 1] = null;
            size--;
            return removedItem;
        } else {
            throw new IndexOutOfBoundsException("Invalid index");
        }
    }

    public MenuItem[] getItems() {
        MenuItem[] orderItems = new MenuItem[size];
        System.arraycopy(items, 0, orderItems, 0, size);
        return orderItems;
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

    @Override
    public int itemsQuantity(String itemName) {
        return 0;
    }

    @Override
    public int itemsQuantity(MenuItem item) {
        return 0;
    }

    @Override
    public Order[] getOrders() {
        return new Order[0];
    }

    @Override
    public int ordersCostSummary() {
        return 0;
    }

    @Override
    public int ordersQuantity() {
        return 0;
    }
}
