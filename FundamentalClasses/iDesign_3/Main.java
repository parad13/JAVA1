package FundamentalClasses.iDesign_3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the date to be formatted:(MM-dd-yyyy)");
        String input = in.nextLine();

        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
        SimpleDateFormat sdf1 = new SimpleDateFormat("EEE, MMM d, yy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd.MM.yyyy");
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy");

        Date date = null;
        try {
            date = sdf1.parse(input);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println("Date Format with EEE, MMM d, yy : " + sdf1.format(date) +
                "\nDate Format with dd.MM.yyyy : " + sdf2.format(date) +
                "\nDate Format with dd dd/MM/yyyy : " + sdf3.format(date));
    }
}
