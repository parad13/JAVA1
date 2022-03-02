package OOPS.OOPS_iAssess_1;

public class StageEvent extends Event {
    private int noOfSeats;

    public StageEvent(String name, String detail, String type, String ownerName, double costPerDay, int noOfSeats) {
        super(name, detail, type, ownerName, costPerDay, 15);
        this.noOfSeats = noOfSeats;
    }
}
