// package OOPS.OOPS_iAssess_2;

public class PremiumStall implements Stall{
    private String stallName;
    private int cost;
    private String ownerName;
    private int projector;

    public PremiumStall() {
        this.stallName = this.ownerName = "";
        this.cost = this.projector = 0;
    }


    public PremiumStall(String stallName, int cost, String ownerName, int projector) {
        this.stallName = stallName;
        this.cost = cost;
        this.ownerName = ownerName;
        this.projector = projector;
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

    public void setProjector(int projector) {
        this.projector = projector;
    }

    @Override
    public void display() {
        System.out.println("Stall Name:" + this.stallName
                + "\nCost:" + this.cost + ".Rs"
                + "\nOwner Name:" + this.ownerName
                + "\nNumber of Projectors:" + this.projector);
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

    public int getProjector() {
        return projector;
    }
}
