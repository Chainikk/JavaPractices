package pr_32;

public class InternetOrdersManager {
    private QueueNode head;
    private QueueNode tail;
    private int size;

    public boolean add(Order order) {
        QueueNode newNode = new QueueNode(order);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            newNode.setPrev(tail);
            tail = newNode;
        }
        size++;
        return true;
    }

    public Order remove() {
        if (head == null) {
            return null;
        }
        Order removedOrder = head.getValue();
        head = head.getNext();
        if (head == null) {
            tail = null;
        } else {
            head.setPrev(null);
        }
        size--;
        return removedOrder;
    }

    public Order getOrder(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        QueueNode current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current.getValue();
    }

    public int itemsQuantity(String name) {
        int quantity = 0;
        QueueNode current = head;
        while (current != null) {
            Order order = current.getValue();
            quantity += order.itemQuantity(name);
            current = current.getNext();
        }
        return quantity;
    }

    public Order[] getOrders() {
        Order[] orders = new Order[size];
        QueueNode current = head;
        int index = 0;
        while (current != null) {
            orders[index] = current.getValue();
            current = current.getNext();
            index++;
        }
        return orders;
    }

    public int ordersQuantity() {
        return size;
    }
}
