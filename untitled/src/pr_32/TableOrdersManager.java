package pr_32;

import java.util.HashMap;
import java.util.Map;

public class TableOrdersManager {
    private Map<Integer, Order> orders;

    public TableOrdersManager() {
        orders = new HashMap<>();
    }

    public void add(Order order, int tableNumber) {
        orders.put(tableNumber, order);
    }

    public void addItem(MenuItem item, int tableNumber) {
        Order order = orders.get(tableNumber);
        if (order != null) {
            order.add(item);
        }
    }

    public int freeTableNumber() {
        for (int tableNumber = 1; tableNumber <= 10; tableNumber++) {
            if (!orders.containsKey(tableNumber)) {
                return tableNumber;
            }
        }
        return -1; // All tables are occupied
    }

    public int freeTableNumbers() {
        return 10 - orders.size();
    }

    public Order getOrder(int tableNumber) {
        return orders.get(tableNumber);
    }

    public void remove(int tableNumber) {
        orders.remove(tableNumber);
    }

    public int remove(Order order) {
        int count = 0;
        for (Map.Entry<Integer, Order> entry : orders.entrySet()) {
            if (entry.getValue().equals(order)) {
                orders.remove(entry.getKey());
                count++;
            }
        }
        return count;
    }

    public int removeAll(Order order) {
        int count = 0;
        for (Map.Entry<Integer, Order> entry : orders.entrySet()) {
            if (entry.getValue().equals(order)) {
                orders.remove(entry.getKey());
                count++;
            }
        }
        return count;
    }

    public int itemsQuantity(String name) {
        int quantity = 0;
        for (Order order : orders.values()) {
            quantity += order.itemQuantity(name);
        }
        return quantity;
    }

    public int ordersCostSummary() {
        int totalCost = 0;
        for (Order order : orders.values()) {
            totalCost += order.costTotal();
        }
        return totalCost;
    }
}
