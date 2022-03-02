package OOPS.OOPS_iAssess_1;

public class Exhibition extends Event {
    private int noOfStalls;

    public Exhibition(String name, String detail, String type, String ownerName, double costPerDay, int noOfStalls) {
        super(name, detail, type, ownerName, costPerDay, 5);
        this.noOfStalls = noOfStalls;
    }
}
