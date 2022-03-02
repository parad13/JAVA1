package FundamentalClasses.iDesign_2;

public class Item {
    private String name;
    private String type;
    private int cost;
    private int availableQuantity;

    public Item(String name, String type, int cost, int availableQuantity) {
        this.name = name;
        this.type = type;
        this.cost = cost;
        this.availableQuantity = availableQuantity;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getCost() {
        return cost;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    @Override
    public String toString() {
        return name + ',' +
                type + ',' +
                cost + ',';
    }
}
