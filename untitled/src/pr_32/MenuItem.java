package pr_32;

public class MenuItem {
    private int cost;
    private String name;
    private String description;

    public MenuItem(int cost, String name, String description) {
        this.cost = cost;
        this.name = name;
        this.description = description;
    }

    public MenuItem(String s, double v) {
    }

    public int getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getCostO() {
        return cost;
    }

    public String getName0() {
        return name;
    }

    public String getDescription0() {
        return description;
    }
}
