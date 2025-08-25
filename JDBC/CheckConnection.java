import java.sql.Connection;

public class CheckConnection {
    public static void main(String[] args){

        ConnectDB cdb=new ConnectDB();
        try {
            Connection con=cdb.connectionDB();
            if(con!=null){
            System.out.println("Databse connected");
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
