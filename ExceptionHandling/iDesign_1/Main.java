package ExceptionHandling.iDesign_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the Item type details:");
        System.out.println("Enter the name:");
        String name = in.nextLine();

        System.out.println("Enter the deposit:");
        String depositStr = in.nextLine();
        double deposit = 0;
        try {
            deposit = Double.parseDouble(depositStr);

            System.out.println("Enter the cost per day:");
            String costPerDayStr = in.nextLine();
            double costPerDay = 0;
            try {
                costPerDay = Double.parseDouble(costPerDayStr);
                ItemType i = new ItemType(name, deposit, costPerDay);
                System.out.println(i.toString());
            } catch (NumberFormatException e) {
                System.out.println("java.lang.NumberFormatException: For input string: \"" + costPerDayStr + "\"");
            }
        } catch (NumberFormatException e) {
            System.out.println("java.lang.NumberFormatException: For input string: \"" + depositStr + "\"");
        }
    }
}
