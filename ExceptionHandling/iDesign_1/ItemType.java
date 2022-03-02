package ExceptionHandling.iDesign_1;

public class ItemType {
    String name;
    double deposit;
    double costPerDay;

    public ItemType(String name, double deposit, double costPerDay) {
        this.name = name;
        this.deposit = deposit;
        this.costPerDay = costPerDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getCostPerDay() {
        return costPerDay;
    }

    public void setCostPerDay(double costPerDay) {
        this.costPerDay = costPerDay;
    }

    @Override
    public String toString() {
        return "The details of the item type are:" +
                "\nName:" + this.name +
                "\nDeposit:" + this.deposit +
                "\nCost Per Day:" + this.costPerDay;
    }
}
