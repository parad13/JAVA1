package CollectionsAndMap.iDesign_3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of address");
        int n = in.nextInt();
        in.nextLine();
        Map<String, ArrayList<Address>> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the address " + (i + 1) + " detail");
            String[] input = in.nextLine().split(",");
            Address a = new Address(input[0], input[1], input[2], input[3], input[4]);
            String city = input[2];
            if (map.containsKey(city)) {
                ArrayList<Address> l = map.get(city);
                l.add(a);
                map.replace(city, l);
            } else {
                ArrayList<Address> l = new ArrayList<>();
                l.add(a);
                map.put(city, l);
            }
        }

        System.out.println("Enter the city to be searched");
        String toSearchCity = in.nextLine();

        if (map.containsKey(toSearchCity)) {
            System.out.println("Line 1          Line 2          City            State           Pincode");
            ArrayList<Address> list = map.get(toSearchCity);
            for (Address a : list) {
                String line1 = a.getAddressLine1();
                String line2 = a.getAddressLine2();
                String city = a.getCity();
                String state = a.getState();
                String pincode = a.getPincode();

                System.out.printf("%-15s %-15s %-15s %-15s %s\n", line1, line2, city, state, pincode);
            }

        }else{
            System.out.println("Searched city not found");
        }


    }
}
