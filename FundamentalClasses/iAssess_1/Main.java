// package FundamentalClasses.iAssess_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("DH", "DEL");
        map.put("MB", "MUB");
        map.put("KL", "KOL");

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the code");
        String code = in.nextLine();
        StringBuilder sb = new StringBuilder(code);
        String s = sb.substring(0,2);
        int i = Integer.parseInt(code.substring(2));
        sb.replace(0,2,map.get(s));
        sb.replace(3, sb.length(), String.format("%05d", i));

        System.out.println("Formatted code\n" + sb);
    }
}
