 public class Airport {
	String iataAirportCode,name,city,country;

	public Airport() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Airport(String iataAirportCode, String name, String city, String country) {
		super();
		this.iataAirportCode = iataAirportCode;
		this.name = name;
		this.city = city;
		this.country = country;
	}

	public String getIataAirportCode() {
		return iataAirportCode;
	}

	public void setIataAirportCode(String iataAirportCode) {
		this.iataAirportCode = iataAirportCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
    
    
    
}
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class AirportDAO {
    public void insertAirport(Airport airportIns) throws ClassNotFoundException, SQLException{
         DBConnection connec=new DBConnection();
		Connection con=connec.getConnection();
		Statement statement = con.createStatement();
        String code=airportIns.getIataAirportCode();
        String name=airportIns.getName();
        String city=airportIns.getCity();
        String country=airportIns.getCountry();
        String query1 = "INSERT INTO airport(iata_airport_code,name,city,country_name) VALUES('"+code+"','"+name+"','"+city+"','"+country+"')";
        
		statement.executeUpdate( query1);
        //con.close();
        
        //fill your code
    }
    public ArrayList<Airport> listAirport() throws ClassNotFoundException, SQLException{
         DBConnection connec=new DBConnection();
         ArrayList<Airport> AirportList=new ArrayList<Airport>();
		Connection con=connec.getConnection();
		 Statement statement = con.createStatement();
        ResultSet rs = statement.executeQuery("SELECT * FROM airport ");
		  while(rs.next())
      	{	
			 // Integer id=rs.getInt("id");
             String iataAirportCode=rs.getString("iata_airport_code");
			  String name=rs.getString("name");
			  String city=rs.getString("city");
              String country=rs.getString("country_name");

			 


			   Airport obj=new Airport(iataAirportCode,name,city,country);
			  AirportList.add(obj);
              
          }
          con.close();
        
        //fill your code
        return AirportList;
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
        DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        Connection con = DriverManager.getConnection(url, username, password);
        
		return con;
    }
}
import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String countryName,airportCode,airportName,city;
        System.out.println("Enter the Airport Code :");
        ArrayList<Airport> airportlist=new ArrayList<Airport>();
        airportCode = br.readLine();
        System.out.println("Enter the Airport name :");
        airportName = br.readLine();
        System.out.println("Enter the City :");
        city = br.readLine();
	System.out.println("Enter the Country name :");
        countryName = br.readLine();
        Airport new_airport=new Airport(airportCode,airportName,city,countryName);
        AirportDAO obj=new AirportDAO();
        obj.insertAirport(new_airport);
        System.out.format("%-10s %-40s %-10s %s\n","IATA Code","Name","City","Country");

         airportlist=obj.listAirport();
         for(Airport airport:airportlist)
         {
             System.out.format("%-10s %-40s %-10s %s\n",airport.getIataAirportCode(),
             airport.getName(),airport.getCity(),airport.getCountry());
         }

        
        //fill your code
        
    }
}