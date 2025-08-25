import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDB {

    public  static Connection connectionDB() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/nagesh", "root", "root"
            );
            System.out.println("✅ Database connected successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }

    // 🔹 MAIN method for testing
    public static void main(String[] args) {
        ConnectDB db = new ConnectDB();
        Connection conn = db.connectionDB();

        if (conn != null) {
            System.out.println("🎉 Connection object is valid!");
        } else {
            System.out.println("❌ Failed to connect.");
        }
    }
}

