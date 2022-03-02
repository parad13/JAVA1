package OOPS.OOPS_iAssess_1;

public class Event {
    private String name;
    private String detail;
    private String type;
    private String ownerName;
    private double costPerDay;
    private double gst;


    public Event(String name, String detail, String type, String ownerName, double costPerDay, double gst) {
        this.name = name;
        this.detail = detail;
        this.type = type;
        this.ownerName = ownerName;
        this.costPerDay = costPerDay;
        this.gst = gst;
    }

    public double getCostPerDay() {
        return costPerDay;
    }

    public double getGst() {
        return gst;
    }

    protected double getGST(long days) {
        return (this.getGst() * this.getCostPerDay() * days)/100;
    }
}
