// package ExceptionHandling.iAssess_1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the stage event start date and end date");

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy-HH:mm:ss");
        try{
            String start = in.nextLine();
            Date startDate = sdf.parse(start);

            String end = in.nextLine();
            Date endDate = sdf.parse(end);

            System.out.println("Start date:" + sdf.format(startDate));
            System.out.println("End date:" + sdf.format(endDate));
        }catch (ParseException e){
            System.out.println("Input dates should be in the format 'dd-MM-yyyy-HH:mm:ss'");
        }


    }
}
