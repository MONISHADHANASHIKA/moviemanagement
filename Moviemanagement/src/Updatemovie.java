import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Updatemovie {
	public static void update1() throws Exception{
		String url="jdbc:mysql://127.0.0.1:3306/neww";
		String username="root";
		String password="1234";
		String Query = "update meow set name='mama' where id=102";
		Connection meow =DriverManager.getConnection(url,username,password);
		PreparedStatement pst  = meow.prepareStatement(Query);
		pst.executeUpdate();
		meow.close();
		System.out.println("data updated");

	}
	
	public static void main (String[]args)throws Exception{
		Updatemovie obj=new Updatemovie();
		obj.update1();
		
	}

}
	

	

