package pr_30;

public class InternetOrder implements Order, OrdersManager{
    private int size;
    private ListNode head;
    private ListNode tail;

    public InternetOrder() {
        size = 0;
        head = null;
        tail = null;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean add(MenuItem item) {
        ListNode newNode = new ListNode(null, item);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
        size++;
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

    public MenuItem remove() {
        if (isEmpty()) {
            throw new IllegalStateException("Order is empty");
        }
        MenuItem removedItem = head.getValue();
        head = head.getNext();
        size--;
        if (isEmpty()) {
            tail = null;
        }
        return removedItem;
    }

    public MenuItem[] getItems() {
        MenuItem[] items = new MenuItem[size];
        ListNode currentNode = head;
        int index = 0;
        while (currentNode != null) {
            items[index] = currentNode.getValue();
            currentNode = currentNode.getNext();
            index++;
        }
        return items;
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
