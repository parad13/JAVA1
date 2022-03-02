// import java.lang.Math;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the numbers :");
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int num3 = in.nextInt();
		if (num1 >= num2 && num1 >= num3)
        	 System.out.println( num1 + " is the greatest number");
      	else if (num2 >= num1 && num2 >= num3)
        	 System.out.println( num2 + " is the greatest number");
      	else
        	 System.out.println( num3 + " is the greatest number");
		// String max_num = new String(Math.max(num1, Math.max(num2, num3)));
		// System.out.println(max_num + " is the greatest number");
	}
}
