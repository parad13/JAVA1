// TicketBooking.java
class TicketBooking{
    private String customerName;
    private Integer noOfTickets;
    private Double price;
    
    TicketBooking(String customerName, Integer noOfTickets, Double price){
        this.customerName = customerName;
        this.noOfTickets = noOfTickets;
        this.price = price;
    }
    String getCustomerName(){
        return this.customerName;
    }
    Integer getNoOfTickets(){
        return this.noOfTickets;
    }
    Double getPrice(){
        return this.price;
    }
    public String toString() {
        return String.format("%-10s %-15s %-15s",customerName,noOfTickets,price);
    } 
}

// Main.java
import java.util.*; 
class Main
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of bookings");
        int n = sc.nextInt();
        List<TicketBooking> bookingList = new ArrayList<>();
        for(int i=0;i<n;i++){
            System.out.println("Enter customer name");
            String name = sc.next();
            System.out.println("Enter number of tickets");
            int noOfTickets = sc.nextInt();
            System.out.println("Enter the price");
            double price = sc.nextDouble();
            bookingList.add(new TicketBooking(name,noOfTickets,price));
        }
        System.out.println("Customer   No Of Tickets   Price          ");
        bookingList.stream().sorted((p1, p2)->{
            if(p1.getPrice() == p2.getPrice()) return 0;
            else if(p1.getPrice() > p2.getPrice()) return 1;
            else return -1;
            
        }).forEach((z)->System.out.println(z));
    }
}