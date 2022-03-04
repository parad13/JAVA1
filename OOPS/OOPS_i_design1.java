// Department.java
public class Department {
	//write your code here
	private Staff staff;
	private String departmentName;
	Department(String a, String b,  String c){
		staff = new Staff(a,b);
		departmentName = c;
	}
	public void display() {
		//write your code here

	}
	public void displayStaff(){
		System.out.println(staff.getStaffName() +" is working in the "+departmentName+" department as "+staff.getDesignation());
	}
}

// Main.java
import java.util.*;
public class Main {
	public static void main(String args[]) {
		//write your code here
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the staff:");
		String name = sc.nextLine();
		System.out.println("Enter the staff designation:");
		String designation = sc.nextLine();
		System.out.println("Enter the department name:");
		String department = sc.nextLine();
		Department x = new Department(name,designation,department);
		x.displayStaff();
		}
}

// Staff.java
public class Staff {
	//write your code here
	private String staffName;
	private String designation;
	Staff(String a,String b){
		staffName = a;
		designation = b;
	}
	public String getStaffName(){
		return staffName;
	}
	public String getDesignation(){
		return designation;
	}

}
