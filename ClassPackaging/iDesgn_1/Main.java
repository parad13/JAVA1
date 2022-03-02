package ClassPackaging.iDesgn_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the country name");
        String name = in.nextLine();

        System.out.println("Enter the country code");
        String countryCode = in.nextLine();

        System.out.println("Enter the isd code");
        String isd = in.nextLine();

        Country c = new Country(name, countryCode, isd);

        System.out.println("Country Name : " + c.getName() +
                "\nCountry Code : " + c.getCountryCode() +
                "\nISD Code : " + c.getIsdCode());

    }

}
