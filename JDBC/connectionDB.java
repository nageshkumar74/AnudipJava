import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDB 
{
	public static Connection connectDB()
	{
		Connection con = null;
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/nagesh", "root","root");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		return con;
		
	}

}

