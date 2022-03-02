package CollectionsAndMap.iDesign_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of halls:");
        int n = in.nextInt();
        in.nextLine();
        ArrayList<String> list = new ArrayList();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the Hall Name " + (i + 1));
            list.add(in.nextLine());
        }

        System.out.println("Enter the hall name to be searched:");
        String s = in.nextLine();

        if (list.contains(s))
            System.out.println(s + " hall is found in the list at position " + list.indexOf(s));
        else
            System.out.println(s + " hall is not found");
    }
}
