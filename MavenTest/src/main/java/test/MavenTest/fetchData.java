package test.MavenTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class fetchData {
	public static void main(String[] args) throws Exception {

	      // variables
	      final String url = "jdbc:mysql:///testdb";
	      final String user = "root";
	      final String password = "fast";

	      // establish the connection
	      Connection con = DriverManager.getConnection(url, user, password);

	      // create JDBC statement object
	      Statement st = con.createStatement();
	      // statement is an interface and createstatement returns instance of statement

	      // prepare SQL query
	      //String query = "SELECT ID, NAME FROM student where id = 12";
	      //String query = "SELECT ID, NAME FROM student";
	      String query = "SELECT * FROM users ";

	      // send and execute SQL query in Database software
	      ResultSet rs = st.executeQuery(query); //st.executeQuery(query) will return data in tabular structure with column name and data , ResultSet have power to store chunk of data in tabular structure

	      // process the ResultSet object
	      
	      while (rs.next()) //by default the pointer is pointing the previous record w/o next it will give you error
	      {
	         
	         System.out.println(rs.getString(1) + " " + rs.getString(2));
	      }
	      //you can also mention column name rs.getInt("id")

	      

	      // close JDBC objects
	      rs.close();
	      st.close();
	      con.close();

	   } 
	}
