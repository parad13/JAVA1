package ExceptionHandling.iDesign_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of seats to be booked:");
        int n = in.nextInt();
        int s = 0;

        try {
            if (n > 100 || n < 0)
                throw new ArrayIndexOutOfBoundsException();
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.println("Enter the seat number " + (i + 1));
                s = in.nextInt();
                if (s > 100 || s < 0)
                    throw new ArrayIndexOutOfBoundsException();
                else
                    array[i] = s;
            }

            System.out.println("The seats booked are:");
            for (int e : array)
                System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("java.lang.ArrayIndexOutOfBoundsException: " + (s - 1));
        }
    }
}
