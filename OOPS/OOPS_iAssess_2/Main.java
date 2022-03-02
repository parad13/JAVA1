// package OOPS.OOPS_iAssess_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Choose Stall Type\n" +
                "1)Gold Stall\n" +
                "2)Premium Stall\n" +
                "3)Executive Stall");
        int choice = in.nextInt();

        if (choice == 1) {
            in.nextLine();
            System.out.println("Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of TV sets)");
            String[] input = in.nextLine().split(",");
            GoldStall stall = new GoldStall();
            stall.setStallName(input[0]);
            stall.setCost(Integer.parseInt(input[1]));
            stall.setOwnerName(input[2]);
            stall.setTvSet(Integer.parseInt(input[3]));
            stall.display();
        } else if (choice == 2) {
            in.nextLine();
            String[] input;
            System.out.println("Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of Projectors)");
            input = in.nextLine().split(",");
            PremiumStall stall = new PremiumStall();
            stall.setStallName(input[0]);
            stall.setCost(Integer.parseInt(input[1]));
            stall.setOwnerName(input[2]);
            stall.setProjector(Integer.parseInt(input[3]));
            stall.display();
        } else if (choice == 3) {
            in.nextLine();
            String[] input;
            System.out.println("Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of Screens)");
            input = in.nextLine().split(",");
            ExecutiveStall stall = new ExecutiveStall();
            stall.setStallName(input[0]);
            stall.setCost(Integer.parseInt(input[1]));
            stall.setOwnerName(input[2]);
            stall.setScreen(Integer.parseInt(input[3]));
            stall.display();
        } else {
            System.out.println("Invalid Stall Type");
        }
    }
}
