// JDBC i-Assess
// =======================
// User.java
import java.util.Date;
import java.text.*;
public class User {
	Integer id;
	String name;
	String email;
	String password;
	Integer age;
	String role;
	Date createdDate;
	String status;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Integer id, String name, String email, String password, Integer age, String role, Date createdDate,
			String status) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.age = age;
		this.role = role;
		this.createdDate = createdDate;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String toString(){
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
		return String.format("%-15s %-15s %-15s %-15s %-15s %-15s %-15s %s",id,name,email,password,age,role,sdf.format(createdDate),status);
	}	
}

// Main.java
import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;

public class Main{
    
    public static void main(String [] args) throws Exception{
        //fill your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Before the Delete");
        System.out.format("%-15s %-15s %-15s %-15s %-15s %-15s %-15s %s\n","Id","Name","Email","Password","Age","Role","CreatedDate","Status");
        UserDAO udao = new UserDAO();
		List<User> userList = udao.listUsers();
		for(User x : userList) System.out.println(x);
		
        System.out.println("Enter the Id :");
        udao.deleteUser(sc.nextInt());
        System.out.println("After the Delete");
		System.out.format("%-15s %-15s %-15s %-15s %-15s %-15s %-15s %s\n","Id","Name","Email","Password","Age","Role","CreatedDate","Status");
        
		userList = udao.listUsers();
        for(User x : userList) System.out.println(x);
    }

}

//UserDAO.java
import java.text.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.sql.*;
public class UserDAO{

    public ArrayList<User> listUsers() throws Exception{
    	ArrayList<User> userList = new ArrayList<User>();
    	//fill your code here
      Connection con = DBConnection.getConnection();
      Statement st = con.createStatement();
      ResultSet rs = st.executeQuery("select * from \"user\"");
	//   SimpleDateFormat sdf = new SimpleDateFormat("dd-MON-YYYY");
      while(rs.next()) {
      userList.add(new User(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),rs.getDate(7),rs.getString(8)));
      }
      return userList;
    }
    public void deleteUser(Integer id) throws Exception{
    	//fill your code here
        Connection con = DBConnection.getConnection();
      Statement st = con.createStatement();
       int updateCount=st.executeUpdate("delete from  \"user\" where id ="+id);

    }
    
}

// DBConnection.java
import java.sql.*;
import java.util.ResourceBundle;
public class DBConnection {
	public static Connection getConnection() throws ClassNotFoundException, SQLException {        
        ResourceBundle rb = ResourceBundle.getBundle("oracle");
        String url = rb.getString("db.url");
        String username = rb.getString("db.username");
        String password = rb.getString("db.password");
        //fill your code here
        Connection con = DriverManager.getConnection(url,username,password);
        return con;
    }
}