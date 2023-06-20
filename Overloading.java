//Method overloading
import java.util.*;
public class Overloading
{
   public static void sum(int x,int y){
       System.out.println("sum of x,y="+(x+y));
   }
   public static void sum(float a,float b,float c){
      System.out.println("sum of a,b,c="+(a+b+c));
   }
   public static void sum(String x,String y){
       System.out.println("concatination of strings="+(x+y));
   }
    public static void diff(int x,int y){
      System.out.println("diff between x,y="+(x-y));
    }
    public static int difference(int x,int y){
     return x-y;
    }
    
   public static void main(String args[]){
      // System.out.println(sum(10,20));
        //System.out.println(sum(10.5,20.5,67.98));
    sum(10,20);
    sum(10.5f,20.5f,67.98f);
    sum("suma","anjali");
    diff(100,20);
     System.out.println("difference between= "+difference(100,50));
   }
}
