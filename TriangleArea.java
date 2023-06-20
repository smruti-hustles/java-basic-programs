//area of triangle using parameterised constructor
import java.util.*;
public class TriangleArea{
   
TriangleArea(int b,int h){
      System.out.print("area of triangle=");
         System.out.println((0.5)*b*h);
    }
    public static void main(String args[]){
      TriangleArea o=new TriangleArea(10,20);
    }
    
}