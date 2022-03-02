// package FundamentalClasses.iAssess_2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Enter the number of Events");
        int n = in.nextInt();
        in.nextLine();
        System.out.println("Enter event details in CSV(Event Name,Start Date,End Date) Date:dd/MM/yyyy");


        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        for (int i = 0; i < n; i++) {
            String[] details = in.nextLine().split(",");
            Date start = sdf.parse(details[1]);
            Date end = sdf.parse(details[2]);
            long noOfDays = TimeUnit.DAYS.convert(end.getTime() - start.getTime(), TimeUnit.DAYS);

            if (noOfDays == 0) {
                list.add(details[0]);
            }
        }

        System.out.println("1-day Events:");
        if (!list.isEmpty())
            for(String s : list)
                System.out.println(s);
        else
            System.out.println("No Events");
    }
}
/*
*
Reunion,28/02/2017,28/02/2017
Party,30/06/2017,05/07/2017
Wedding,23/10/2017,23/10/2017
* */