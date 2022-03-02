// Main.java
import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double celsius , Fahrenheit;
		System.out.println("Temparature in Celsius:");
		celsius = sc.nextFloat();

		 Fahrenheit =( (celsius*9) / 5 ) + 32;
		System.out.println("Temparature in Fahrenheit is " + Fahrenheit + "F");

	}

}