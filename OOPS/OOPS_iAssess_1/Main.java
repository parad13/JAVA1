package OOPS.OOPS_iAssess_1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your choice:" +
                "\n1.Exhibition event" +
                "\n2.Stage event");
        int choice = in.nextInt();
        in.nextLine();

        System.out.print("Enter the details of ");
        if (choice == 1)
            System.out.println("exhibition:");
        else
            System.out.println("stage event:");
        String[] input = in.nextLine().split(",");

        System.out.println("Enter the starting date of the event:");
        String start = in.nextLine();

        System.out.println("Enter the ending date of the event:");
        String end = in.nextLine();

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date startDate = sdf.parse(start);
        Date endDate = sdf.parse(end);

        long milliDiff = endDate.getTime() - startDate.getTime();
        long days = milliDiff / 86400000;

        Event e;
        if(choice == 1)
            e = new Exhibition(input[0], input[1], input[2], input[3], Double.parseDouble(input[4]), Integer.parseInt(input[5]));
        else
            e = new StageEvent(input[0], input[1], input[2], input[3], Double.parseDouble(input[4]), Integer.parseInt(input[5]));

        System.out.println("The GST to be paid is Rs." + e.getGST(days));
    }
}
