import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Firstprogram {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/firstdb";
        String user = "root";
        String password = "root";
            try {
                // Load MySQL JDBC driver
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                System.out.println("MySQL JDBC Driver not found.");
                e.printStackTrace();
                return;
            }
            try (Connection conn = DriverManager.getConnection(url, user, password);
                 Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery("SELECT * FROM students")) {

                System.out.println("✅ Connected to MySQL!");
                while (rs.next()) {
                    System.out.println(rs.getInt("id") + " | "
                            + rs.getString("name") + " | "
                            + rs.getInt("age") + " | "
                            + rs.getString("email"));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
               
    }
}
   
