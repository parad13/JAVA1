// package CollectionsAndMap.iAssess_3;

import java.util.TreeMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Map<state, Map<city, count>>
        Map<String, Map<String, Integer>> map = new TreeMap<>();

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of address:");
        int n = in.nextInt();
        in.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the address:");
            String[] input = in.nextLine().split(",");
            String state = input[2];
            String city = input[1];

            if (map.containsKey(state)) {
                Map<String, Integer> m = map.get(state);
                if (m.containsKey(city))
                    m.replace(city, m.get(city) + 1);
                else
                    m.put(city, 1);
            } else {
                Map<String, Integer> m = new TreeMap<>();
                m.put(city, 1);
                map.put(state, m);
            }
        }

        System.out.println("Number of entries in city/state wise:");
        for (String state : map.keySet()) {
            System.out.println("\nState:" + state);
            Map<String, Integer> m = map.get(state);
            for (String city : m.keySet()) {
                System.out.println("City:" + city + " " + "Count:" + m.get(city));
            }
        }
    }
}

/*

qq,ccc,dd,555
qq,ppp,zz,455
qq,eee,dd,555
qq,eee,dd,555
qq,eee,zz,544
qq,ttt,aa,252


* */