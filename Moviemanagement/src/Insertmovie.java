import java.sql.*;

public class Insertmovie {
	public static void insert() throws Exception{
		String url="jdbc:mysql://127.0.0.1:3306/neww";
		String username="root";
		String password="1234";
		String Query ="insert into meow values(?,?,?)";
		Connection meow =DriverManager.getConnection(url,username,password);
		PreparedStatement pst  = meow.prepareStatement(Query);
		pst.setInt(1,102);
		pst.setString(2,"momo");
		pst.setInt(3, 14);
		pst.executeUpdate();
		meow.close();
		System.out.println("data inserted");
	}
	
	public static void main (String[]args)throws Exception{
		Insertmovie obj=new Insertmovie();
		obj.insert();
		
	}
	

}
