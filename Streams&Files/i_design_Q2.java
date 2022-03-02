// User.Java
public class User {
	//write your code here
	private String name ,mobileNumber,username,password;
	User(String name, String mobileNumber, String username, String password){
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.username = username;
		this.password = password; 
	}
	void setName(String name){
		this.name = name;
	}
	void setPassword(String password){
		this.password = password;
	}
	void setMobileNumber(String mobileNumber){
		this.mobileNumber= mobileNumber;
	}
	void setUsername(String username){
		this.username = username;
	}
	String getName(){
		return name;
	}
	String getPassword(){
		return password;
	}
	String getMobileNumber(){
		return mobileNumber;
	}
	String getUsername(){
		return username;
	}
}
// Main.java
import java.io.*;
import java.util.*;
public class Main {
	public static void main(String args[]) throws Exception {
		//write your code here
		FileWriter wr = new FileWriter("output.csv");
		BufferedWriter bw = new BufferedWriter(wr);
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br  = new BufferedReader(r);
		System.out.println("Enter the number of users:");
		int n = Integer.parseInt(br.readLine());
		ArrayList<User> arr = new ArrayList<>();
		for(int i=1;i<n+1;i++){
			System.out.println("Enter the details of user :"+i);
			String[] data = br.readLine().split(",");
			arr.add(new User(data[0],data[1],data[2],data[3]));
		}
		UserBO.writeFile(arr,bw);
	}
}
// UserBO.java
import java.io.*;
import java.util.*;
public class UserBO {

	public static void writeFile(ArrayList<User> userList, BufferedWriter bw) throws Exception {
		//write your code here
		for(User x : userList){
			String data  = x.getName() +","+ x.getMobileNumber() +","+x.getUsername() +"," +x.getPassword();
			bw.write(data,0,data.length());
			bw.newLine();
		}
		bw.flush();
	}
}