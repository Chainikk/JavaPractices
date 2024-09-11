package pr_32;

public interface Order {
    boolean add(MenuItem item);
    String[] itemsNames();
    int itemsQuantity();
    int itemQuantity(String itemName);
    int itemQuantity(MenuItem item);
    MenuItem[] getItems();
    boolean remove(String itemName);
    boolean remove(MenuItem item);
    int removeAll(String itemName);
    int removeAll(MenuItem item);
    MenuItem[] sortedItemsByCostDesc();
    Customer getCustomer();
    void setCustomer(Customer customer);
    double costTotal();

    class Default {
        public static String toString(Order order) {
            StringBuilder sb = new StringBuilder();
            sb.append("Order: ");
            for (MenuItem item : order.getItems()) {
                sb.append(item.toString()).append(", ");
            }
            return sb.toString();
        }
    }
}
