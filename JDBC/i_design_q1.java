// Book.java
public class Book {
	Integer id;
	String title;
	String category;
	String author;
	Double price;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(Integer id, String title, String category, String author, Double price) {
		super();
		this.id = id;
		this.title = title;
		this.category = category;
		this.author = author;
		this.price = price;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
}

// BookDAO.java
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class BookDAO {
	public ArrayList<Book> listBooks() throws ClassNotFoundException, SQLException{
    	ArrayList<Book> bookList = new ArrayList<Book>();
		DBConnection connec=new DBConnection();
		Connection con=connec.getConnection();
		 Statement statement = con.createStatement();
        ResultSet rs = statement.executeQuery("SELECT * FROM BOOK");
		  while(rs.next())
      	{	
			  Integer id=rs.getInt("id");
			  String title=rs.getString("title");
			  String category=rs.getString("category");
			  String author =rs.getString("author");
			  Double price=rs.getDouble("Price");


			  Book obj=new Book(id,title,category,author,price);
			  bookList.add(obj);
          	//System.out.println(rs.getString("title")+"  "+rs.getString("category")+"  "+rs.getString("author"));  
			  
          
      	}

    	//fill your code here
		return bookList;
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
        DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        Connection con = DriverManager.getConnection(url, username, password);
        //Statement statement = con.createStatement();
        //ResultSet rs = statement.executeQuery("SELECT * FROM BOOK");
		return con;
         

        //fill your code here
    }
}

// Main.java
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception
    {
        
        //fill your code here
        BookDAO bookdao=new BookDAO();
        System.out.println("List of Books");
        System.out.format("%-5s %-20s %-20s %-10s %s\n","Id","Title","Category","Author","Price");
       // System.out.println("Id       Title          Category       Author      Price");



        ArrayList<Book> listBooks=new ArrayList<Book>();

        listBooks=bookdao.listBooks();
        for(Book book:listBooks){
            Integer id=book.getId();
            String title=book.getTitle();
            String category=book.getCategory();
            String author=book.getAuthor();
            Double price=book.getPrice();
            System.out.format("%-5s %-20s %-20s %-10s %s\n",id,title,category,author,price);

        }

        

    }
}