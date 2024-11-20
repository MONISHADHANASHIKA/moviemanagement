import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;

public class Getmovie {
	public static void get() throws Exception{
		String url="jdbc:mysql://127.0.0.1:3306/neww";
		String username="root";
		String password="1234";
		String Query ="select*from meow";
		Connection meow =DriverManager.getConnection(url,username,password);
		Statement pst  = meow.prepareStatement(Query);
		Statement st;
		ResultSet rs =st.executeQuery(Query);
		while(rs.next()) {
			System.out.println("id: "+rs.getInt(1));
			System.out.println("name: "+rs.getInt(2));
			System.out.println("age: "+rs.getInt(3));
			
			
		}
	
		
		meow.close();
		System.out.println("data getting");
	}

}
