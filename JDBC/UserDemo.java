import java.util.Scanner;

public class UserDemo {

    public static void main (String [] args){
        User_all_operation_JDBC obj=new User_all_operation_JDBC();
        Scanner sc= new Scanner (System.in);
        while (true){
            System.out.println("Enter your Chioce\n1.Add new User\n2.Update user\n3.Delete\n4.View User\n5.viewSelectedUser");
             int chioce=sc.nextInt();
             switch(chioce){
                case 1:obj.addUser();
                        break;
                case 2:obj.updateUser();

                       break;
                 case 3: obj.deleteUser();
                        break;
                 case 4:obj.viewUser();
                        break;
                 case 5:obj.selectviewUser();
                        break;       
                default: System.exit(0);
                         break;                         

             }
        }

    }

}