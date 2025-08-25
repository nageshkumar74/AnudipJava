class First {
    public static void main (String[] args){
    
        System.out.println("Hello World" );
        Second s= new Second("abc",100);
        Second s1=new Second("xyz",200);
        s.printP();
        s1.printP(); 
    }
}


class Second {
 String name; 
 int cost;

 public Second(String name,int cost){
    this.name=name;
    this.cost=cost;
 }  
 public void printP(){
    System.out.println("Name" + name);
        System.out.println("Cost" + cost);
 } 
}