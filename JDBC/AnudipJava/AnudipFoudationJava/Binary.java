public class Binary{

    public static void main(String [] args){

        String  a="1010",b="1110";
        int num1=Integer.parseInt(a,2);
        int num2=Integer.parseInt(b,2);
       
        int sum=num1+num2;

        String binarySum=Integer.toBinaryString(sum);

        System.out.println(binarySum);

    }
}