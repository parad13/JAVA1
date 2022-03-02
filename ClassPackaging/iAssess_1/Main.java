// package ClassPackaging.iAssess_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Customer Address");
        System.out.println("Enter the street");
        String street = in.nextLine();
        System.out.println("Enter the city");
        String city = in.nextLine();
        System.out.println("Enter the pincode");
        int pincode = in.nextInt();
        in.nextLine();
        System.out.println("Enter the country");
        String country = in.nextLine();

        Address a = new Address(street, city, pincode, country);

        a.displayAddress();

    }
}
