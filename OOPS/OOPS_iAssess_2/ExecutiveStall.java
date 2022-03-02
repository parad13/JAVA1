package OOPS.OOPS_iAssess_2;

public class ExecutiveStall implements Stall{
    private String stallName;
    private int cost;
    private String ownerName;
    private int screen;

    public ExecutiveStall() {
        this.stallName = this.ownerName = "";
        this.cost = this.screen = 0;
    }

    public ExecutiveStall(String stallName, int cost, String ownerName, int screen) {
        this.stallName = stallName;
        this.cost = cost;
        this.ownerName = ownerName;
        this.screen = screen;
    }

    @Override
    public void display() {
        System.out.println("Stall Name:" + this.stallName
                            + "\nCost:" + this.cost + ".Rs"
                            + "\nOwner Name:" + this.ownerName
                            + "\nNumber of Screens:" + this.screen);
    }

    public String getStallName() {
        return stallName;
    }

    public int getCost() {
        return cost;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getScreen() {
        return screen;
    }

    public void setStallName(String stallName) {
        this.stallName = stallName;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setScreen(int screen) {
        this.screen = screen;
    }
}
