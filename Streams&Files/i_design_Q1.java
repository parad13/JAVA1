// User.Java
public class User{
	//Your code here
	private String name ,email,username,password;
	User(String name, String email, String username, String password){
		this.name = name;
		this.email = email;
		this.username = username;
		this.password = password; 
	}
	void setName(String name){
		this.name = name;
	}
	void setPassword(String password){
		this.password = password;
	}
	void setEmail(String email){
		this.email = email;
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
	String getEmail(){
		return email;
	}
	String getUsername(){
		return username;
	}
}
// Main.java
import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws Exception {

		// InputStreamReader r = new InputStreamReader(input.csv);
		try{
		BufferedReader br=new BufferedReader(new FileReader("input.csv")) ;
		UserBO ubo = new UserBO();
		List<User> user = ubo.readFromFile(br);
		ubo.display(user);
		}
		catch(Exception e){
			
		}
	}
}
// UserBO.java
import java.io.*;
import java.util.*;
public class UserBO {
	//Your code here
	public List<User> readFromFile(BufferedReader br) throws Exception{
        List<User> a = new ArrayList<User>();
		
		String input = br.readLine();
		while(input != null){
			String[] data = input.split(",");
			a.add(new User(data[0],data[1],data[2],data[3]));
			input = br.readLine();
		}
        return a;
	}
	public void display(List<User> list){
		System.out.println("Name            Email                Username        Password");
		for(User x : list)
			System.out.println(String.format("%-15s %-20s %-15s %s",
			x.getName(),x.getEmail(),x.getUsername(),x.getPassword()));
	}
}