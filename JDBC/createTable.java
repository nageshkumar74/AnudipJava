import java.sql.Connection;
import java.sql.Statement;

public class createTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConnectDB condb=new ConnectDB();
		
		try
		{
			Connection con=condb.connectionDB();

			if(con!=null)
			{
				System.out.println("Connected succesfully");
				Statement stmt=con.createStatement();
				String qur="create table User1(uid int primary key,uname varchar(30),address varchar(50))";
				stmt.execute(qur);
				
				System.out.println("Table created successfully");
				
				con.close();
	
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		

	}

}
