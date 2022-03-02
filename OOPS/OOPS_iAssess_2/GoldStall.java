// package OOPS.OOPS_iAssess_2;

public class GoldStall implements Stall {
    private String stallName;
    private int cost;
    private String ownerName;
    private int tvSet;

    public GoldStall() {
        this.stallName = this.ownerName = "";
        this.cost = this.tvSet = 0;
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

    public void setTvSet(int tvSet) {
        this.tvSet = tvSet;
    }

    public GoldStall(String stallName, int cost, String ownerName, int tvSet) {
        this.stallName = stallName;
        this.cost = cost;
        this.ownerName = ownerName;
        this.tvSet = tvSet;
    }

    @Override
    public void display() {
        System.out.println("Stall Name:" + this.stallName
                + "\nCost:" + this.cost + ".Rs"
                + "\nOwner Name:" + this.ownerName
                + "\nNumber of TV sets:" + this.tvSet);
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

    public int getTvSet() {
        return tvSet;
    }
}
