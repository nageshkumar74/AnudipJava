public class LeapYear {
    public static void main(String [] args){

        int year=2000;

        if (year % 4 ==0 )){
            System.out.println(" This is Leap Year "+year);
        }
        else System.out.println(" This is Not Leap Year "+year);
    }
}