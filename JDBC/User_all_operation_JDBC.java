
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class User_all_operation_JDBC {

    Scanner sc = new Scanner(System.in);
    Connection con = ConnectDB.connectionDB();
    String qur, uid, upass;

    public void addUser() {

        try {
            qur = "insert into login values(? ,?)";

            System.out.println("Enter the Userid and password");
            uid = sc.next();
            upass = sc.next();
            PreparedStatement ps = con.prepareStatement(qur);
            ps.setString(1, uid);
            ps.setString(2, upass);
            ps.execute();
            System.out.println("User Added Sucessfully");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void updateUser() {
        try {
            qur = "update login set upass=?  where uid=?";

            System.out.println("Password you want to update");

            upass = sc.next();
            System.out.println("Enter the User id");
            uid = sc.next();
            PreparedStatement ps = con.prepareStatement(qur);
            ps.setString(1, upass);
            ps.setString(2, uid);
            ps.execute();
            System.out.println("Data updated Suceessfully");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleteUser() {
        try {
            qur = "delete from login where uid=?";
            System.out.println("Enter the User id you want to delete");
            uid = sc.next();
            PreparedStatement ps = con.prepareStatement(qur);
            ps.setString(1, uid);
            ps.execute();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void viewUser() {
        try {

            qur = "select * from login";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(qur);
            System.out.println("All Data as follows");
            while (rs.next()) {
                System.out.println(rs.getString(1) + "\t" + rs.getString(2));
            }

        } catch (Exception e) {
            System.out.print(e.getMessage());
        }

    }


    public void selectviewUser() {
        try {
            qur = "select upass from login where uid=?";
            PreparedStatement ps = con.prepareStatement(qur);
            System.out.println("Enter the Uid you want to see details");

            uid = sc.next();

            ps.setString(1, uid);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                String upass = rs.getString("upass");
                System.out.println("Password for uid " + uid + "is" + upass);
            } else {
                System.out.println("No such user" + uid);

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    
    }




