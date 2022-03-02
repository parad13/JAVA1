// Main.java
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Name :");
		char[] name = sc.next().toCharArray();
		String namestr = new String(name);

		System.out.println("Enter the Creator Name :");
		char[] creatorName = sc.next().toCharArray();
		String creatorstr = new String(creatorName);

		System.out.println("Enter the Purpose :");
		char[] purpose = sc.next().toCharArray();
		String purposestr = new String(purpose);

		System.out.println("Memory Space :");
		int space = sc.nextInt();

		System.out.println("Speed :");
		float speed = sc.nextFloat();

		System.out.println("My Details :");
		System.out.println("I am the Robot named " + namestr + ".");
		System.out.println("I was created by " + creatorstr + ".");
		System.out.println("I am created for the purpose of " + purposestr + ".");
		System.out.println("My memory space is around " + space + "Gb and my speed is " + speed + "Tb.");

	}

}