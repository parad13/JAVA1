// package ExceptionHandling.iAssess_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the user details");
        String[] input = in.nextLine().split(",");

        User u = new User(input[0], input[1], input[2], input[3]);

        try{
            UserBO.validate(u);
            System.out.println(u);
        }catch (WeakPasswordException e){
            System.out.println("WeakPasswordException: Your password is weak");
        }
    }
}
