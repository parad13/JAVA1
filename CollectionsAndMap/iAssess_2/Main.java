// package CollectionsAndMap.iAssess_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of User details to be added");
        int n = in.nextInt();
        in.nextLine();

        UserBO list = new UserBO();
        list.addAll(UserBO.getList());

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the user " + (i + 1) + " detail in csv format");
            String[] input = in.nextLine().split(",");
            User u = new User(input[0], input[1], input[2], input[3]);
            list.add(u);
        }

        System.out.println("Name                Contact Number      Username            Email               ");

        for (User u : list) {
            u.display();
        }

        System.out.println("Enter the range to be removed from array list");
        int n1 = in.nextInt();
        int n2 = in.nextInt();

        list.removeUser(n1, n2);

        System.out.println("Name                Contact Number      Username            Email               ");
        for (User u : list) {
            u.display();
        }


    }
}
