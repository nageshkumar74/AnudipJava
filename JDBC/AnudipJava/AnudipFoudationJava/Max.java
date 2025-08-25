public class Max{

    public static void main(String [] args ){
        int a=12,b=10,c=5,max;

        if (a>=b && a>=c){
            max=a;
        }
        else if (b>=a && b>=c){
            max=b;
        } 
        else {
            max=c;
        }

        System.out.println("Maximum: "+max);
    }
}