//parameterised constructor
import java.util.*;
public class Parameter{
   
   Parameter(String a,int b){
          System.out.println("value of variable="+b+"\n");
         System.out.println("mr/ms "+a+"\n");
    }
    void display(){
      System.out.print("\nHello to you!!! ");
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        Parameter o=new  Parameter("smruti",x);
       o.display();
    }
    
}