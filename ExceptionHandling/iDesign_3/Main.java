package ExceptionHandling.iDesign_3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the contact details");
        String[] input = in.nextLine().split(",");

        String mobile = input[0];
        String alternateMobile = input[1];

        ContactDetailBO cbo = new ContactDetailBO();
        try {
            cbo.validate(mobile, alternateMobile);
            ContactDetail contact = new ContactDetail(mobile, alternateMobile, input[2], input[3], input[4]);
            System.out.println(contact);
        } catch (DuplicateMobileNumberException e) {
            System.out.println("DuplicateMobileNumberException: Mobile number and alternate mobile number are same");
        }


    }
}
