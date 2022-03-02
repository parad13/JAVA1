package FundamentalClasses.iDesign_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of items:");
        int n = in.nextInt();
        in.nextLine();

        System.out.println("Enter the item details in the format(Item Name$Item Type$Item Cost$Item Availability)");
        Item[] array = new Item[n];
        for (int i = 0; i < n; i++) {
            String[] input = in.nextLine().split("[$]");
            Item item = new Item(input[0], input[1], Integer.parseInt(input[2]), Integer.parseInt(input[3]));
            array[i] = item;
        }

        System.out.println("items:");
        for(int i=0;i<n;i++){
            Item item = array[i];
            StringBuilder sb = new StringBuilder(item.toString());
            if(item.getAvailableQuantity() > 0)
                System.out.println(sb.append("Available"));
            else
                System.out.println(sb.append("Not Available"));
        }
    }
}
