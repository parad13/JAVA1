// package CollectionsAndMap.iAssess_1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of users:");
        int n = in.nextInt();
        in.nextLine();

        Set<User> set = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details of user" + (i + 1));

            System.out.println("Username:");
            String username = in.nextLine();
            System.out.println("Bank name:");
            String bankname = in.nextLine();

            set.add(new User(username, bankname));
        }

        System.out.println("Enter username(Expire in one month) seperated by comma");
        String[] input = in.nextLine().split(",");

        System.out.println("Users going to expire within a month");
        ArrayList<User> toRetain = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {
            toRetain.add(new User(input[i], null));
        }

        set.retainAll(toRetain);

        int i = 1;
        for (User u : set) {
            System.out.println("User " + (i++));
            System.out.println("User Name = " + u.getUsername());
            System.out.println("Bank Name = " + u.getBankname());
        }
    }
}
