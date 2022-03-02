public class TravelClass {
    String name,description;

    public TravelClass() {
    }

    public TravelClass(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TravelClassDAO {
    ArrayList<TravelClass> listAllTravelClassess() throws ClassNotFoundException, SQLException {
        
        ArrayList<TravelClass> travelClassList= new ArrayList<TravelClass>();
        DBConnection connec=new DBConnection();
		Connection con=connec.getConnection();
		 Statement statement = con.createStatement();
        ResultSet rs = statement.executeQuery("SELECT * FROM travel_class ORDER by name desc");
		  while(rs.next())
      	{	
			 // Integer id=rs.getInt("id");
			  String name=rs.getString("name");
			  String description=rs.getString("description");
			 


			  TravelClass obj=new TravelClass(name,description);
			  travelClassList.add(obj);

          	//System.out.println(rs.getString("title")+"  "+rs.getString("category")+"  "+rs.getString("author"));  
			  
          
      	}
		  //con.close();
        return travelClassList;
    }
    public void updateDetail(String name, String description) throws ClassNotFoundException, SQLException {
    	//fill your code here
		DBConnection connec=new DBConnection();
		Connection con=connec.getConnection();
		Statement statement = con.createStatement();
       String query1 = "UPDATE travel_class SET description='"+description+"' WHERE name= '"+name+"' ";
		statement.executeUpdate( query1);
		//con.close();



    }
}
import java.sql.*;
import java.util.ResourceBundle;
public class DBConnection {
	public static Connection getConnection() throws ClassNotFoundException, SQLException {        
        ResourceBundle rb = ResourceBundle.getBundle("oracle");
        String url = rb.getString("db.url");
        String username = rb.getString("db.username");
        String password = rb.getString("db.password");
        //fill your code here
         DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        Connection con = DriverManager.getConnection(url, username, password);
        
		return con;
        
    }
}
import java.io.*;
import java.sql.SQLException;
import java.util.ArrayList;


public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         ArrayList<TravelClass> travelclass_list=new ArrayList<TravelClass>();
        System.out.println("Enter the name of TravelClass :");
        String name = br.readLine();
        System.out.println("Enter the description to update :");
        String description = br.readLine();
        TravelClassDAO obj=new TravelClassDAO();
       obj.updateDetail(name,description);
        travelclass_list=obj.listAllTravelClassess();
        
        System.out.println("Updated List of Travel Classes");
        System.out.format("%-25s %s\n","Name","Description");
        for(TravelClass travelclass:travelclass_list)
        {
         System.out.format("%-25s %s\n",travelclass.getName(),travelclass.getDescription());
        }

        

        //fill your code here
    }
}