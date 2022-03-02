package CollectionsAndMap.iDesign_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        String choice = "";
        do {
            System.out.println("Enter Email address");
            list.add(in.nextLine());
            System.out.println("Do you want to Continue?(yes/no)");
            choice = in.nextLine();
        } while (choice.equalsIgnoreCase("yes"));

        System.out.println("Enter the email addresses to be searched separated by comma");
        String[] input = in.nextLine().split(",");

        ArrayList<String> search = new ArrayList<>();
        Collections.addAll(search, input);

        if (list.containsAll(search))
            System.out.println("Email addresses are present");
        else
            System.out.println("Email addresses are not present");
    }
}
